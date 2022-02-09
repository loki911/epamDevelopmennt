package com.epamDevelopment;

public class Main {

    public static void main(String[] args) {

        double a, b, f, h;
        a = 10;
        b = 20;
        h = 2;

        for (double i = a; i <= b; i = i + h){

            f = Math.pow(Math.sin(i), 2) - Math.cos(2 * i);
            System.out.println(i + "   " + f);
        }
    }
}
