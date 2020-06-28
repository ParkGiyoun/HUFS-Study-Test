package sec03_repetiton.a01repetition;

public class A02_Caution_loopWithDouble {

	public static void main(String[] args) {
		double item = 1;
		double sum = 0;
		
		while(item!=0) {
			sum += item;
			System.out.println(sum);
			item -=0.1;
			// It seems OK on the surface, but it is actually an infinite loop
//reason
/*
 * double value --> there is no guarantee "exactly 0" in double value
 */
		}
	}
}
