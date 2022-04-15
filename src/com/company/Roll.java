package com.company;

import java.util.Random;

public class Roll {

    public static void rolling(String choice, String player) {
        int playerScore = 0;
        int computerScore = 0;

        Random r = new Random();
        int randomNumber = r.nextInt(1, 4);
        String computerChoice = String.valueOf(randomNumber);


        System.out.println("Computer is rolling....  ");
        System.out.println(("Computer selected " + computerChoice));

        if (choice.equals("1")) {

            if (computerChoice.equals("1")) {
                System.out.println("Both picked Rock.");
                System.out.println("This Game is declared a TIE!");
                System.out.println();
            } else if (computerChoice.equals("2")) {
                System.out.println("You chose Rock and Computer chose Paper.");
                System.out.println("Computer WINS!");
                System.out.println();
            } else {
                System.out.println("You chose Rock and Computer chose Scissors");
                System.out.println(player + " WINS!");
                System.out.println();
            }
        }
            ////
            if (choice.equals("2")) {

                if (computerChoice.equals("1")) {
                    System.out.println("You chose Paper and Computer chose Rock");
                    System.out.println(player + " WINS!");
                    System.out.println();
                } else if (computerChoice.equals("2")) {
                    System.out.println("You chose Paper and Computer chose Paper.");
                    System.out.println("This game is declared a TIE!");
                    System.out.println();
                } else {
                    System.out.println("You chose Paper and Computer chose Scissors");
                    System.out.println("Computer WINS!");
                    System.out.println();
                }
            }

                /////////////////////////////////////////
                if (choice.equals("3")) {

                    if (computerChoice.equals("1")) {
                        System.out.println("You chose Scissors and Computer chose Rock");
                        System.out.println("Computer WINS!");
                        System.out.println();
                    } else if (computerChoice.equals("2")) {
                        System.out.println("You chose Scissors and Computer chose Paper.");
                        System.out.println(player + " WINS!");
                        System.out.println();
                    } else {
                        System.out.println("You chose Scissors and Computer chose Scissors");
                        System.out.println("This game is declared a TIE!");
                        System.out.println();
                    }

                }



            }


        }

