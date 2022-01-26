package com.exmaple.oop_abstract.power;

public class Lamp extends Consumer{
    public Lamp(String name, int consumption) {
        super(name, consumption);
    }

    @Override
    public String toString() {
        return this.name + " consumes " + calcConsumption() + " watts";
    }
}