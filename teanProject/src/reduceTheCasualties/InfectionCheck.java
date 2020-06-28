package reduceTheCasualties;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class InfectionCheck extends JFrame {

	private JButton btnNext;
	
	private JPanel contentPane;
	private JLabel lblQuestion;
	
	private InfectionCheck infection;
	private Question question;
	public Report report;
	
	private int choice = 1;
	private int i = 0; // number of list
	public String type = "Infection";
	
	/**
	 * Create the frame.
	 */
	
	public InfectionCheck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1196, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTest = new JLabel("[Infection] Choose True or False");
		lblTest.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblTest.setBounds(331, 83, 353, 34);
		contentPane.add(lblTest);
		
		//radio button
		JRadioButton rdbtnTrue = new JRadioButton("TRUE");
		rdbtnTrue.setSelected(true);
		rdbtnTrue.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		rdbtnTrue.setBounds(331, 331, 178, 47);
		contentPane.add(rdbtnTrue);
		
		JRadioButton rdbtnFalse = new JRadioButton("FALSE");
		rdbtnFalse.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		rdbtnFalse.setBounds(532, 331, 178, 47);
		contentPane.add(rdbtnFalse);
		
		//Group the radio buttons
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnTrue);
		group.add(rdbtnFalse);
		
		lblQuestion = new JLabel("Question");
		lblQuestion.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblQuestion.setBounds(189, 154, 694, 47);
		contentPane.add(lblQuestion);
		
		btnNext = new JButton("Next Question");
		btnNext.setVisible(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// print next Question or Finish the question
				if ( question.num < question.getNumInfection() ) {
					// input the answer
					if(rdbtnTrue.isSelected()) {
						question.setInfectionAnswer(true);
					}
					else {
						question.setInfectionAnswer(false);
					}
					question.num++;
					if(question.num != question.getNumInfection()) {
						lblQuestion.setText(question.getInfectionPrint());
					}
					
				}
				else {
					report = new Report();
					try {
						report.send(question,infection);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					report.setVisible(true);
				}
			}
		});
		btnNext.setFont(new Font("±¼¸²", Font.BOLD, 40));
		btnNext.setBounds(331, 446, 414, 91);
		contentPane.add(btnNext);		
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart.setVisible(false);
				question = new Question(type);
				lblQuestion.setText(question.getInfectionPrint());
				btnNext.setVisible(true);
			}
		});
		btnStart.setFont(new Font("±¼¸²", Font.BOLD, 40));
		btnStart.setBounds(331, 211, 414, 62);
		contentPane.add(btnStart);
	}
	
	public void setInfection(InfectionCheck infection) {
		 this.infection = infection;
	}
}