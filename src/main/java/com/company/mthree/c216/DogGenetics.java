package com.company.mthree.c216;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String name;
        Random random = new Random();
        int prcnt;int limit = 100 ;

        System.out.println("Please enter your dog name");
        name=myscan.nextLine();

        System.out.println("Sir " + name + " is: ");
        String[] breed = {"St. Bernard","Chihuahua", "Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};
       //loop to print the percentage of each breed
        for (int i = 0; i< breed.length;i++) {
            prcnt = randomise(random, limit);
            limit = limit - prcnt; //subtracting everytime to decrease limit
            System.out.println(prcnt+"%   "+breed[i]);
        }
        System.out.println("Wow, that's QUITE the dog! ");
    }

    public static int randomise(Random r,int i){
        int prcnt;
        return prcnt= r.nextInt(i) + 1;
    }
}
