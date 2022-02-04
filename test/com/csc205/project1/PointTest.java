package com.csc205.project1;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void testShiftX(){
        Point p1 = new Point(0,0);
        p1.shiftX(1);
        Assertions.assertEquals(
                1.0,
                p1.getX(),
                "Shifting the x by one should make the value of x = 1");
    }
    @Test
    public void testshiftY(){
        Point p1 = new Point(0,0);
        p1.shiftY(1);
        Assertions.assertEquals(
                1.0,
                p1.getY(),
                "Shifting the y by one should make y = 1");
    }
    @Test
    public void testRotate(){
        Point p1 = new Point(0.0,3.0);
        double rotation = Math.PI / 2.0;
        p1.rotate(rotation);
        Point p2 = new Point(-3.0,-3.0);
        Assertions.assertEquals(
                p2.toString(),
                p1.toString(),
                "Rotating the point by pi/2 should make Point{x = -3.0, y = -3.0}");
    }
    @Test
    void testDistance(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,1);
        Assertions.assertEquals(
                1.0,
                p1.distance(p2),
                "Shifting the x by one should make Point{x = 0, y = 1.0}");
    }


}

