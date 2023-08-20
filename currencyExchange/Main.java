package currencyExchange;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int choice, amount;
		System.out.print("Welcome to the Currency Exchange\n");
		System.out.println("Choose one of these currency");
		System.out.println("1 - Real");
		System.out.println("2 - US Dollar");
		System.out.println("3 - Euro");
		choice = input.nextInt();
		input.nextLine();
		while(choice <= 0 || choice > 3) {
			System.out.println("Enter the correct number");
			choice = input.nextInt();
			

		}
		
		System.out.print("Enter the amount >> ");
		amount = input.nextInt();
		
	}
	
	public static int sum(int a, int b) {
		int sum = a + b;
		System.out.println("The sum of a + b is " + sum);
		return sum;
	}

}
