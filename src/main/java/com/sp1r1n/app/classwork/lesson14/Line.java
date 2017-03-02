package com.sp1r1n.app.classwork.lesson14;

import java.util.ArrayList;

/**
 * Created by DELL on 2/27/2017.
 */
public class Line extends Pixel {
    ArrayList<Pixel> pixelList = new ArrayList<>();

    public Line(int x, int y) {
        super(x, y);
    }
    public void addPixel(Pixel pixel) {
        pixelList.add(pixel);
    }
    @Override
    public int[] getCoordinates() {
        int[] polyline = new int[pixelList.size() * 2];
        int index = 0;
        for (Pixel pixel : pixelList) {
            for (int coordinate : pixel.getCoordinates()) {
                polyline[index] = coordinate;
                ++index;
            }
        }
        return polyline;
    }
}