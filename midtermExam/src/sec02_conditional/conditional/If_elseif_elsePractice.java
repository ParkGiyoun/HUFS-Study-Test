package sec02_conditional.conditional;

import java.util.*;
public class If_elseif_elsePractice {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("1~5사이의 숫자를 입력하세요 : ");
		int i = input.nextInt();
		
		if(i == 1) {
			System.out.println("i : "+i);
		}
		else if(i >= 2 && i <= 5) {
			System.out.println("i는 1이 아니라 " +i+" 입니다.`");
		}
		else {
			System.out.println("i는 1~5 사이의 숫자가 아닙니다.");
		}
		
		String b = i==1? "완벽하네 ^^" : "" ;
		// a?b:c; a라는 조건을 만족하면 b를 return하고, 조건을 만족하지 않으면, c를 return한다.
		System.out.println(b);
		
		// String 타입간의 문자 비교 --> 변수.equal(비교할 변수) 아니면, 변수.equalsIgnoreCase(비교할 변수) 
				//==> return 값은 True or False 
		System.out.print("이름이 뭔가요? : ");
		String name = input.next();
		if(name.equals("박기윤")) {
			System.out.println("박기윤 이군요!");
		}
		else if( name.equalsIgnoreCase("박준기")) {
			System.out.println("박기윤 사촌동생이군요!");
		}
		else {
			System.out.println("박기윤이 아닙니다.");
		}
	}
}
/*
 * &&:and
 * || : or
 * ^ : exclusive or
 * 
 */