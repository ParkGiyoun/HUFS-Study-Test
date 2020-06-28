package sec03_repetiton.a02nested_loops;

// ���� �̻����� ����� �� �ѹ��� ���� ���̸� ����,
//�� ���ڰ� ���� ������� �˾Ƴ��� ��û ���� ã�Ƴ� �� ����!

public class A02_MappingLoopsToNumbers {
//4 7 10 13 16
/*	num	value     3*num	3*num+1
 * 	1		4			3			4
 * 	2		7			6			7
 * 	3		10			9			10
 * 	4		13			12			13
 * 	5		16			15			16
 * 
 * 
 * value ������ ���ڸ� ���ϰ� ���� �ϸ鼭 Ư�������� ������
 * ���� ������� Ȯ�� 
 */
	
/* 2 7 12 17 22
 * count		number 		num + 3	 == count*5	count*5-3
 * 1			2				5								2
 * 2			7				10								7
 * 3			12				15								12
 * 4			17				20								17
 * 5			22				25								22
 */
	
/*17 13 9 5 1
 * count		num  	����		-21		count*(-4)+21
 * 1			17						-4
 * 2			13			-4			-8
 * 3			9			-4			-12
 * 4			5			-4			-16
 * 5			1			-4			-20
 * 
 */
	public static void main(String[] args) {
		for(int i =1 ; i<=5;i++) {
			System.out.print(3*i+1+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		for(int i =1; i<=5;i++) {
			System.out.print(5*i-3 +" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		for(int i =1;i<=5;i++) {
			System.out.print(-4*i+21 + " ");
		}
	}

}
