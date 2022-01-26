package com.exmaple.oop_abstract.drawing;

import com.exmaple.Window;

import java.util.Scanner;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point readPoint() {
        System.out.print("Point (x, y): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("-1 -1")) {
            return null;
        }
        String[] pos = input.split(" ");
        return new Point(Integer.parseInt(pos[0]), Integer.parseInt(pos[1]));
    }

    public void draw() {
        Window.drawPoint(this.x, this.y);
    }

    public String asString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
