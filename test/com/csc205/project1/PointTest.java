package com.csc205.project1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PointTest {
    @Test

    void shiftsXCoordinate(){
        Point p1 = new Point(0,0);
        p1.shiftX(1);
        Point p2 = new Point(1,0);
        assertEquals(p2.toString(),
                p1.toString(),
                "Shifting the x by one should make Point{x = 1.0, y = 0}");
    }
    void shiftsYCoordinate(){
        Point p1 = new Point(0,0);
        p1.shiftY(1);
        Point p2 = new Point(0,1);
        assertEquals(p2.toString(),
                p1.toString(),
                "Shifting the x by one should make Point{x = 0, y = 1.0}");
    }
    void rotatesCoordinates(){
        Point p1 = new Point(0.0,3.0);
        double rotation = Math.PI / 2.0;
        p1.rotate(rotation);
        Point p2 = new Point(-3.0,-3.0);
        assertEquals(p2.toString(),
                p1.toString(),
                "Shifting the x by one should make Point{x = 0, y = 1.0}");
    }
    void distanceBetweenCoordinates(){
        Point p1 = new Point(0,0);
        p1.shiftY(1);
        Point p2 = new Point(0,1);
        assertEquals(p2.toString(),
                p1.toString(),
                "Shifting the x by one should make Point{x = 0, y = 1.0}");
    }


}

