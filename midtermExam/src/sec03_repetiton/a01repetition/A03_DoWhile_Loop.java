package sec03_repetiton.a01repetition;
/*
 * Do- while 문 
 * --> 처음부터 조건을 파악하고 실행하는 것이 아닌,
 * 		 일단 처음에 실행부터 하고, 조건 파악한 뒤,
 * 	 	 조건에 부합하는 동안 그 do의 block내용(loop body)
 *       을 반복
 * 
 * while 문과 다르게 일단 그 내용을 먼저 실행하고 본다는
 *  것이 차이점임.
 */
public class A03_DoWhile_Loop {

	public static void main(String[] args) {
		int initial = 1, i = 1;
		int sum = 0;
		//do-while문
		do {
			sum += i;
			System.out.println(sum);
			System.out.println(i);
			System.out.println("-----------------------------");
			i ++ ;
			
		} while(i<=10) ;
		
		i -- ;
		System.out.println("최종 계산 결과 : " + sum);
		System.out.println(initial + "부터 " + i +"까지 더한 결과치 입니다.");
	}

}
