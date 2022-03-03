/*

Program: MathTutorExercise.java          Last Date of this Revision: March 2, 2022

Purpose: Prompt the user to answer the generated equation and compare to the solution.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter5;

import java.util.Scanner;

public class NumbersSum
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int userNumber;
		
		System.out.print("Enter a natural number: ");
		userNumber = userInput.nextInt();
		
		for (int x = 1; x <= userNumber; x++)
		{
			System.out.println(x);
		}
	}
}

/*

Enter a natural number: 10
1
2
3
4
5
6
7
8
9
10


*/
