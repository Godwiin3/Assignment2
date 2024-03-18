package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	

	    public static void main(String[] args) {
	       
	        Random random = new Random();
	        int theRandomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
	        int attempts = 5;

	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("You have 5 attempts to guess the number between 1 and 100.");

	        Scanner scanner = new Scanner(System.in);

	       
	        while (attempts > 0) {
	            System.out.print("Pick a number between 1 and 100: ");
	            if (scanner.hasNextInt()) {
	                int userGuess = scanner.nextInt();
	                if (userGuess < 1 || userGuess > 100) {
	                    System.out.println("Your guess is not between 1 and 100, please try again.");
	                    continue;
	                }

	                if (userGuess < theRandomNumber) {
	                    System.out.println("Please pick a higher number.");
	                } else if (userGuess > theRandomNumber) {
	                    System.out.println("Please pick a lower number.");
	                } else {
	                    System.out.println("You win!");
	                    break;
	                }

	                attempts--;
	                System.out.println("Attempts left: " + attempts);
	            } else {
	                System.out.println("Invalid input. Please enter an integer between 1 and 100.");
	                scanner.next();
	            }
	        }

	        
	        if (attempts == 0) {
	            System.out.println("You lose, the number to guess was " + theRandomNumber);
	        }
	        scanner.close();
	    }
	}



