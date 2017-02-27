package com.sp1r1n.app.classwork.lesson14;

/**
 * Created by DELL on 2/27/2017.
 */
public class Pixel {
    protected int x;
    protected int y;

    public Pixel(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getCoordinates(){
        int[] res = {x, y};
        return res;
    }
}
