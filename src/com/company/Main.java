package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        boolean game;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello player, what is your name? ");
        String player = scanner.nextLine();

        while (game = true) {


            System.out.println();
            System.out.println("*** New Game ***");
            System.out.println();

            System.out.println("Hello, " + player);
            System.out.println("Please choose 1 for Rock - 2 for Paper - 3 for Scissors: ");
            String choice = scanner.nextLine();
            System.out.println("Your selection is:  " + choice);

            Roll.rolling(choice, player);






        }



    }


}
