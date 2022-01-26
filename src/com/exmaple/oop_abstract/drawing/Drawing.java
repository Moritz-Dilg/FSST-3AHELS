package com.exmaple.oop_abstract.drawing;

import com.exmaple.Window;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        Window.open();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        ArrayList<Polyline> polylines = new ArrayList<>();
        ArrayList<Line> lines = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();


        while (!input.equals(".")) {
            System.out.print("Figure (L|R|C|P|.): ");
            input = scanner.nextLine();
            switch (input) {
                case "P":
                    Polyline polyline = Polyline.readPolyline();
                    polyline.draw();
                    polylines.add(polyline);
                    break;
                case "L":
                    Line line = Line.readLine();
                    line.draw();
                    lines.add(line);
                    break;
                case "R":
                    Rectangle rectangle = Rectangle.readRectangle();
                    rectangle.draw();
                    rectangles.add(rectangle);
                    break;
                case "C":
                    Circle circle = Circle.readCircle();
                    circle.draw();
                    circles.add(circle);
                    break;
            }
        }

        System.out.println("\n");

        for (Polyline polyline : polylines) {
            System.out.println("Polyline {" + polyline.asString() + "\n}");
        }
        for (Line line : lines) {
            System.out.println("Point " + line.asString());
        }
        for (Rectangle rectangle : rectangles) {
            System.out.println("Point " + rectangle.asString());
        }
        for (Circle circle : circles) {
            System.out.println("Point " + circle.asString());
        }
    }
}
