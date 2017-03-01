package com.sp1r1n.app.classwork.lesson10;

/**
 * Created by DELL on 2/16/2017.
 */
public class MeasurePerformance {
    public long MeasurePerf(){
        long start = System.currentTimeMillis();
        StringBuilder c = new StringBuilder("start");
        String b = "finish";
        for (long i = 0; i < 100000L; i++){
            c = c.append(b);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
