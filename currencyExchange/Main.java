package currencyExchange;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int choice;
		double amount;
		System.out.print("Welcome to the Currency Exchange\n");
		System.out.println("Choose one of these currency");
		System.out.println("1 - US Dollar to Brazilian Real");
		System.out.println("2 - Euro to Brazilian Real");
		System.out.println("3 - Canadian Dollar to Brazilian Real");
		choice = input.nextInt();
		input.nextLine();
		while(choice <= 0 || choice > 3) {
			System.out.println("Enter the correct number");
			choice = input.nextInt();	
		}
		
		System.out.print("Enter the amount >> ");
		amount = input.nextDouble();
		
		if(choice == 1) {
			usDollarToReal(amount);
		}
		else if(choice == 2) {
			euroToReal(amount);
		}
		else if(choice == 3) {
			canadianToReal(amount);
		}
		
	}
	
	public static void usDollarToReal(double amount) {
		System.out.println("$1 US Dollar = R$4.97 Brazilian Real");
		double convert = amount*4.97;
		System.out.println("$" + amount + " dollar = " + "R$" + String.format("%.2f", convert) + " Brazilian Real");
		
	}
	
	public static void euroToReal(double amount) {
		System.out.println("Є1 euro  = R$5.41 Brazilian Real");
		double convert = amount*5.41;
		System.out.println("Є" + amount + " euro = " + "R$" + String.format("%.2f", convert) + " Brazilian Real");
		
	}
	
	public static void canadianToReal(double amount) {
		System.out.println("CA$1 Dollar = R$3.66 Brazilian Real");
		double convert = amount*3.66;
		System.out.println("CA$" + amount + " CA dollar = " + "R$" + String.format("%.2f", convert) + " Brazilian Real");
		
	}

}
