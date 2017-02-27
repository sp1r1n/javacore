package com.sp1r1n.app.homework.lesson11;

import com.sp1r1n.app.homework.lesson10.ArrayParser;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.Files.exists;

/**
 * Created by DELL on 2/23/2017.
 */
public class FileWorker {

    //private String path;

    /*public FileWorker(String path){
        this.path = path;
    }*/

    public String pathFix(String inputPath){
        ArrayParser arrayParser = new ArrayParser();
        String[] arrayPath = arrayParser.arrayParse(inputPath, "");
        for (int i = 0; i < arrayPath.length; i++){
            if (arrayPath[i].equals("/"))
                arrayPath[i] = "\\";
        }
        if (!arrayPath[arrayPath.length-1].equals("\\"))
            arrayPath[arrayPath.length-1] += "\\";
        String output = "";
        for (String s : arrayPath)
            output += s;
        return output;
    }


    public ArrayList<String> readToList(String line){
        ArrayList<String> outputList = new ArrayList<>();
            int index = 0;
            while (line != null){
                outputList.add(index, line);
                index++;
            }
        return outputList;
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    public String read(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

        exists(fileName);

        try {
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public void write(String fileName, String text) {
        File file = new File(fileName);

        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileWorker fileWorker = new FileWorker();
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        System.out.print(fileWorker.pathFix(path));
    }
}
