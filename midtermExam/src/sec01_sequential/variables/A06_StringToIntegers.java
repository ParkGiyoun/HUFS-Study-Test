package sec01_sequential.variables;

public class A06_StringToIntegers {

	public static void main(String[] args) { //스트링 타입을 숫자 타입으로 파싱 parse
		String a  = "123";
		int intValue = Integer.parseInt(a);
		System.out.println(intValue + 2);//result == 125
		
		double DoubleValue = Double.parseDouble(a);
		System.out.println(DoubleValue + 2.3);//result == 125.3
		
		
	}

}