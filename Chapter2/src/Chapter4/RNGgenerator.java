/*

Program: RNGgenerator.java          Last Date of this Revision: February 28, 2022

Purpose: Prompt the user for a range between two numbers to generate a random integer

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter4;

import java.util.Scanner;

public class RNGgenerator
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int min, max;
		
		// ask user for both min and max values
		System.out.print("Input a minimum value: ");
		min = userInput.nextInt();
		System.out.println();
		System.out.print("Input a (greater) maximum value: ");
		max = userInput.nextInt();
		System.out.println();
		
		// generate random integer and print it
		System.out.print("Number: " + (int) ((max - min + 1) * Math.random() + min));
	}
}

/* Screen Dump

Input a minimum value: 1

Input a (greater) maximum value: 10

Number: 6
 
 */