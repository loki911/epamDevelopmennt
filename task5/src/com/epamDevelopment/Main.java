package com.epamDevelopment;

public class Main {

    public static void main(String[] args) {

        double a = 34.5;
        double b = 54.1;
        double c = -2;

        action(a);
        action(b);
        action(c);
    }

        static void action (double number){
            double result;
        if (number >=0) result = number * number;
        else result = Math.pow(number, 4);
            System.out.println(result);
    }
}

