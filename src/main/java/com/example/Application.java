package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        String a = "this is a string!";
        Micronaut.run(Application.class, args);
    }
}
