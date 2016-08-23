package primeraClase;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args){
		
		double PI = Math.PI;
		double area, circunference;
		double radius;
		
		System.out.println("De el radio del circulo:");
		Scanner in = new Scanner(System.in);
		
		radius = in.nextDouble();
		
		area = PI * radius * radius;
		circunference = PI * radius * 2;
		
		System.out.println("El area del circulo es : " + area);
		System.out.println("La circunferencia del circulo es: " + circunference);
		
		in.close();
		
	
		
	}

}
