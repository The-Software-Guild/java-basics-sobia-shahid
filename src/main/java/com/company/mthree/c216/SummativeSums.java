package com.company.mthree.c216;

public class SummativeSums {
    public static void main(String[] args) {
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3;
        array3 = new int[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        System.out.printf("#1 Array sum: %d %n#2 Array sum: %d %n#3 Array sum: %d %n ",sumofarray(array1),sumofarray(array2),sumofarray(array3));
    }
    public static int sumofarray(int[] a){
        /* function to find sum of elements
        in a given array */
        int sum = 0;
        for (int j : a) {
            sum = sum + j;
        }
        return sum;
    }
}
