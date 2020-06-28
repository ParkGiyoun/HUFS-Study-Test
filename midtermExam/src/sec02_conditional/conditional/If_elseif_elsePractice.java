package sec02_conditional.conditional;

import java.util.*;
public class If_elseif_elsePractice {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("1~5������ ���ڸ� �Է��ϼ��� : ");
		int i = input.nextInt();
		
		if(i == 1) {
			System.out.println("i : "+i);
		}
		else if(i >= 2 && i <= 5) {
			System.out.println("i�� 1�� �ƴ϶� " +i+" �Դϴ�.`");
		}
		else {
			System.out.println("i�� 1~5 ������ ���ڰ� �ƴմϴ�.");
		}
		
		String b = i==1? "�Ϻ��ϳ� ^^" : "" ;
		// a?b:c; a��� ������ �����ϸ� b�� return�ϰ�, ������ �������� ������, c�� return�Ѵ�.
		System.out.println(b);
		
		// String Ÿ�԰��� ���� �� --> ����.equal(���� ����) �ƴϸ�, ����.equalsIgnoreCase(���� ����) 
				//==> return ���� True or False 
		System.out.print("�̸��� ������? : ");
		String name = input.next();
		if(name.equals("�ڱ���")) {
			System.out.println("�ڱ��� �̱���!");
		}
		else if( name.equalsIgnoreCase("���ر�")) {
			System.out.println("�ڱ��� ���̵����̱���!");
		}
		else {
			System.out.println("�ڱ����� �ƴմϴ�.");
		}
	}
}
/*
 * &&:and
 * || : or
 * ^ : exclusive or
 * 
 */