package reduceTheCasualties;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TypeChoice extends JFrame {

	public static TypeChoice frame;
	public InfectionCheck infection;
	public SeriousnessJudge seriousness;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TypeChoice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TypeChoice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Select the Program");
		lblTitle.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblTitle.setBounds(12, 36, 414, 56);
		contentPane.add(lblTitle);
		
		// JRadioButton
		JRadioButton rdbtnInfection = new JRadioButton("Infection check program");
		rdbtnInfection.setSelected(true);
		rdbtnInfection.setBounds(12, 130, 170, 23);
		contentPane.add(rdbtnInfection);
		
		JRadioButton rdbtnSeriousness = new JRadioButton("Seriousness check program");
		rdbtnSeriousness.setBounds(235, 130, 191, 23);
		contentPane.add(rdbtnSeriousness);
		
		//Group the radio button
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnInfection);
		group.add(rdbtnSeriousness);
		
		JButton btnStart = new JButton("Start the program");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnInfection.isSelected()) {
					infection = new InfectionCheck();
					frame.setVisible(false);
					infection.setInfection(infection);
					infection.setVisible(true);
				}
				else {
					seriousness = new SeriousnessJudge();
					frame.setVisible(false);
					seriousness.setSeriousness(seriousness);
					seriousness.setVisible(true);
				}
			}
		});
		btnStart.setFont(new Font("±¼¸²", Font.BOLD, 15));
		btnStart.setBounds(12, 208, 414, 43);
		contentPane.add(btnStart);
		
	}
}
