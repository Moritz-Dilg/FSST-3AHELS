package com.exmaple.oop_abstract.power;

abstract public class Device {
    String name;

    Device(String name) {
        this.name = name;
    }

    abstract public int calcConsumption();

    abstract public String toString();
}
