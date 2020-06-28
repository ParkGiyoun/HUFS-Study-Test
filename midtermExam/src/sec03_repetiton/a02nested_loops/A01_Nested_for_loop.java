package sec03_repetiton.a02nested_loops;

public class A01_Nested_for_loop {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =1;i<=5;i++) {
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
