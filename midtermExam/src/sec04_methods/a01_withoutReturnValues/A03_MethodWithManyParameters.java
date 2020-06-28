package sec04_methods.a01_withoutReturnValues;

import java.util.*;

public class A03_MethodWithManyParameters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		int batch;//the year you enter university
		
		while(!name.equalsIgnoreCase("exit")) {
			System.out.print("Input your name: ");
			name = input.next();
			System.out.print("Input your batch: ");
			batch = input.nextInt();
			
			printTheName(name,batch);
		}
		System.out.println("Thank you!");
	}
	public static void printTheName(String n , int batch) {
		if(!n.equalsIgnoreCase("exit")) {
			System.out.print(n);
			System.out.print(" is a good name");
			System.out.println(" in the batch of " + batch);
			System.out.println("---------------------------\n");
		}
	}

}
