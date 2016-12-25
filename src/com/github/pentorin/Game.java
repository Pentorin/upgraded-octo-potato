package com.github.pentorin;

import java.util.Scanner;

/**
 * @author aaronbelz
 * @version 24 Dec 2016
 */
public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to, Potato Shit Inc.");

        Scanner scan = new Scanner(System.in);

        System.out.print("Would you like to start the game: ");
        int lastInput = scan.nextInt();

        if (lastInput == 0)
            System.out.println("Oh, I'll wait.");
        else
            System.out.println("Let's go!");

        System.out.println("...you are who?");
        System.out.print("Please enter your name: ");
        String playerName = scan.next();

        System.out.println("Ahh! Very well, welcome, " + playerName + "!");

        System.out.print("Would you like to begin your journey: ");
        lastInput = scan.nextInt();

        if (lastInput == 0)
            System.out.println("Oh, I'll wait.");
        else {
            System.out.println("\n\n");
            System.out.println("Let's go!");
            System.out.println("Wooosh.........");
            System.out.println("\n\n");
            System.out.println("*you stumble apon an old sickly looking man*");
            System.out.println("What would you like to do?");
            System.out.println("1) Talk to him");
            System.out.println("2) Run away from him");
            System.out.println("3) Fight him");
            System.out.print("Your choice: ");
            lastInput = scan.nextInt();

            if (lastInput == 1) {
                System.out.println("\n\n");
                String currentlyInteractingWith;
                System.out.println("*you walk closer*");
                System.out.println(playerName + ": " + "Umm sir, can you tell me where I am?");
                System.out.println("?????????" + ": Aye, where's your manners?");
                System.out.println("1) \"Sorry sir, I'm in a bit of a rush...\"");
                System.out.println("2) \"What are you trying to say, OLD MAN?!\"");
                System.out.println("3) \"I.. I... I mean, may I ask your name, sir?\"");
                System.out.print("Your choice: ");
                lastInput = scan.nextInt();

                if (lastInput == 1) {
                    //TODO:
                } else if (lastInput == 2) {
                    //TODO:
                } else if (lastInput == 3) {
                    System.out.println("\n\n");
                    System.out.println(playerName + ": " + "I.. I... I mean, may I ask your name, sir?");
                    currentlyInteractingWith = "Heath";
                    System.out.println("?????????" + ": Ah, some good company.. yes, my name is " + currentlyInteractingWith + ".");
                    System.out.println(currentlyInteractingWith + ": " + "So err... what brings you by?");
                    //TODO:
                }
                //TODO:
            } else if (lastInput == 2) {
                //TODO:
            } else if (lastInput == 3) {
                //TODO:
            }
        }
    }
}
