package sec03_repetiton.a03Loop_With_Conditional_Alternative;
/*suppose that the tution for a university is $10,000 this year
 * tuition increases 7% every year.
 * how many years will the tuition be doubled?
*/
public class A05_predictingTheFutureTuition {

	public static void main(String[] args) {
		double initialTuition = 10000;
		double tuition = initialTuition;
		int year = 0; 
		
		// 몇년 지났는지 알려주기 위한 변수
		while(tuition < 2*initialTuition) {
			tuition *= 1.07;
			year ++;
		}
		System.out.println(year);

	}

}
