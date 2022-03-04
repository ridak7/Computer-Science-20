/*

Program: DigitsSumExercise.java          Last Date of this Revision: March 3, 2022

Purpose: Prompt the user for a three digit number and print the sum of its digits.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter5;

import java.util.Scanner;

public class DigitsSumExercise
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int hundreds, tens, ones, userNumber, sum;

        // user must input an integer in between the range, will ask until that condition is met
        do
        {
            System.out.print("Enter a positive, three digit integer: ");
            userNumber = userInput.nextInt();
        }
        while (userNumber < 0 || userNumber > 999);

        // does the math to achieve the sum
        hundreds = userNumber / 100;
        tens = userNumber % 100 / 10;
        ones = userNumber % 10;
        sum = hundreds + tens + ones;

        System.out.printf("The sum of the digits is %d.", sum);
    }
}

/*

Enter a positive, three digit integer: 892
The sum of the digits is 19.

*/