package com.epamDevelopment;

public class Main {

    public static void main(String[] args) {
	double a, b , c , result;
	a = 2.45;
	b = -3.18;
	c = 4.1;

	result = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - a * a * a * c + 1 / (b * b);

        System.out.println(result);
    }
}
