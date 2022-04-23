 package com.company.mthree.c216;

import java.util.Scanner;

public class HealthyHeart {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int age;
        System.out.println("Please Enter your age");
        age = myscan.nextInt();
        heartrateCalculator(age);

    }
    public static void heartrateCalculator(int a){
        /* function to find calculate the heart rate
           and range of healthy heart */
        int rate = 220 - a;
        int max_limit = (int) (0.85 * rate);
        System.out.println("Your maximum heart rate should be "+ rate +"  beats per minute");
        System.out.println("Your target HR Zone is "+(int)(0.50 * rate) +" - "+ max_limit+" beats per minute");
    }
}
