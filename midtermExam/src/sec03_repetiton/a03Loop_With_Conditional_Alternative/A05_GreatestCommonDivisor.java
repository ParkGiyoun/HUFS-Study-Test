package sec03_repetiton.a03Loop_With_Conditional_Alternative;

import java.util.*;
public class A05_GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int first=0,second=0,common=0;
		System.out.print("최대공약수 구할 두 숫자를 순서대로 입력하세요: ");
		first = input.nextInt();
		second = input.nextInt();
		
		for(int i =1 ; i<=Math.min(first, second) ; i++) {
			if(first % i ==0 && second % i ==0) {
				common=i;
			}
		}
		System.out.println("최대 공약수: " + common );
		
		System.out.println("\n------------------------\n두번째 방법 with while문\n");
		System.out.print("first integer: ");
		int n1 = input.nextInt();
		System.out.print("second integer: ");
		int n2 = input.nextInt();
		System.out.println();
		
		int gcd = 1; //최대 공약수 변수
		int k = 2; // 공약수 확인용 변수
		
		while(k<=n1 && k<=n2) { //확인용 변수가 입력한 숫자 둘다 보다 작아야함
			if(n1%k==0 && n2%k==0) { //공약수 맞는지 확인
				gcd = k;// 맞으면 GCD에 대입
			}
			k++;
		}
		
		System.out.println(n1+"과 "+n2+"의 최대 공약수: "+ gcd);
	}

}
