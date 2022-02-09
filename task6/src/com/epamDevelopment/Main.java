package com.epamDevelopment;

public class Main {

    public static void main(String[] args) {

        double a, b, c, min, max;

        a = 4;
        b = 43.1;
        c = -53.1;

        if (a < b) {
            min = a;
            max = b;
        }
        else {
            max = a;
            min = b;
        }

        if (c < min) min = c;
        if (c > max) max = c;

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
