package com.csc205.project1;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;
    public Point(){
        x=0;
        y=0;
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double distance(Point p){
        double pointx = p.getX();
        double pointy = p.getY();
        return sqrt((pointy - y) * (pointy - y) + (pointx - x) * (pointx - x));
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y){
        this.y = y;
    }
    public void setPoint(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void shiftX(double n){
        x=x+n;
    }
    public void shiftY(double n){
        y=y+n;
    }
    public void rotate(double angle){
        x=x*cos(angle)-y*sin(angle);
        y=x*sin(angle)+y*cos(angle);
    }
    public String toString(){
        String coordinates = "Point{x = " + x + ", y = " + y+ "}";
        return coordinates;
    }
}
