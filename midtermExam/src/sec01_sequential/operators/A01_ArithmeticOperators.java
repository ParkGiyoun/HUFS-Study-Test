package sec01_sequential.operators;

public class A01_ArithmeticOperators {

	public static void main(String[] args) {
		// 더하고 빼고 곱하고 나누고 나머지구하는게 다임.
		// 만약 int 타입이면 나눗셈 한 뒤, 소수점 나와도 소수점 그냥 다 잘라버리고 출력함.
		
		/*
		 * Precedence(우선)
		 *  (괄호)  >> *, /, % >> +-
		 *  같은것 끼리는 그냥 왼쪽부터 계산
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
		//String 과 다른 value를 +로 연결해서 더 길게 만들 수 있다.
		/*
		 * 따라서 
		 * 1) String 이전에 정수사이 + 가 있으면 그 숫자를 더한다. 
		 * 2) String + 정수 이렇게 오면 정수가 String으로 들어가게 된다. 따라서
		 * String + 1+2 이렇게 오면 왼쪽부터 계산하므로 String12가 출력된다.
		 * 
		 * 3) *or, /는 +보다 먼저 실행하므로 String + 3*5 의 경우 String15가 출력됨.
		 * 4) 
		 */
		
		/*
		 * System.out.println("String" + 3 - 1); 얘는 불가능! 왜냐하면 +부터 하면 String3이라는 String타입 - 정수가 되기때문.
		 */
	}

}
