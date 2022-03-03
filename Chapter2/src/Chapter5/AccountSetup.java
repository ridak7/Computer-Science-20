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
		
		do
		{
			System.out.print("Enter a password that is at least 8 characters: ");
			password = userInput.nextLine();
		}
		while (password.length() < 8);
		
		System.out.printf("Your username is %s and your password is %s", username.toLowerCase(), password.toLowerCase());
	}
}
