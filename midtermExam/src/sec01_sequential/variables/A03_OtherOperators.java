package sec01_sequential.variables;

public class A03_OtherOperators {

	public static void main(String[] args) {
		// Shortcut Assignment Operators
		/*
		 * i += 8			==		i = i+8
		 * -=   *=   /=   %= 다 똑같음
		 */
		
		//increment and decrement operators
		int a = 1;
		System.out.println(a++); // 실행 하고 나서 1더함
		System.out.println(a);
		a = 1;
		System.out.println("-------------------------------");
		
		System.out.println(++a);// 더하고 실행시킴
		
		//--역시 마찬가지 & 얘는 1씩 빼는 거
		//ex)
		int i = 10;
		int newNum = 10 * i++;
		//in newNum = 10*i; i=i+1; 이랑 같은거임
		
		//int k = ++i+i;같은거 쓰는거 피해라 --> 알아보기 어려움(읽기 어려움)
		
	}

}
