package com.exmaple.oop_abstract.drawing;

import com.exmaple.Window;

public class Line {
    Point from;
    Point to;

    Line(Point from, Point to) {
        this.from = from;
        this.to = to;
    }

    public static Line readLine() {
        return new Line(Point.readPoint(), Point.readPoint());
    }

    public void draw() {
        Window.drawLine(this.from.x, this.from.y, this.to.x, this.to.y);
    }

    public String asString() {
        return this.from.asString() + " - " + this.to.asString();
    }
}
