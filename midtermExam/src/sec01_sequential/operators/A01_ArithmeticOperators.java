package sec01_sequential.operators;

public class A01_ArithmeticOperators {

	public static void main(String[] args) {
		// ���ϰ� ���� ���ϰ� ������ ���������ϴ°� ����.
		// ���� int Ÿ���̸� ������ �� ��, �Ҽ��� ���͵� �Ҽ��� �׳� �� �߶������ �����.
		
		/*
		 * Precedence(�켱)
		 *  (��ȣ)  >> *, /, % >> +-
		 *  ������ ������ �׳� ���ʺ��� ���
		 */
		System.out.println((1+3)*4);
		System.out.println(1+3*4-2);
		
		//Real numbers (type = double)
		System.out.println(2.23);
		
		//mixing type int + double == double 
		System.out.println(2.3*2);
		
		//String concatenation
		System.out.println("Hello"+42); // Hello42
		System.out.println("abc" + 1 + 3); //abc13
		System.out.println(1+3+"abc"); //4abc
		//String �� �ٸ� value�� +�� �����ؼ� �� ��� ���� �� �ִ�.
		/*
		 * ���� 
		 * 1) String ������ �������� + �� ������ �� ���ڸ� ���Ѵ�. 
		 * 2) String + ���� �̷��� ���� ������ String���� ���� �ȴ�. ����
		 * String + 1+2 �̷��� ���� ���ʺ��� ����ϹǷ� String12�� ��µȴ�.
		 * 
		 * 3) *or, /�� +���� ���� �����ϹǷ� String + 3*5 �� ��� String15�� ��µ�.
		 * 4) 
		 */
		
		/*
		 * System.out.println("String" + 3 - 1); ��� �Ұ���! �ֳ��ϸ� +���� �ϸ� String3�̶�� StringŸ�� - ������ �Ǳ⶧��.
		 */
	}

}
