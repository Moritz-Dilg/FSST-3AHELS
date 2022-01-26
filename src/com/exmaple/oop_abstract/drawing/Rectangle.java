package com.exmaple.oop_abstract.drawing;

import com.exmaple.Window;

import java.util.Scanner;

public class Rectangle {
    Point location;
    int width;
    int height;

    Rectangle(Point location, int width, int height) {
        this.location = location;
        this.width = width;
        this.height = height;
    }

    public static Rectangle readRectangle() {
        Point point = Point.readPoint();
        System.out.print("Width and height (w, h): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] pos = input.split(" ");
        return new Rectangle(point, Integer.parseInt(pos[0]), Integer.parseInt(pos[1]));
    }

    public void draw() {
        Window.drawRectangle(this.location.x, this.location.y, this.width, this.height);
    }

    public String asString() {
        return this.location.asString() + " - " + this.width + " | " + this.height;
    }
}
