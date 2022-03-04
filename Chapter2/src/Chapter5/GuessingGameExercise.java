/*

Program: GuessingGameExercise.java          Last Date of this Revision: March 3, 2022

Purpose: Generate a number, then have the user guess the number until they win!

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter5;

import java.util.Scanner;

public class GuessingGameExercise
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int userGuess = 0, randomNumber = (int)(19 * Math.random() + 1);

        // repeats until the user guesses the number
        do
        {
            System.out.print("Guess the number between 1-20: ");
            userGuess = userInput.nextInt();
            
            // win condition and try again messages
            if (userGuess == randomNumber)
            {
                System.out.print("You win!");
                
            }
            else if (userGuess < randomNumber)
            {
                System.out.println("Too low. Try again!");
            }
            else if (userGuess > randomNumber)
            {
                System.out.println("Too high. Try again!");
            }
        }
        while (userGuess != randomNumber);
    }
}

/*

Guess the number between 1-20: 10
Too low. Try again!
Guess the number between 1-20: 15
Too high. Try again!
Guess the number between 1-20: 13
Too high. Try again!
Guess the number between 1-20: 11
You win!

*/