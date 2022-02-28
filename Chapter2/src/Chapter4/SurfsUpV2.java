/*

Program: SurfsUpV2.java          Last Date of this Revision: February 28, 2022

Purpose: Modify the original to include a message for waves less than 6 feet.

Author: Nathaniel Edillon, 
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter4;

import java.util.Scanner;

public class SurfsUpV2
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
		else if (waveHeight < 6)
		{
			System.out.println("\nGo body boarding!");
		}
	}
}

/* Screen Dump

Input the current wave height: 4

Go body boarding!

 
 */