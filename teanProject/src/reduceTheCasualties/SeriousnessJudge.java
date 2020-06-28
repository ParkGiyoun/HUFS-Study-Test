package reduceTheCasualties;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class SeriousnessJudge extends JFrame {

	private JButton btnNext;
	
	private JPanel contentPane;
	private JLabel lblQuestion;
	
	private SeriousnessJudge seriousness;
	private Question question;
	public Report report;
	
	private int choice = 2;
	private int i = 0; // number of list
	public String type = "Seriousness";

	/**
	 * Create the frame.
	 */
	public SeriousnessJudge() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTest = new JLabel("[Seriousness] Choose True or False");
		lblTest.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblTest.setBounds(12, 29, 410, 34);
		contentPane.add(lblTest);
		
		//radio button
		
		JRadioButton rdbtnTrue = new JRadioButton("TRUE");
		rdbtnTrue.setSelected(true);
		rdbtnTrue.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		rdbtnTrue.setBounds(12, 159, 152, 47);
		contentPane.add(rdbtnTrue);
		
		JRadioButton rdbtnFalse = new JRadioButton("FALSE");
		rdbtnFalse.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		rdbtnFalse.setBounds(213, 159, 152, 47);
		contentPane.add(rdbtnFalse);
		
		//Group the radio buttons
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnTrue);
		group.add(rdbtnFalse);
		
		lblQuestion = new JLabel("Question");
		lblQuestion.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		lblQuestion.setBounds(12, 73, 410, 47);
		contentPane.add(lblQuestion);
		
		btnNext = new JButton("Next Question");
		btnNext.setVisible(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				// print next Question or Finish the question
				if (question.num < question.getNumSerious()) {
					// input the answer
					if(rdbtnTrue.isSelected()) {
						question.setSeriousnessAnswer(true);
					}
					else {
						question.setSeriousnessAnswer(false);
					}
					question.num++;
					if(question.num != question.getNumSerious()) {
						lblQuestion.setText(question.getSeriousnessPrint());
					}
				}
				else {
					report = new Report();
					try {
						report.send(question, seriousness);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					report.setVisible(true);
				}
			}
		});
		btnNext.setFont(new Font("±¼¸²", Font.BOLD, 15));
		btnNext.setBounds(12, 212, 414, 43);
		contentPane.add(btnNext);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart.setVisible(false);
				question = new Question(type);
				lblQuestion.setText(question.getSeriousnessPrint());
				btnNext.setVisible(true);
			}
		});
		btnStart.setFont(new Font("±¼¸²", Font.BOLD, 15));
		btnStart.setBounds(12, 110, 414, 43);
		contentPane.add(btnStart);
	}
	public void setSeriousness(SeriousnessJudge seriousness) {
		 this.seriousness = seriousness;
	}
}