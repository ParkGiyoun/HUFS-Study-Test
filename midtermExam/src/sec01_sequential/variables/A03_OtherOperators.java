package sec01_sequential.variables;

public class A03_OtherOperators {

	public static void main(String[] args) {
		// Shortcut Assignment Operators
		/*
		 * i += 8			==		i = i+8
		 * -=   *=   /=   %= �� �Ȱ���
		 */
		
		//increment and decrement operators
		int a = 1;
		System.out.println(a++); // ���� �ϰ� ���� 1����
		System.out.println(a);
		a = 1;
		System.out.println("-------------------------------");
		
		System.out.println(++a);// ���ϰ� �����Ŵ
		
		//--���� �������� & ��� 1�� ���� ��
		//ex)
		int i = 10;
		int newNum = 10 * i++;
		//in newNum = 10*i; i=i+1; �̶� ��������
		
		//int k = ++i+i;������ ���°� ���ض� --> �˾ƺ��� �����(�б� �����)
		
	}

}
