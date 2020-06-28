package sec01_sequential.variables;

public class A04_DataConversion {

	public static void main(String[] args) {
		//Implicit casting
		double d = 3; //(type widening)
		// Explicit casting
		int i = (int )3.0; //type narrowing
		int j = (int) 3.9; //Fraction part is truncated(길이를 줄이다)
		System.out.println(j);

	}
/*
 * 실수 타입의 계산에 있어서 데이터의 오류는 거의 필연적임 ex) 12.00000000001
 * 따라서 적절한 크기로 강제타입변환(Explicit casting)을 통해서 소수점 조절할 수 있음.
 * ex) 01-0 ppt의 ComputeBMI02.java  참조
 */
}
