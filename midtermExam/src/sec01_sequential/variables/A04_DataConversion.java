package sec01_sequential.variables;

public class A04_DataConversion {

	public static void main(String[] args) {
		//Implicit casting
		double d = 3; //(type widening)
		// Explicit casting
		int i = (int )3.0; //type narrowing
		int j = (int) 3.9; //Fraction part is truncated(���̸� ���̴�)
		System.out.println(j);

	}
/*
 * �Ǽ� Ÿ���� ��꿡 �־ �������� ������ ���� �ʿ����� ex) 12.00000000001
 * ���� ������ ũ��� ����Ÿ�Ժ�ȯ(Explicit casting)�� ���ؼ� �Ҽ��� ������ �� ����.
 * ex) 01-0 ppt�� ComputeBMI02.java  ����
 */
}
