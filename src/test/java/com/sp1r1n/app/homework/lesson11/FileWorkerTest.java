package com.sp1r1n.app.homework.lesson11;

import com.sp1r1n.app.homework.lesson10.StringSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.reflect.annotation.ExceptionProxy;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by Denis on 3/2/2017.
 */
public class FileWorkerTest {
    FileWorker fileWorker;
    private static final String PATH = "src\\test\\resources\\";

    String read = "readtest.txt";
    String write = "writetext.txt";
    @Before
    public void init(){
        fileWorker = new FileWorker(PATH);
    }

    @Test
    public void pathFix() throws Exception {
        FileWorker fileWorker1 = new FileWorker("src/test/resources");
        String expected = "src\\test\\resources\\";
        assertEquals(expected, fileWorker1.pathFix());
    }

    @Test
    public void write() throws Exception {
        fileWorker.write(PATH + write, "output\ntext");
        assertEquals("output\ntext\n", fileWorker.read(PATH + write));
    }

    @Test
    public void read() throws Exception {
        String actual = fileWorker.read(PATH + read);
        assertEquals("Test\nread\n", actual);
    }

    @Test
    public void delete() throws Exception{
        File file = new File("src\\test\\resources\\deletetest.txt");
        fileWorker.delete(PATH + file.getName());
        assertFalse(file.exists());
        file.createNewFile();
    }
}