package com.code.challenges;

import java.util.Scanner;

public class EvenOrOdd {
	public static Scanner userInput = new Scanner(System.in);
	
	public static void evenOrOdd() {
		int evenNumberInd;
		
		System.out.print("Enter a number to check for even or odd: ");
		int inputNumber = userInput.nextInt();
		
		if (inputNumber % 2 == 0)  evenNumberInd = 1; 
		
		else { evenNumberInd = 0; }
		
		if (evenNumberInd == 1) System.out.println("The number is an Even number");
		
		else System.out.println("The number is an Odd number"); 
		
	}
	
}
