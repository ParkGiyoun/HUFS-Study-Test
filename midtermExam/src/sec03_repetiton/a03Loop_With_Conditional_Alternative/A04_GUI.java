package sec03_repetiton.a03Loop_With_Conditional_Alternative;

import javax.swing.JOptionPane;
public class A04_GUI {
// input method 1. scanner 2. JOptionPane
	public static void main(String[] args) {
		int sum = 0;

		int option = 0;
		while(option == JOptionPane.YES_OPTION) {//JOptionPane.YES_OPTION ==> integer value '0'
			String dataString = JOptionPane.showInputDialog(null,"ANG","Enter an int value: ",JOptionPane.QUESTION_MESSAGE); 
			//JOptionPane.showInputDialog("적을 말");     (괄호 안에 바로  내용 적으면 칸 바로 위에 오는 말이 됨)
			//(null,바로위에 올거, 프로그램 이름 창에 올거,질문 메시지인거)		(null,"","")--> 두번 째 내용이 입력칸에 미리 들어가 있게 됨
			// --> showInputDialog ==> 적을 수 있는 칸 띄우는 거
			
			int data = Integer.parseInt(dataString);
			// Integer.parseInt(STRING_VARIABLE);		String에서 Integer로 변환 (파싱)	
			
			sum+=data;
			
			//--> showConfirmDialog(null, "할 말"); ==> Yes or No or cancel 중 하나 고를 수 있음
			//yes -->값 = 0, no--> 값 =1, cancel --> 값 = 2
			option = JOptionPane.showConfirmDialog(null, "Continue?");
			System.out.println(option);
			
		}
		System.out.println("-----------------------------\n\t"+sum);
		JOptionPane.showMessageDialog(null, "The sum is " + sum);
		//JOptionaPane.showMessageDialog(null,"할말"); --> 그냥 말만 나오는 거
	}

}
