package sec05_arrays.a03_forCharacter_TextProcessig;

import java.util.*;
public class A01_TextProcessing {
//String is array of char
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word = input.next();
		
		char firstLetter = word.charAt(0);
		if(firstLetter == 'c') {
			System.out.println("Good");
		}
		for(int i = 0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		//Main processing  #m,c,o	
		String voteText = "mmmmmccccccocooocooccmmcmcmcm";
		tallyVotes(voteText);
		
	}
	public static void tallyVotes(String voteText) {
		int[] tallies = new int[3];
		
		for(int i = 0;i<voteText.length();i++) {
			if(voteText.charAt(i) == 'm') {
				tallies[0] ++;
			}
			else if(voteText.charAt(i) == 'c') {
				tallies[1] ++;
			}
			else {
				tallies[2] ++;
			}
		}
		System.out.println("Votes: " + Arrays.toString(tallies));
	}
}