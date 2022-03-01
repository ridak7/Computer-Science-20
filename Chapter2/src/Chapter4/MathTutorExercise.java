package Chapter4;

import java.util.Scanner;

public class MathTutorExercise
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int value1 = (int) ((10) * Math.random() + 1), value2 = (int) ((10) * Math.random() + 1), operationRNG = (int) ((4) * Math.random() + 1), maths;
		char operation;
		
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
				operation = '*';
				break;
			case 4:
				maths = value1 / value2;
				operation = '/';
				break;
		}
	}

}
