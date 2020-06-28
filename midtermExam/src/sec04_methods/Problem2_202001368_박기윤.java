package sec04_methods;

import java.util.*;
public class Problem2_202001368_¹Ú±âÀ± {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Selection");
		System.out.println("1. Permutation");
		System.out.println("2. Combination");
		System.out.println();
		
		System.out.print("Your choice: ");
		int choice = input.nextInt();
		System.out.print("Input n: ");
		int n = input.nextInt();
		System.out.print("Input r: ");
		int r = input.nextInt();
		if(choice == 1) {
			System.out.println();
			System.out.println("The permutation is " +Permutation(n,r) );
		}
		else if(choice == 2 ) {
			System.out.println();
			System.out.println("The combination is " +Combination(n,r) );
		}
		System.out.println();
		System.out.println("Thank you!");
	}
	//Permutation Method
	public static int Permutation(int n , int r) {
		int P =0;
		int a = 1;//n!
		int b = 1;
		for(int i = 1 ; i <= n ; i++) {
			a *= i;
		}
		for(int i =1 ; i <= n-r ; i++) {
			b *= i;
		}
		P = a/b;
		
		return P;
	}
	
	//Combination Method
	public static int Combination(int n , int r) {
		int C =0;
		int a = 1;//n!
		int b = 1;//(n-r)!
		int c = 1;//r!
		for(int i = 1 ; i <= n ; i++) {
			a *= i;
		}
		for(int i =1 ; i <= n-r ; i++) {
			b *= i;
		}
		for(int i = 1 ; i <= r ; i++) {
			c *=i;
		}
		C = a/(b*c);
		
		return C;
	}
}
