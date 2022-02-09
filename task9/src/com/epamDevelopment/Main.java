package com.epamDevelopment;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] array1 = new int[]{1,2,3,4,5,6,7};
        int [] array2 = new int[]{8,5,3};
        int k = 3;
        int [] result = new int[array1.length + array2.length];

        for (int i = 0; i < result.length; i++){
            if (i < k) result[i] = array1[i];
            else if (i < (k + array2.length)) result[i] = array2[i-k];
            else result[i] = array1[i - array2.length];
        }
        System.out.println(Arrays.toString(result));
    }
}
