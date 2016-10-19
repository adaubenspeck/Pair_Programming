package com.company;

/**
 * Created by ad110 on 10/19/16.
 */
public class Rectangle {
    public double length;
    public double width;
    public double area;
    public double perimeter;

    public Rectangle(double x ,double y){
        length = x;
        width = y;

    }
    public double Area(){
       area = length * width;
        return area;
    }
    public double Per(){
        perimeter = 2 * length + 2 * width;
        return perimeter;
    }
}
