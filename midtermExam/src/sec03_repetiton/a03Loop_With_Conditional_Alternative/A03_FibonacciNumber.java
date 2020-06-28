package sec03_repetiton.a03Loop_With_Conditional_Alternative;
//1 1 2 3 5 8 13 21 34

/*a b c    // 두번째 숫자 출력할 때, 그 출력한 숫자는 다음번 출력할 숫자의 전전 숫자가 되므로 그 다음 피보나치 수열을 구할 때 필요 하므로 A에다 return
 *   a b c // 두번째 숫자를 B로 출력 후 C를 구한 뒤 그 C를 B에 대입하면 다음 출력할 숫자가 나옴
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
		
		System.out.print("출력할 수열의 갯수를 입력하시오 : ");
		int num = input.nextInt();
		
		for(int i = 1 ; i<=num ; i++) {
			System.out.print(b + " "); //뒤에 숫자 출력
			int next = a + b;				
			//그 다음 올 숫자 = 방금 출력한 숫자 + 그 앞에 숫자
			a = b;							
			// 다음번에 출력할 숫자보다 앞에 있는 숫자가 방금 출력한 숫자가 됨
			b = next;
			// 다음번에 출력할 숫자를 b에 대입함으로써 다음번에 b를 출력하더라도 문제x
			
		}
		
	}

}
