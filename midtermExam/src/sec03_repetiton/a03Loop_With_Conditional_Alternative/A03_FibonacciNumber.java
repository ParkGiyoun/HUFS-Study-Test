package sec03_repetiton.a03Loop_With_Conditional_Alternative;
//1 1 2 3 5 8 13 21 34

/*a b c    // �ι�° ���� ����� ��, �� ����� ���ڴ� ������ ����� ������ ���� ���ڰ� �ǹǷ� �� ���� �Ǻ���ġ ������ ���� �� �ʿ� �ϹǷ� A���� return
 *   a b c // �ι�° ���ڸ� B�� ��� �� C�� ���� �� �� C�� B�� �����ϸ� ���� ����� ���ڰ� ����
 *      a b c
 *         a b c
 *            a b c
 */
import java.util.*;
public class A03_FibonacciNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 1;
		
		System.out.print("����� ������ ������ �Է��Ͻÿ� : ");
		int num = input.nextInt();
		
		for(int i = 1 ; i<=num ; i++) {
			System.out.print(b + " "); //�ڿ� ���� ���
			int next = a + b;				
			//�� ���� �� ���� = ��� ����� ���� + �� �տ� ����
			a = b;							
			// �������� ����� ���ں��� �տ� �ִ� ���ڰ� ��� ����� ���ڰ� ��
			b = next;
			// �������� ����� ���ڸ� b�� ���������ν� �������� b�� ����ϴ��� ����x
			
		}
		
	}

}
