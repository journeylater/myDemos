package com.destiny.objectOriented.constructionMethod;

public class Rectangle {

    private int width;
    private int high;

    public Rectangle() {
    }

    public Rectangle(int width, int high) {
        this.width = width;
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
    //周长
    public int getLenght() {
        return 2 * (width + high);
    }

    //面积
    public int getArea() {
        return width * high;
    }
}
