package sec05_arrays.a01_numeric_data;

public class A01_DeclaringArrayVaiables {

	public static void main(String[] args) {
		
		//declare
		double[] firstList;
		double secondList[]; //not preferred
		//creating Array
		firstList = new double[10];
		firstList[0] = 1;  	// first element
		firstList[9] = 10;	// last element
		
		//in One Step
		double[] myList = new double [10]; // num --> size
		double mysecond[] = new double[10];
		
		//length of an Array
		int length = myList.length;
		System.out.println(length);
		
		
		//Default Values
		/*
		 * numeric 	--> 0
		 * char		--> \u0000
		 * boolean	--> false
		 */
		//����
		double[] mylist = {1.3,4.2,4.5};
		//�Ұ���
		/*
		 * double[] mylist;
		 * mylist = {~~~~};
		 * --> �̷��� �Ұ���
		 * So, �ҰŸ� shorthand notation���� �ϱ�
		 */
		
	}

}
