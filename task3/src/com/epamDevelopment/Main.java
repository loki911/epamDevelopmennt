package com.epamDevelopment;

public class Main {

    public static void main(String[] args) {

        double cat1 = 3;
        double cat2 = 4;
        double square;
        double perim;

        square = cat1 * cat2 / 2;
        perim = cat1 + cat2 + Math.sqrt(cat1 * cat1 + cat2 * cat2);

        System.out.println("Площадь: " + square);
        System.out.println("Периметр: " + perim);
    }
}
