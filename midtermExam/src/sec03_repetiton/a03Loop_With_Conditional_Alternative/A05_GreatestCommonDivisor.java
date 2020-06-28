package sec03_repetiton.a03Loop_With_Conditional_Alternative;

import java.util.*;
public class A05_GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int first=0,second=0,common=0;
		System.out.print("�ִ����� ���� �� ���ڸ� ������� �Է��ϼ���: ");
		first = input.nextInt();
		second = input.nextInt();
		
		for(int i =1 ; i<=Math.min(first, second) ; i++) {
			if(first % i ==0 && second % i ==0) {
				common=i;
			}
		}
		System.out.println("�ִ� �����: " + common );
		
		System.out.println("\n------------------------\n�ι�° ��� with while��\n");
		System.out.print("first integer: ");
		int n1 = input.nextInt();
		System.out.print("second integer: ");
		int n2 = input.nextInt();
		System.out.println();
		
		int gcd = 1; //�ִ� ����� ����
		int k = 2; // ����� Ȯ�ο� ����
		
		while(k<=n1 && k<=n2) { //Ȯ�ο� ������ �Է��� ���� �Ѵ� ���� �۾ƾ���
			if(n1%k==0 && n2%k==0) { //����� �´��� Ȯ��
				gcd = k;// ������ GCD�� ����
			}
			k++;
		}
		
		System.out.println(n1+"�� "+n2+"�� �ִ� �����: "+ gcd);
	}

}
