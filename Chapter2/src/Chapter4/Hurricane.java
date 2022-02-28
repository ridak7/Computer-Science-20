/*

Program: Hurricane.java          Last Date of this Revision: February 28, 2022

Purpose: Take the hurricane category provided by the user, and then print the speeds associated with it.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter4;

import java.util.Scanner;

public class Hurricane
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the category of hurricane (1-5): ");
		int category = userInput.nextInt();
		
		switch (category)
		{
			case 1:
				System.out.println("Category 1: 74-95 mph, 64-82 kt, 119-153 kmh");
				break;
			case 2:
				System.out.println("Category 2: 96-110 mph, 83-95 kt, 154-177 kmh");
				break;
			case 3:
				System.out.println("Category 3: 96-110 mph, 83-95 kt, 154-177 kmh");
				break;
		}
	}
}

/* Screen Dump

Paste the output of your code here
 
 */