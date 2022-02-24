/*

Program: ChangeExercise.java          Last Date of this Revision: February 24, 2022

Purpose: Ask the user for a dollar amount, and print the ideal numbers of change.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Science 20
 

*/

package Chapter3;

import java.util.Scanner;

public class ChangeExercise 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter your desired dollar amount: $");
		double userDollarValue = userInput.nextDouble();			// dollar amount in double values
		int userCentValue = (int)(userDollarValue * 100);			// converts dollars into integer cent value for calculation
		// System.out.println(userCentValue);						** debug line
		
		System.out.println("The minimum required amount of coins are as follows:");
		System.out.println("Quarters: " + userCentValue / 25);
		System.out.println("Dimes: " + userCentValue % 25 / 10);
		System.out.println("Nickels: " + userCentValue % 10 / 5);
		System.out.println("Pennies: " + userCentValue % 5);
	}
}

/* Screen dump 

Enter your desired dollar amount: $37.49
The minimum required amount of coins are as follows:
Quarters: 149
Dimes: 2
Nickels: 1
Pennies: 4


*/