package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter your score");
        Scanner exsamresult = new Scanner(System.in);
        double input = exsamresult.nextDouble();

        if (input >= 60) {
            System.out.println("you pass");
        }
        else {
            System.out.println("you fail");
        }


    }
}
