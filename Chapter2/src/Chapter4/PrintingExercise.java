/*

Program: PrintingExercise.java          Last Date of this Revision: March 1, 2022

Purpose: Ask the user for a number of copies, then print the price per copy and total price.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter4;

import java.util.Scanner;

public class PrintingExercise
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int copies;
		double price = 0, total;
		
		System.out.print("Enter the number of copies to be printed: ");
		copies = userInput.nextInt();
		
		if (copies > 0 && copies <= 99)
		{
			price = 0.30;
		}
		else if (copies >= 100 && copies < 500)
		{
			price = 0.28;
		}
		else if (copies >= 500 && copies < 750)
		{
			price = 0.27;
		}
		else if (copies >= 750 && copies <= 1000)
		{
			price = 0.26;
		}
		else if (copies > 1000)
		{
			price = 0.25;
		}
		
		total = price * copies;
		
		System.out.printf("Price per copy is: $%.2f\n", price);
		System.out.printf("Total cost: $%.2f", total);
	}
}

/*

Enter the number of copies to be printed: 1001
Price per copy is: $0.25
Total cost: $250.25 
 
*/
