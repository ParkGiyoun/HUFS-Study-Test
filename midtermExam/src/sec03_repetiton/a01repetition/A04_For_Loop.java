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
		System.out.println("1부터 "+ i + "까지의 합은 " + sum + "입니다.");
		
		System.out.println("Test 구간");
		/*
		* for ( ; ; ) {
		* System.out.println("이렇게 한 것을 while문의 조건이 true 인 경우와 같다");
		*/
		int j =1;
		for( ;j<=10 ; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
