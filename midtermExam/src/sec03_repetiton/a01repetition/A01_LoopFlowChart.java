package sec03_repetiton.a01repetition;
/*
 * while(loop-continuation-condition)
 * {
 * 		//loop-body
 * 		Statement(s);
 * }
 */

/*  + thing
 * Math.randon()
 * 		--> It returns a "double" value with positive sign  0.0<random<1.0
 * 
 */
public class A01_LoopFlowChart {

	public static void main(String[] args) {
		int count = 0;				// Initialize count
		while (count <100) {  	//count 의 값이 100보다 작은 경우 계속 반복하게 됨.
			System.out.println("Welcome to Java");
			count ++; 				
			// while 문 마지막에 count의 값에 1을 더함으로써 while문이 무한으로 진행되는 것을 방지함 
		}
		
		int random = (int)(Math.random()*101); // 0~1사이 랜덤 --> 0.XXXXX이므로 100을 곱한 뒤, int로 타입 변환 하면 1~99 가 나옴.
		// 1 에서 100 사이의 숫자를 랜덤으로 받기 위해서는 101을 곱하면 됨. --> 최댓값이 99.9999 + 0.99999 --> 100.99999
		// int로 캐스팅 --> 최댓값은 100 이 됨.
		
		System.out.println(random);
	}

}
