package com.marsGame.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("The game is about to start...\nBooting up...\n...\n...\n..." +
                "\nReady\n\n\nHi there. What's your name?");

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        String userName = s1.nextLine();

        System.out.println("Hi "+ userName +" --- Welcome to The Mars Adventure Game.\n" +
                "Yesterday, you received a call from your good friend at NASA.\n" +
                "They need someone to go to Mars this weekend, and you've been chosen.\n");

        System.out.println("Are you excited? Type Y or N");

        String excited = s1.nextLine();

        if(excited.equals("y")){
            System.out.println("I knew you'd say that. It's so cool that you're going to Mars!\n");
        } else {
            System.out.println("Sorry to hear that.");
        }

        System.out.println("It's time to pack for your trip to Mars.\n" +
                "How many suitcases do you plan to bring?");
        int numOfSuitcase= s1.nextInt();
        if(numOfSuitcase>2){
            System.out.println("That's way too many. You'll have to pack more lightly.\n" +
                    "Please try to fit your stuff into 2 suitcases.");
        } else if (numOfSuitcase<2) {
            System.out.println("I think that you have made a wonderful choice");
        } else {
            System.out.println("Perfect! fitting fitting your stuff into two suitcase.");
        }

        System.out.println("You're allowed to bring one companion animal with you.\n" +
                "What kind of companion animal would you like to bring?");

        String animalType = s1.nextLine();

        System.out.println("What is your companion's name?");

        String animalName = s2.nextLine();

        System.out.println("Cool, so your bringing "+animalName+" the "+animalType);


        System.out.println("NASA has a interior design team offering to outfit your space ship.\n" +
                "You have a couple of options for the interior decor of your ship.\n" +
                "\n" +
                "Your options are:\n" +
                " A  Sleek, modern minimalism\n" +
                " B  Retro/vintage space age\n" +
                " C  SF Hippie chic\n" +
                "Which decor would you like? Choose A, B, or C.");
        String decorOption = s1.nextLine();

        if(decorOption.equals("a")){
            decorOption = "Sleek";
        } else if (decorOption.equals("b")) {
            decorOption = "Retro";
        } else if (decorOption.equals("c")){
            decorOption = "SF Hippie chic";
        } else {
            System.out.println(" You have to choose A, B or C no other than that.");
        }

        System.out.println("I can see it now:\n" +
                userName +" and "+animalName+"surfing the celestial abyss ...\n"
                +" in a "+decorOption+" spaceship.\n"+userName+" -- the day is here!\n"+
                "You crawl into the spaceship with "+animalName+" \n" +
                "Brace for take off!\n" +
                "5 ...\n" +
                "4 ...\n" +
                "3 ...\n" +
                "2 ...\n" +
                "1 ...\n" +
                "* LIFTOFF *");


    }
}
