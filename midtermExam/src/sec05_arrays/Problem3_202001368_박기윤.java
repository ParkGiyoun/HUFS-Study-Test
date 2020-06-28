package sec05_arrays;

import java.util.*;
public class Problem3_202001368_¹Ú±âÀ± {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] inputArray = new int[20];
		System.out.println("Please input your numbers.\n");
		int inputThing = 1;
		int TheNum =0; // the number of elements
		
		while(inputThing>0 && TheNum <=20) {
			System.out.print("Number " + (TheNum+1) + " : ");
			inputThing = input.nextInt();
			
			if(inputThing > 0 && TheNum <=20) {
				inputArray[TheNum] = inputThing; 
				TheNum++;
			}
			
		}
		
		System.out.println();
		double sum =0;
		for(int i = 0 ; i<inputArray.length ; i++) {
			sum += inputArray[i];
		}
		
		double avg = sum/TheNum;
		System.out.println("Average : " + avg);
		
		frequency(inputArray,avg);
		
	}
	//this method print the frequency of numbers that are greater than the average
	public static void frequency(int[] inputArray, double avg ) {
		int numOfGreat = 0;
		for(int i = 0 ; i< inputArray.length ; i ++) {
			if(inputArray[i] > avg) {
				numOfGreat++;
			}
		}
		System.out.println("There are " + numOfGreat + " numbers greater than " + avg);
	}
	

}
