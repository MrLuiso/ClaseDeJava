package lab1;

import java.util.Scanner;

public class MyComplexNumber {

	public static void main(String[] args) {
		
		int a, b, c, d;
		
		int sum1, sum2;
		int mult1, mult2;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the complex numbre operator.");
		System.out.println("The numbers will be defined as n1 = a + b*i    n2 = c + d*i");
		
		System.out.print("Please enter the value for a: ");
		a = keyboard.nextInt();
		
		System.out.print("Please enter the value for b: ");
		b = keyboard.nextInt();
		
		System.out.print("Please enter the value for c: ");
		c = keyboard.nextInt();
		
		System.out.print("Please enter the value for d: ");
		d = keyboard.nextInt();
		
		System.out.println("n1 = " + a + " + " + b + "i");
		System.out.println("n2 = " + c + " + " + d + "i");
		
		
		sum1 = a + c;
		sum2 = b + d;
		
		mult1 = (a*c) - (b*d);
		mult2 = (a*d) + (b*c);
		
		
		System.out.println("The sum of n1 and n2 is: ");
		System.out.println("sum = " + sum1 + " + " + sum2 + "i");
		
		System.out.println("The multiplication of n1 and n2 is: ");
		System.out.println("multiplication = " + mult1 + " + " + mult2 + "i");
		
		
		keyboard.close();

	}

}
