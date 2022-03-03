/*

Program: OddSum.java          Last Date of this Revision: March 3, 2022

Purpose: Prompt the user to input a number, then adds all odd numbers between 1 and their number and prints the result.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter5;

import java.util.Scanner;

public class OddSum
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int sum = 0, userNumber;
		
		System.out.print("Enter a natural number: ");
		userNumber = userInput.nextInt();
		
		// add x to the sum if it is odd
		for (int x = 1; x <= userNumber; x++)
		{
			if (x % 2  == 1)
			{
				sum += x;
			}
		}
		
		System.out.printf("The sum is %d.", sum);
	}
}

/*

Enter a natural number: 9
The sum is 25.

*/
