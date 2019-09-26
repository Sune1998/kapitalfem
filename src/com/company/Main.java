package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// løsning til opgave 5.1
         exameCalc();
    }

    public static boolean exameCalc () {
        Scanner input = new Scanner(System.in);
        boolean i = true;
        while (i = true) {
            System.out.println("enter exam score");
            int examScore = input.nextInt();
            if (examScore >=60) {
                System.out.println("you pass");

            }
            else if (examScore < 60 && examScore > 0) {
                System.out.println("you fail");
            }
            else if (examScore == -1) {
                System.out.println("exiting program");
                return i = false;
            }
        }
      return i = false;
    }
}
