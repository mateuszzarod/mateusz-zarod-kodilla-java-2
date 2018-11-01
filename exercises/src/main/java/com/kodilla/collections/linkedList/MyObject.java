package com.kodilla.collections.linkedList;

import java.util.Objects;

public class MyObject {
    int value = 0;

    public MyObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        MyObject myObj = (MyObject) o;
        if (myObj.getValue() == value){
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
