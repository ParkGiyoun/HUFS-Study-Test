package sec03_repetiton.a01repetition;

public class A04_For_Loop {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i=1 ; i<=10 ; i++) { 
// initial-action in for loop can be list of zero 
// or more comma separated expressions.
			sum += i;
			System.out.println(i);
			System.out.println(sum);
			System.out.println("______________________");
		}
		i--;
		System.out.println("1���� "+ i + "������ ���� " + sum + "�Դϴ�.");
		
		System.out.println("Test ����");
		/*
		* for ( ; ; ) {
		* System.out.println("�̷��� �� ���� while���� ������ true �� ���� ����");
		*/
		int j =1;
		for( ;j<=10 ; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
