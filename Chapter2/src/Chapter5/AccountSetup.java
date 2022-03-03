/*

Program: AccountSetup.java          Last Date of this Revision: March 3, 2022

Purpose: Prompt the user to input a username and password, which must require 8 characters, and print them in lowercase.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter5;

import java.util.Scanner;

public class AccountSetup
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		String username, password;
		
		System.out.print("Enter a username: ");
		username = userInput.nextLine();
		
		// ask for a password, then repeat if the password is lesser than 8 characters long
		do
		{
			System.out.print("Enter a password that is at least 8 characters: ");
			password = userInput.nextLine();
		}
		while (password.length() < 8);
		
		System.out.printf("Your username is %s and your password is %s", username.toLowerCase(), password.toLowerCase());
	}
}

/*

Enter a username: NATTYEDDY
Enter a password that is at least 8 characters: TriCk
Enter a password that is at least 8 characters: n00bMAst3r69
Your username is nattyeddy and your password is n00bmast3r69

*/
