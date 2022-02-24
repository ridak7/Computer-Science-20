/*

Program: Digits.java          Last Date of this Revision: February 24, 2022

Purpose: Prompt the user to input a two digit number, then display the digits in the tens and ones place.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Science 20

*/

package Chapter3;

import java.util.Scanner;

public class Digits 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner (System.in);
		
		System.out.print("Input a two digit number: ");
		int userNumber = userInput.nextInt();
		System.out.println();
		
		int tens = userNumber / 10, ones = userNumber % 10;
		
		System.out.println("Tens: " + tens);
		System.out.println("Ones: " + ones);
		
	}
}

/* Screen dump 

Input a two digit number: 69

Tens: 6
Ones: 9

*/