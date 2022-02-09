package com.epamDevelopment;

public class Main {

    public static void main(String[] args) {
        double x, y;
        x = 2.1;
        y = 4;

        if (Math.abs (x) > 4 || y > 4 || y < -3)
            System.out.println("false");
        else if ((Math.abs (x) > 2) && y > 0)
            System.out.println("false");
        else
            System.out.println("true");
    }
}
