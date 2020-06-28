package sec05_arrays.a01_numeric_data;

import java.util.Arrays;

public class A02_Initializing_arrays_with_inputValues {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double[] myList = new double[10];
		System.out.print("ENTER " + myList.length + " values: ");
		for(int i = 0;  i < myList.length ; i++) {
			myList[i] = input.nextDouble();
		}
		printArray(myList);
		System.out.println("\n"+summing(myList));
		findLargest(myList);
		
		System.out.println("---------------");
		System.out.println(Arrays.toString(myList));

	}
	public static void printArray(double[] list) {
		for(int i = 0;  i < list.length ; i++) {
			System.out.print(list[i] + " ");
		}
	}
	public static double summing(double[] myList) {
		double total = 0;
		for(int i = 0;  i < myList.length ; i++) {
			total += myList[i];
		}
		return total;
	}
	public static void findLargest(double[] myList) {
		double max = myList[0];
		for(int i = 1;  i < myList.length ; i++) {
			if(myList[i]>max) {
				max = myList[i];
			}
		}
		System.out.println(max);
	}

}
