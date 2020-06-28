package sec05_arrays.a02_forCalculation_Tallying;

import java.util.Arrays;

public class A01_TallyingExample {
//229231007
	public static void main(String[] args) {
		int number = 229231007;
		int[] list = new int[10];
		
		
		while(number>0) {
			int num = number%10;
			list[num] ++;
			number/=10;
		}
		System.out.println(Arrays.toString(list));		
	}
}
