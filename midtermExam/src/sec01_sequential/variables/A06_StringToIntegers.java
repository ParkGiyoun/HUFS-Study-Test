package sec01_sequential.variables;

public class A06_StringToIntegers {

	public static void main(String[] args) { //��Ʈ�� Ÿ���� ���� Ÿ������ �Ľ� parse
		String a  = "123";
		int intValue = Integer.parseInt(a);
		System.out.println(intValue + 2);//result == 125
		
		double DoubleValue = Double.parseDouble(a);
		System.out.println(DoubleValue + 2.3);//result == 125.3
		
		
	}

}