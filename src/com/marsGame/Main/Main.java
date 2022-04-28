package com.marsGame.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("The game is about to start...\nBooting up...\n...\n...\n..." +
                "\nReady\n\n\nHi there. What's your name?");

        Scanner s1 = new Scanner(System.in);

        String userName = s1.nextLine();

        System.out.println("Hi "+ userName +" --- Welcome to The Mars Adventure Game.\n" +
                "Yesterday, you received a call from your good friend at NASA.\n" +
                "They need someone to go to Mars this weekend, and you've been chosen.\n");


    }
}
