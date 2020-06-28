package sec03_repetiton.a03Loop_With_Conditional_Alternative;

import java.util.*;
public class A01_GuessNumberUsingBreak {

	// continue ==> 조건 맞을 시 그 다음 내용 생략하고 반복문 계속 진행
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value = (int)(Math.random()*11);
		int guess = 0;
		int trying = 1;
		while(true) {
			System.out.print("1~10사이의 숫자중 하나를 입력하세요: ");
			guess = input.nextInt();
			
			if(value == guess) {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수: " + trying);
				break;
			}
			else{
				System.out.println("정답이 아닙니다.");
				trying ++ ;
			}
			
		}
		
		for(int i =2; i<=9; i++) {
			System.out.println("\n***** " + i + "단 *****");
			for(int j = 1; j<=9; j++) {
				if((i*j)%2 != 0) {
					continue; // continue;를 지나게 되면, 반복문에서의 남은 문장들 다 생략하고 계속 반복함.
					//break;랑 다른점이라고 하면, break는 아예 반복문을 그자리에서 끝내버림
					//But, 얘는 반복을 계속 하되, continue 뒤에 오는 내용들은 생략함.
				}
				
				System.out.println(i+"X"+j+"="+i*j+"\t");
			}
		}
		
		
	}

}
