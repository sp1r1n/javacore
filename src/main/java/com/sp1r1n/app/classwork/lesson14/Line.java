package com.sp1r1n.app.classwork.lesson14;

/**
 * Created by DELL on 2/27/2017.
 */
public class Line extends Pixel {

    Pixel[] pixelArray = new Pixel[3];
    int i = 0;

    public Line(int x, int y) {
        super(x, y);
    }

    public void addPixel(Pixel pixel) {
        for (; i < pixelArray.length; i++) {
            pixelArray[i] = pixel;
        }
    }

    public int[] getCoordinates() {
        int[] res = new int[pixelArray.length * 2];
        for (Pixel pixel: pixelArray){
            System.out.print(getCoordinates());
        }
        return res;
    }

    public static void main(String[] args) {
        Pixel pixel = new Pixel(10, 20);
        Pixel pixel2 = new Pixel(15, 20);
        Pixel pixel3 = new Pixel(13, 20);

        Line l = new Line(10, 20);
        l.addPixel(pixel);
        l.addPixel(pixel2);
        l.addPixel(pixel3);
    }

}
