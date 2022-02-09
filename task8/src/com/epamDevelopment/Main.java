package com.epamDevelopment;

public class Main {

    public static void main(String[] args) {
        int k = 4;
        int z = 0;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int j : array) {
            if (j % k == 0) {
                z = z + j;
            }
        }
        System.out.println(z);
    }
}
