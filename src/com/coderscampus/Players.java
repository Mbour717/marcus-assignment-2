package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Players {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int input;
	int randomNumber;
	int zero;
	
	public int result (int maxAttempts) {
		randomNumber = random.nextInt(100) + 1;
		
		while (zero < maxAttempts) {
			System.out.println("Pick a number between 1 and 100: ");
			input = scanner.nextInt();
			
			if (input < 1 || input > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			}else {
				zero++;
			}
			
			if (input > randomNumber) {
				System.out.println("Please pick a lower number \n");
			}else if (input < randomNumber) {
				System.out.println("Please pick a higher number \n");
			}else {
				System.out.println("You win!");
				return input;
			}
		}
		System.out.println("You lose! \n " + "\n" + "The number you guess was: " + randomNumber);
		return input;
	}
}
