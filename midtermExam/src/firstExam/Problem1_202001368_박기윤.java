package firstExam;

import java.util.*;
public class Problem1_202001368_¹Ú±âÀ± {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Selection:");
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2.Celsius to Fahrenheit");
		System.out.println();
		
		System.out.print("Your choice: ");
		int choice = input.nextInt();
		if(choice ==1) {
			System.out.print("Input the degree of Fahrenheit: ");
			double F = input.nextDouble();
			System.out.println();
			double C = (F-32)*(5.0/9.0);
			System.out.println("The degree of Celsius is " + C);
			
			String output;
			if(C>=30) {
				output = "HOT";
			}
			else if(C>= 10 && C<30) {
				output = "COOL";
			}
			else {
				output = "COLD";
			}
			System.out.println("It is "+ output);
		}
		else if (choice ==2) {
			System.out.print("Input the degree of Celsius: ");
			double C = input.nextDouble();
			System.out.println();
			double F = C*(9.0/5.0)+32;
			System.out.println("The degree of Fahrenheit is " + F);
			
			String output;
			if(F>=86) {
				output = "HOT";
			}
			else if(F>= 50 && F<86) {
				output = "COOL";
			}
			else {
				output = "COLD";
			}
			System.out.println("It is "+output);
		}
		System.out.println();
		System.out.println("Thank you!");
		
	}
}