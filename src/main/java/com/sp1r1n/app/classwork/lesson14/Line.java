package com.sp1r1n.app.classwork.lesson14;

import java.util.ArrayList;
import java.util.Arrays;

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

    public static void main(String[] args) {
        Pixel pixel1 =  new Pixel(10, 14);
        Pixel pixel2 =  new Pixel(14, 18);
        Pixel pixel3 =  new Pixel(18, 21);
        Pixel pixel4 =  new Pixel(12, 51);
        Line line = new Line(10, 20);
        line.addPixel(pixel1);
        line.addPixel(pixel2);
        line.addPixel(pixel3);
        line.addPixel(pixel4);
        System.out.println(Arrays.toString(line.getCoordinates()));
    }
}