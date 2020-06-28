package sec04_methods.a01_withoutReturnValues;

import java.util.*;
public class A02_MethodWithOneParameter {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String name = "";
		
		while(!name.equalsIgnoreCase("exit")) {
			System.out.print("Input your name : ");
			name = input.next();
			printThename(name);
		}
		System.out.println("Thank you!");

	}
	public static void printThename(String n ) {
		if(!n.equals("exit")) {
			System.out.print(n);
			System.out.println(" is a good name");
		}
	}

}
