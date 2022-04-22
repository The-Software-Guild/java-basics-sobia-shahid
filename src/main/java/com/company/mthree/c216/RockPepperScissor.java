package com.company.mthree.c216;
import java.util.Random;
import java.util.Scanner;

public class RockPepperScissor {
    public static void main(String[] args) {
        int round;
        boolean valid = false;
        int option;
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int computerwins = 0, userwins=0, ties=0;
        String useroption;
        do {
            do {
                System.out.println("enter number of games you want to play");

                round = scan.nextInt();
                if (round >= 1 && round <= 10) {
                    valid = true;
                }
            } while (!valid);

            for (int i = 1; i <= round; i++) {
                System.out.println("ENTER 1 for rock \n 2 for papper \n 3 for scissor");
                option = scan.nextInt();
                int opt = r.nextInt(3) + 1;
                if ((option == 2 && opt == 1) || (option == 3 && opt == 2) || (option == 1 && opt == 3)) {
                    userwins++;
                } else if ((opt == 2 && option == 1) || (opt == 3 && option == 2) || (opt == 1 && option == 3)) {
                    computerwins++;
                } else {
                    ties++;
                }
            }

            System.out.printf("number of computer wins: " + computerwins + "%n userwins: " + userwins + "%n ties: " + ties+"%n");
            System.out.println("Enter \"yes\" if you want to play again \"No\" to quit");
            scan.nextLine();
            useroption=scan.nextLine();
        } while(useroption.equals("yes"));

        System.out.println("Thanks for playing!");
    }
}
