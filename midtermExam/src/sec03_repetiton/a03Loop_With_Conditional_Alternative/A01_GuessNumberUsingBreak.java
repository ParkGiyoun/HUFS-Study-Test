package sec03_repetiton.a03Loop_With_Conditional_Alternative;

import java.util.*;
public class A01_GuessNumberUsingBreak {

	// continue ==> ���� ���� �� �� ���� ���� �����ϰ� �ݺ��� ��� ����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value = (int)(Math.random()*11);
		int guess = 0;
		int trying = 1;
		while(true) {
			System.out.print("1~10������ ������ �ϳ��� �Է��ϼ���: ");
			guess = input.nextInt();
			
			if(value == guess) {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ��: " + trying);
				break;
			}
			else{
				System.out.println("������ �ƴմϴ�.");
				trying ++ ;
			}
			
		}
		
		for(int i =2; i<=9; i++) {
			System.out.println("\n***** " + i + "�� *****");
			for(int j = 1; j<=9; j++) {
				if((i*j)%2 != 0) {
					continue; // continue;�� ������ �Ǹ�, �ݺ��������� ���� ����� �� �����ϰ� ��� �ݺ���.
					//break;�� �ٸ����̶�� �ϸ�, break�� �ƿ� �ݺ����� ���ڸ����� ��������
					//But, ��� �ݺ��� ��� �ϵ�, continue �ڿ� ���� ������� ������.
				}
				
				System.out.println(i+"X"+j+"="+i*j+"\t");
			}
		}
		
		
	}

}
