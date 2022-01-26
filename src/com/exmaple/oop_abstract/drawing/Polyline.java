package com.exmaple.oop_abstract.drawing;

import com.exmaple.Window;

import java.util.ArrayList;

public class Polyline {
    Point[] points;
    int pointCount;

    Polyline(Point[] points) {
        this.points = points;
        this.pointCount = points.length;
    }

    public static Polyline readPolyline() {
        ArrayList<Point> points = new ArrayList<>();
        Point currentPoint = Point.readPoint();
        while (currentPoint != null) {
            points.add(currentPoint);
            currentPoint = Point.readPoint();
        }
        return new Polyline(points.toArray(new Point[0]));
    }

    public void draw() {
        for (int i = 0; i < this.pointCount - 1; i++) {
            Window.drawLine(this.points[i].x, this.points[i].y, this.points[i + 1].x, this.points[i + 1].y);
        }
    }

    public String asString() {
        StringBuilder string = new StringBuilder();
        for (Point point : points) {
            string.append("\n\t").append(point.asString());
        }
        return string.toString();
    }
}
