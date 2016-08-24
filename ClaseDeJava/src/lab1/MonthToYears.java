package lab1;

import java.util.Scanner;

public class MonthToYears {

	public static void main(String[] args) {
		
		int userMonths, years, residualMonths;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter your age in months: ");
		userMonths = keyboard.nextInt();
		
		years = userMonths / 12;
		
		residualMonths = userMonths % 12;
		
		System.out.print("Your age in years and months is: ");
		System.out.println(years + " years and " + residualMonths + " months");
		
		keyboard.close();
	}

}
