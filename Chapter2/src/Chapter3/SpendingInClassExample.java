package Chapter3;

import java.text.NumberFormat;
import java.util.Scanner;

public class SpendingInClassExample 
{
	public static void main(String[] args)
	{
		int food, clothing, entertainment, rent;
		double totalExpenditure, foodPercent, clothingPercent, entertainmentPercent, rentPercent;
		
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the amount spent last month on the following items:\n");
		
		System.out.print("Food: $");
		food = userInput.nextInt();
		System.out.println();
		
		System.out.print("Clothing: $");
		clothing = userInput.nextInt();
		System.out.println();
		
		System.out.print("Entertainment: $");
		entertainment = userInput.nextInt();
		System.out.println();

		System.out.print("Rent: $");
		rent = userInput.nextInt();
		System.out.println();
		
		totalExpenditure = (food + clothing + entertainment + rent);
		foodPercent = food / totalExpenditure;
		clothingPercent = clothing / totalExpenditure;
		entertainmentPercent = entertainment / totalExpenditure;
		rentPercent = rent / totalExpenditure;
		
		System.out.println("Category: \tBudget:");
		System.out.println("Food\t\t" + nf.format(foodPercent));
		System.out.println("Clothing\t" + nf.format(clothingPercent));
		System.out.println("Entertainment\t" + nf.format(entertainmentPercent));
		System.out.println("Rent\t\t" + nf.format(rentPercent));
	}

}
