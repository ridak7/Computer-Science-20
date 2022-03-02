/*

Program: MathTutorExercise.java          Last Date of this Revision: March 2, 2022

Purpose: Prompt the user to answer the generated equation and compare to the solution.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter4;

import java.util.Scanner;

public class MathTutorExercise
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int value1 = (int) ((10) * Math.random() + 1), 
			value2 = (int) ((10) * Math.random() + 1), 
			operationRNG = (int) ((4) * Math.random() + 1);
		double userAnswer = 0, maths = 0, doubleValue1;
		char operation = '0';
		
		switch (operationRNG)
		{
			case 1:
				maths = value1 + value2;
				operation = '+';
				break;
			case 2:
				maths = value1 - value2;
				operation = '-';
				break;
			case 3:
				maths = value1 * value2;
				operation = 'x';
				break;
			case 4:
				doubleValue1 = value1;
				maths = doubleValue1 / value2;
				operation = '/';
				break;
		}
		
		System.out.printf("%d %c %d = ", value1, operation, value2);
		userAnswer = userInput.nextDouble();
		
		if (userAnswer == maths)
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.printf("Incorrect. The correct answer is %.2f", maths);
		}
	}
}

/* Screen Dump
 
5 + 1 = 4
Incorrect. The correct answer is 6.00 
 
5 x 2 = 10
Correct!
 
*/
