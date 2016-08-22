package inelNameCoder;

import java.util.Scanner;

public class NameCoder {
	
	static String[] alphabet = {"0", "1", "2", "3", "4", "5", 
			"6", "7", "8", "9", "a", "b", "c",
			"d", "e", "f", "g", "h", "i", "j", 
			"k", "l", "m", "n", "o", "p", "q", 
			"r", "s", "t", "u", "v", "w", "x", 
			"y", "z" };
	
	static String[] nameLetters;
	
	public static void main(String[] args){
		
		
		
		getName();
		double base = getLargestLetterIndex();
		System.out.println("El numero seria base: " + base);
		
		double nameInNumbers = convertToNumbers(nameLetters, base);
		
		
		System.out.println(nameInNumbers);
		
		
		
		
		
	}
	
	private static void getName(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Este programa codifica tu nombre y te dice a que base esta.");
		
		System.out.println("Ingresa tu nombre: ");
		String name = in.nextLine();
		
		nameLetters = name.split("");
		
		in.close();
	}
	
	private static int getLargestLetterIndex(){
		
		int cont = 0, largest = 0;
			
		for(int o = 0; o < nameLetters.length; o++){
				
			String letter = nameLetters[o];

			for(int i = 0; i < alphabet.length; i++){
					
					
				if(letter.equals(alphabet[i])){
						
					cont = i + 1;
						
					if(cont > largest){
						largest = cont;
							
					}	
				}
			}	
		}
		
		return largest;
	}
	
	private static double convertToNumbers(String[] name, double base){
		
		double nameNumber = 0;
		int letterNumber = 0;
		String nameLetter;
		
		for(int o = 0; o < name.length; o++){
			
			nameLetter = name[o];
			
			for(int i = 0; i < alphabet.length; i++){
				
				if(nameLetter.equals(alphabet[i])){
					letterNumber = i + 1;
				}
			}
			
			nameNumber +=  (letterNumber * (Math.pow(base, name.length - (o + 1))));
		}
		
		
		
		return nameNumber;
		
	}

}
