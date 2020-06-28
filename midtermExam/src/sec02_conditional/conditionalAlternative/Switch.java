package sec02_conditional.conditionalAlternative;

import java.util.*;
public class Switch {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		int i = input.nextInt();
		
		switch(i){
			case 1 :
				System.out.println(i);
				break;
			case 2 :
				System.out.println(i);
				break;
			default:
				System.out.println("잘못된 선택입니다.");
		}
	}

}
