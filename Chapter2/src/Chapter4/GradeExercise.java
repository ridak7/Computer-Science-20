/*

Program: GradeExercise.java          Last Date of this Revision: March 1, 2022

Purpose: Ask the user for a grade in percent, then give the corresponding letter grade.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter4;

import java.util.Scanner;

public class GradeExercise
{
	public static void main(String[] args)
	{
		// all the variables used are here
		Scanner userInput = new Scanner(System.in);
		int percentGrade;
		char grade;
		
		System.out.print("Enter your grade in percentage: ");
		percentGrade = userInput.nextInt();
		
		// determine the corresponding grade
		switch (percentGrade)
		{
			case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
				grade = 'A';
				break;
			case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
				grade = 'B';
				break;
			case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
				grade = 'C';
				break;
			case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69:
				grade = 'D';
				break;
			default:
				grade = 'F'; // I could include an invalid grade precaution, but as far as you're concerned you get an F.
				break;
		}
		
		System.out.printf("The corresponding letter Grade is: %c", grade);
	}
}

/*

Enter your grade in percentage: 69
The corresponding letter Grade is: D

*/