package sec03_repetiton.a02nested_loops;
/* ....1 
 * ...2
 * ..3
 * .4
 * 5
 */
/*		#dot		-1*count+5
 * 1	4
 * 2	3
 * 3	2
 * 4	1
 * 5	0
 */

/*
 * ....1
 * ...22
 * ..333
 * .4444
 * 55555
 */
/*		#dot	#number (==line)	-1 * line + 5
 * 1	4		1
 * 2	3(-1)	2
 * 3	2		3
 * 4	1		4
 * 5	0		5
 */

/*
 * ....1
 * ...2.
 * ..3..
 * .4...
 * 5....
 * 		#first dot = -1* num + 5 			#last dot
 * 1	4											0
 * 2	3											1
 * 3	2											2
 * 4	1											3
 * 5	0											4
 */
public class A03_Complex_Lines {

	public static void main(String[] args) {
		//first
		for( int i = 1 ; i <=5 ; i++) {
			for (int j = 1; j<=-i+5 ; j++) {
				System.out.print(".");
			}
			System.out.println(i);
		}
		System.out.println("--------------------------");
		
		//second
		for( int i = 1; i <=5 ; i++) {
			for(int j = 1; j <= -1 * i + 5 ; j++) {
				System.out.print(".");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		//third
		for(int i =1;i<=5;i++) {
			for(int j = 1 ; j<= -i+5 ; j++) {
				System.out.print(".");
			}
			System.out.print(i);
			for(int j = 1 ; j <= i-1 ; j++) {
				System.out.print(".");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
	}

}
