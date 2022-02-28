/*

Program: SurfsUpV1.java          Last Date of this Revision: February 28, 2022

Purpose: Prompts the user for a theoretical wave height, and displays a message if over 6 feet.

Author: Nathaniel Edillon, 
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter4;

import java.util.Scanner;

public class SurfsUpV1
{
	public static void main(String[] args)
	{
		// initialize waveHeight variable and input
		Scanner userInput = new Scanner(System.in);
		double waveHeight;
		
		// ask for user input
		System.out.print("Input the current wave height: ");
		waveHeight = userInput.nextDouble();
		
		// compare waveHeight and print accordingly
		if (waveHeight >= 6)
		{
			System.out.println("\nGreat day for surfing!");
		}
	}
}

/* Screen Dump

Input the current wave height: 8

Great day for surfing!
 
 */