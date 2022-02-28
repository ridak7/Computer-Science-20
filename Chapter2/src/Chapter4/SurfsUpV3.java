/*

Program: SurfsUpV3.java          Last Date of this Revision: February 28, 2022

Purpose: Modify the original to include a message for waves between 0-3 feet and other.

Author: Nathaniel Edillon, 
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter4;

import java.util.Scanner;

public class SurfsUpV3
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
		else if (waveHeight < 6 && waveHeight > 3)
		{
			System.out.println("\nGo body boarding!");
		}
		else if (waveHeight >= 0 && waveHeight <= 3)
		{
			System.out.println("\nGo for a swim.");
		}
		else
		{
			System.out.println("\nWhoa! What kind of surf is that?");
		}
	}
}

/* Screen Dump

Input the current wave height: 3.5

Go body boarding!



Input the current wave height: 3

Go for a swim.



Input the current wave height: -99.9

Whoa! What kind of surf is that?
 
 */