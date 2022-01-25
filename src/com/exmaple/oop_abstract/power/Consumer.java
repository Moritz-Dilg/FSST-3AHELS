package com.exmaple.oop_abstract.power;

abstract public class Consumer extends Device{
    int consumption = 0;

    Consumer(String name, int consumption) {
        super(name);
        this.consumption = consumption;
    }

    @Override
    public int calcConsumption() {
        return consumption;
    }

    abstract public String toString();
}
