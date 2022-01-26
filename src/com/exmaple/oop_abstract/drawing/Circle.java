package com.exmaple.oop_abstract.drawing;

import com.exmaple.Window;

import java.util.Scanner;

public class Circle {
    Point center;
    int radius;

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public static Circle readCircle() {
        Point point = Point.readPoint();
        System.out.print("Radius (r): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Circle(point, Integer.parseInt(input));
    }

    public void draw() {
        Window.drawCircle(this.center.x, this.center.y, this.radius);
    }

    public String asString() {
        return this.center.asString() + " / " + this.radius;
    }
}
