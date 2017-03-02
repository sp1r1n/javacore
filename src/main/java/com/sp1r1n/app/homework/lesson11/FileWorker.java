package com.sp1r1n.app.homework.lesson11;

import com.sp1r1n.app.homework.lesson10.ArrayParser;

import java.io.*;

/**
 * Created by DELL on 2/23/2017.
 */
public class FileWorker {

    private String path;

    public FileWorker(String path){
        this.path = path;
    }

    public String pathFix(){
        ArrayParser arrayParser = new ArrayParser();
        String[] arrayPath = arrayParser.arrayParse(path, "");
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

    public void delete(String fileName){
        File file = new File(fileName);
        file.delete();
    }

    public static void exists(String fileName) throws FileNotFoundException {
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
}
