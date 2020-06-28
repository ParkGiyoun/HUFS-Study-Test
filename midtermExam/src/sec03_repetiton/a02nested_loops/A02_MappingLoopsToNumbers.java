package sec03_repetiton.a02nested_loops;

// 가장 이상적인 방법은 각 넘버별 숫자 차이를 보고,
//그 숫자가 뭐의 배수인지 알아내면 엄청 빨리 찾아낼 수 있음!

public class A02_MappingLoopsToNumbers {
//4 7 10 13 16
/*	num	value     3*num	3*num+1
 * 	1		4			3			4
 * 	2		7			6			7
 * 	3		10			9			10
 * 	4		13			12			13
 * 	5		16			15			16
 * 
 * 
 * value 값에서 숫자를 더하고 빼고 하면서 특정숫자의 구구단
 * 모양과 비슷한지 확인 
 */
	
/* 2 7 12 17 22
 * count		number 		num + 3	 == count*5	count*5-3
 * 1			2				5								2
 * 2			7				10								7
 * 3			12				15								12
 * 4			17				20								17
 * 5			22				25								22
 */
	
/*17 13 9 5 1
 * count		num  	차이		-21		count*(-4)+21
 * 1			17						-4
 * 2			13			-4			-8
 * 3			9			-4			-12
 * 4			5			-4			-16
 * 5			1			-4			-20
 * 
 */
	public static void main(String[] args) {
		for(int i =1 ; i<=5;i++) {
			System.out.print(3*i+1+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		for(int i =1; i<=5;i++) {
			System.out.print(5*i-3 +" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		for(int i =1;i<=5;i++) {
			System.out.print(-4*i+21 + " ");
		}
	}

}
