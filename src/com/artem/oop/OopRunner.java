package com.artem.oop;

import java.util.List;

public class OopRunner {

    public static void main(String[] args) {
        System.out.println(getCars());
    }

    private static List<Car> getCars() {
        return List.of(
            new Car(1L, Brand.AUDI, Color.BLUE),
            new Car(2L, Brand.MERCEDES, Color.WHITE),
            new Car(3L, Brand.BMW, Color.ORANGE)
        );
    }
}
