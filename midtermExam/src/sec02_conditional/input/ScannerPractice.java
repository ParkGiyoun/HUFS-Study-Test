package sec02_conditional.input;

import java.util.*;
public class ScannerPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String StringValue1 = input.next();
		String StringValue2 = input.nextLine(); //return the rest of line
		
		System.out.println(StringValue1);
		System.out.println(StringValue2);
		
		int IntValue1 = input.nextInt();
		
		StringValue1 = input.nextLine(); 
//바로 앞에서 return한 값을 제외한 나머지 line을 다 return하므로 앞에서 숫자만 입력했다면 여기는 return되는 값이 없다.
		StringValue2 = input.next();
		
		System.out.println(IntValue1);
		
		System.out.println(StringValue1);
		System.out.println(StringValue2);
	}
}