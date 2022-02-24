/*

Program: DigitsModified.java          Last Date of this Revision: February 24, 2022

Purpose: Prompt the user to input a two digit number, then display the digits in the tens and ones place.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Science 20

*/

package Chapter3;

import java.util.Scanner;

public class DigitsModified 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner (System.in);
		
		System.out.print("Input a three digit number: ");
		int userNumber = userInput.nextInt();
		System.out.println();
		
		int hundreds = userNumber / 100, tens = userNumber % 100 / 10, ones = userNumber % 10;
		
		System.out.println("Hundreds: " + hundreds);
		System.out.println("Tens: " + tens);
		System.out.println("Ones: " + ones);
		
	}
}

/* Screen dump 

Input a three digit number: 456

Hundreds: 4
Tens: 5
Ones: 6


*/