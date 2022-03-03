/*

Program: Evens.java          Last Date of this Revision: March 3, 2022

Purpose: Print all the even numbers between 1-20.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter5;

public class Evens
{
	public static void main(String[] args)
	{
		for (int x = 1; x <= 20; x++)
		{
			if (x % 2 == 0)
			{
				System.out.println(x);
			}
		}
	}
}

/*

2
4
6
8
10
12
14
16
18
20


*/