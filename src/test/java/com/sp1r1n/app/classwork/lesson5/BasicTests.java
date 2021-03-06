package com.sp1r1n.app.classwork.lesson5;

import org.junit.*;
import org.junit.runners.MethodSorters;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


/**
 * Created by DELL on 1/30/2017.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicTests {
// Assume we are testing sorting methods
// Assume that with the same input data each method should have some specific results
// in practice difference between sorting methods is time,
// but we will use earthier solution
    private static final String INPUT_DATA = "src/test/resources/BasicInput.txt";
    private static final String EXPECTED_RESULTS = "src/test/resources/BasicExpected.txt";
    private static int[] inputData = {1};
    private static int[] expectedResults = {1};

    @BeforeClass // input data the same for all tests
    public static void preConditionsForClass() throws IOException {
        expectedResults = readTheFile(EXPECTED_RESULTS); }
    @Before
    public void preConditionsForTest() throws IOException {
        inputData = readTheFile(INPUT_DATA); }
    @Test
    public void aFirstTest(){
//because tests in alphabetical order we use 'a', 'b' to order tests
        System.out.println("Simple sorting test");
        Arrays.sort(inputData);
        Assert.assertArrayEquals(expectedResults,inputData); }
    @Test
    public void bSecondTest(){
        System.out.println("Parallel sorting test");
        Arrays.parallelSort(inputData);
        Assert.assertArrayEquals(expectedResults,inputData); }
    @Test(timeout = 1000)
    public void infinityTest() {
        while (true); }
    @Ignore("Not ready yet")
    @Test(timeout = 1000)
    public void thisTestNotReady() { }
    @After
    public void postConditionsForTest(){
// of course java has garbage collector and this method now useless
// but imagine if as results of our test we have some data in database
// so after steps used to clean things, that will not be clean automatically
        inputData = null;
    }
    @AfterClass
    public static void postConditionsForClass(){
        expectedResults = null; }
    public static int[] readTheFile(String path) throws IOException {
        int[] result = null;
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        if ((line = reader.readLine()) != null){
            String[] array;
            array = line.split(",");
            result = fromStringArray(array);
        }
        reader.close();
        return result; }
    public static int[] fromStringArray(String[] array){
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++){
            result[i] = Integer.valueOf(array[i]);
        }
        return result;
    }
}
