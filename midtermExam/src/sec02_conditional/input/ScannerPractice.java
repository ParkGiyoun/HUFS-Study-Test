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
//�ٷ� �տ��� return�� ���� ������ ������ line�� �� return�ϹǷ� �տ��� ���ڸ� �Է��ߴٸ� ����� return�Ǵ� ���� ����.
		StringValue2 = input.next();
		
		System.out.println(IntValue1);
		
		System.out.println(StringValue1);
		System.out.println(StringValue2);
	}
}