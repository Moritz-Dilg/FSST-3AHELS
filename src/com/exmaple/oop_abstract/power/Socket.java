package com.exmaple.oop_abstract.power;

abstract public class Socket extends Device {
    Socket(String name) {
        super(name);
    }

    abstract public void plug(Device device);
    abstract public void unplug(Device device);
    abstract public boolean hasFreePlug();
}
