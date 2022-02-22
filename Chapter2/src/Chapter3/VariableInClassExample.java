/*

Program: VariableInClassExample.java          Last Date of this Revision: February 22, 2022

Purpose: Take three numbers and add them together (context: distances in a race into total)

Author: Nathaniel Edillon
School: CHHS
Course: Computer Science 20
 

*/

package Chapter3;

import java.util.Scanner;

public class VariableInClassExample 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double first, second, third, distance;
		
		System.out.println("Calculate the distances of a race in the following segments.\n\n");
		
		System.out.print("Input the distance of the first segment in kilometers: ");
		first = input.nextDouble();
		// System.out.println(first);	** debug line
		
		System.out.print("Input the distance of the second segment in kilometers: ");
		second = input.nextDouble();
		// System.out.println(second);	** debug line
		
		System.out.print("Input the distance of the third segment in kilometers: ");
		third = input.nextDouble();
		// System.out.println(third);	** debug line
		
		distance = first + second + third;
		System.out.print("\nThe total distance of the race is " + distance + " kilometers.");
	}
}

/* Screen dump 

Calculate the distances of a race in the following segments.


Input the distance of the first segment in kilometers: 4.2
Input the distance of the second segment in kilometers: 5.6
Input the distance of the third segment in kilometers: 1.9

The total distance of the race is 11.70000000000001 kilometers.

*/
