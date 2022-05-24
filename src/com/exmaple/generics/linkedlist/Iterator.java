package com.exmaple.generics.linkedlist;

public interface Iterator<T> {
    boolean hasNext();
    NodeLL<T> next();
}
