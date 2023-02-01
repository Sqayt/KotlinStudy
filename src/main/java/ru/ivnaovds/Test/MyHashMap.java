package ru.ivnaovds.Test;

import ru.ivnaovds.Test.model.Car;

public class MyHashMap {

    public static void main(String[] args) {
        Car car = new Car("toyota", 12);
        int h;
        int a = car == null ? 0 : (h = car.hashCode()) ^ (h >>> 16);
        int i = ()
        System.out.println(a);
    }
}
