package com.epamDevelopment;

public class Main {

    public static void main(String[] args) {
	    int number = 4853;
	    int a, b, c, d;

	    a = number / 1000;
	    b = (number - a * 1000) / 100;

	    d = (number % 10);
        c = (number - d) / 10 % 10;

        if (a + b == c + d) System.out.println("true");
        else System.out.println("false");
    }
}
