package sec01_sequential.operators;

public class A02_Question {

	public static void main(String[] args) {
		//01 odd or even?
		System.out.println(5%2); // result == 1 --> odd
		System.out.println(4%2); // result == 0 --> even
		
		//02 ����
		int saturday = 6;
		int afterDay = 10;
		int result = (saturday + afterDay) % 7; //������ 1���� �� ȭ �� �� �� �� ��
		
		System.out.println(result);
		
		
	}

}
