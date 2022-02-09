package com.csc205.project1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void testShiftX(){
        Point p1 = new Point(0,0);
        p1.shiftX(1);
        Assertions.assertEquals(
                1.0,
                p1.getX());
    }
    @Test
    public void testShiftY(){
        Point p1 = new Point(0,0);
        p1.shiftY(1);
        Assertions.assertEquals(
                1.0,
                p1.getY());
    }
    @Test
    public void testRotate(){
        Point p1 = new Point(-3,-3);
        double rotation = Math.PI / 2.0;
        p1.rotate(rotation);
        Assertions.assertEquals(
                3.0,
                p1.getX());
        Assertions.assertEquals(
                -3.0,
                p1.getY());
    }
    @Test
    void testDistance(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,1);
        Assertions.assertEquals(
                1.0,
                p1.distance(p2));
    }
}

