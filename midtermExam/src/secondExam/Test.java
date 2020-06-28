package secondExam;

public class Test {

	public static void main(String[] args) {
		
		String s1 = "HUFS";
		String s2 = "hufs";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.print("22");
		}
		
		int[] values = new int[5];
		int sum =0;
		for(int i =1 ; i<5 ;i++) {
			values[i] = i + values[i-1];
			sum+=values[i];
		}
		System.out.println(sum);

	}

}
