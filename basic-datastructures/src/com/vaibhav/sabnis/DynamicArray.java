package com.vaibhav.sabnis;

import java.util.Iterator;

public class DynamicArray<T> implements Iterable {
    public int size(){}
    public boolean isEmpty(){}
    public T get(){}
    public void set(int index, T element){}
    public void clear(){}
    public void add(T element){}
    public T removeAt(int index){}
    public boolean remove(Object obj){}
    public boolean contains(Object obj){}

    @Override
    public java.util.Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
            }

            @Override
            public T next() {
            }
            @Override
            public void remove() {}
        }
    }
    @Override
    public String toString() {}

}
