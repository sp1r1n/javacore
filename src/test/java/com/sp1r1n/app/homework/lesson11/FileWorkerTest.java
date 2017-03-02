package com.sp1r1n.app.homework.lesson11;

import com.sp1r1n.app.homework.lesson10.StringSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class FileWorkerTest {
    FileWorker fileWorker;
    String read = "readtest.txt";
    String write = "writetext.txt";
    String path = "C:\\Users\\Denis\\Documents\\javacore\\master\\src\\test\\resources\\";
    @Before
    public void init(){
        fileWorker = new FileWorker(path);
    }

    @Test
    public void pathFix() throws Exception {
        fileWorker = new FileWorker("C:/users");
        String expected = "C:\\users\\";
        assertEquals(expected, fileWorker.pathFix());
    }

    @Test
    public void read() throws Exception {
        String actual = fileWorker.read(path + read);
        assertEquals("Test\nread\n", actual);
    }

    @Test
    public void write() throws Exception {
        fileWorker.write(path + write, "output\ntext");
        assertEquals("output\ntext\n", fileWorker.read(path + write));
    }

}