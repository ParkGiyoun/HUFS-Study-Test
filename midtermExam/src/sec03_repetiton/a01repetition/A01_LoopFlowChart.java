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
		while (count <100) {  	//count �� ���� 100���� ���� ��� ��� �ݺ��ϰ� ��.
			System.out.println("Welcome to Java");
			count ++; 				
			// while �� �������� count�� ���� 1�� �������ν� while���� �������� ����Ǵ� ���� ������ 
		}
		
		int random = (int)(Math.random()*101); // 0~1���� ���� --> 0.XXXXX�̹Ƿ� 100�� ���� ��, int�� Ÿ�� ��ȯ �ϸ� 1~99 �� ����.
		// 1 ���� 100 ������ ���ڸ� �������� �ޱ� ���ؼ��� 101�� ���ϸ� ��. --> �ִ��� 99.9999 + 0.99999 --> 100.99999
		// int�� ĳ���� --> �ִ��� 100 �� ��.
		
		System.out.println(random);
	}

}
