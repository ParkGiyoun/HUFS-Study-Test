package sec04_methods.a02_withReturnValues;

public class A01_MAX {

	public static void main(String[] args) {
		int i = 5;
		int j = 3;
		int k = max(i,j);
		
		System.out.println("The maximum between " + i + " and " + j + " is " + k);
		

	}
	
	public static int max(int i , int j ) {
// return���� �ִ� method --> if, �ڿ� else ������ ������ ġ��
		int result;
		if(i>j) {
			result = i;
		}
		else {
			result = j;
		}
		return result;
	}
}