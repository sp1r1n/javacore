package com.sp1r1n.app.classwork.lesson10;

/**
 * Created by DELL on 2/16/2017.
 */
public class MeasurePerformance {
    public void MeasurePerf(){
        long start = System.currentTimeMillis();
        StringBuilder c = new StringBuilder("start");
        String b = "finish";
        for (long i = 0; i < 100000L; i++){
            c = c.append(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("start");
        int indexOffset = 3;
        stringBuilder.insert(indexOffset, "sff");
        System.out.print(stringBuilder.toString());
    }
}
