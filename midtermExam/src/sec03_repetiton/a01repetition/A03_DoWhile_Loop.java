package sec03_repetiton.a01repetition;
/*
 * Do- while �� 
 * --> ó������ ������ �ľ��ϰ� �����ϴ� ���� �ƴ�,
 * 		 �ϴ� ó���� ������� �ϰ�, ���� �ľ��� ��,
 * 	 	 ���ǿ� �����ϴ� ���� �� do�� block����(loop body)
 *       �� �ݺ�
 * 
 * while ���� �ٸ��� �ϴ� �� ������ ���� �����ϰ� ���ٴ�
 *  ���� ��������.
 */
public class A03_DoWhile_Loop {

	public static void main(String[] args) {
		int initial = 1, i = 1;
		int sum = 0;
		//do-while��
		do {
			sum += i;
			System.out.println(sum);
			System.out.println(i);
			System.out.println("-----------------------------");
			i ++ ;
			
		} while(i<=10) ;
		
		i -- ;
		System.out.println("���� ��� ��� : " + sum);
		System.out.println(initial + "���� " + i +"���� ���� ���ġ �Դϴ�.");
	}

}
