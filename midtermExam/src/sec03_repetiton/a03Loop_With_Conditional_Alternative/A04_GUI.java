package sec03_repetiton.a03Loop_With_Conditional_Alternative;

import javax.swing.JOptionPane;
public class A04_GUI {
// input method 1. scanner 2. JOptionPane
	public static void main(String[] args) {
		int sum = 0;

		int option = 0;
		while(option == JOptionPane.YES_OPTION) {//JOptionPane.YES_OPTION ==> integer value '0'
			String dataString = JOptionPane.showInputDialog(null,"ANG","Enter an int value: ",JOptionPane.QUESTION_MESSAGE); 
			//JOptionPane.showInputDialog("���� ��");     (��ȣ �ȿ� �ٷ�  ���� ������ ĭ �ٷ� ���� ���� ���� ��)
			//(null,�ٷ����� �ð�, ���α׷� �̸� â�� �ð�,���� �޽����ΰ�)		(null,"","")--> �ι� ° ������ �Է�ĭ�� �̸� �� �ְ� ��
			// --> showInputDialog ==> ���� �� �ִ� ĭ ���� ��
			
			int data = Integer.parseInt(dataString);
			// Integer.parseInt(STRING_VARIABLE);		String���� Integer�� ��ȯ (�Ľ�)	
			
			sum+=data;
			
			//--> showConfirmDialog(null, "�� ��"); ==> Yes or No or cancel �� �ϳ� �� �� ����
			//yes -->�� = 0, no--> �� =1, cancel --> �� = 2
			option = JOptionPane.showConfirmDialog(null, "Continue?");
			System.out.println(option);
			
		}
		System.out.println("-----------------------------\n\t"+sum);
		JOptionPane.showMessageDialog(null, "The sum is " + sum);
		//JOptionaPane.showMessageDialog(null,"�Ҹ�"); --> �׳� ���� ������ ��
	}

}
