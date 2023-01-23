package BasicGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
	Random random = new Random();
	int numberToGuess = random.nextInt(44);
	int numberOfTries = 6;
	int i, guess;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Guess your number between 1 and 44, you have 6 tries ");
	
	for(i = 0; i < numberOfTries; i++) {
		System.out.println("Guess your number: ");
		
		guess = scanner.nextInt();
		
		if(guess == numberToGuess) {
			System.out.println("You lucky dog, your number is correct :)");
			break;
		} 
		else if (guess < numberToGuess) {
			System.out.println("Your number is lower than guess ");
		} 
		else if (guess > numberToGuess) {
			System.out.println("Your number is higher than guess ");
		} 
	}
	if(i == numberOfTries) {
		System.out.println("You had your all 6 tries...Sorry");
		System.out.println("The number is " + numberToGuess);
	}
	
	

	
	
	
	
		
	}

}
