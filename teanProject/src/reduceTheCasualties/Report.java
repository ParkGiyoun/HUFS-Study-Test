package reduceTheCasualties;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Report extends JFrame {

	private JPanel contentPane;
	
	private JTextField textResult;
	
	private Question question;
	private InfectionCheck infection;
	private SeriousnessJudge seriousness;
	private Report report;
	private JTable table;
	private JTextField textType;
	private JTextArea textOpinion;
	private JScrollPane scrollPane;
	
	private String[][] data;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Report frame = new Report();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public Report() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1019, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblText = new JLabel("Result");
		lblText.setFont(new Font("±¼¸²", Font.BOLD, 83));
		lblText.setBounds(374, 10, 272, 135);
		contentPane.add(lblText);
		
		textResult = new JTextField("==RESULT==");
		textResult.setFont(new Font("±¼¸²", Font.PLAIN, 45));
		textResult.setEditable(false);
		textResult.setBounds(305, 253, 245, 93);
		contentPane.add(textResult);
		textResult.setColumns(10);
		
		JLabel lblText2 = new JLabel("%");
		lblText2.setFont(new Font("±¼¸²", Font.PLAIN, 60));
		lblText2.setBounds(562, 232, 123, 126);
		contentPane.add(lblText2);
		
		JLabel lblText2_1 = new JLabel("Seriousness : ");
		lblText2_1.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lblText2_1.setBounds(79, 240, 253, 124);
		contentPane.add(lblText2_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnExit.setBounds(350, 569, 233, 44);
		contentPane.add(btnExit);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(232, 374, 463, 185);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblText2_1_1 = new JLabel("Type of Servey:");
		lblText2_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lblText2_1_1.setBounds(38, 112, 281, 124);
		contentPane.add(lblText2_1_1);
		
		textType = new JTextField("==RESULT==");
		textType.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		textType.setEditable(false);
		textType.setColumns(10);
		textType.setBounds(305, 125, 366, 93);
		contentPane.add(textType);
		
		JLabel lblTextOpinion = new JLabel("Opinion");
		lblTextOpinion.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lblTextOpinion.setBounds(774, 112, 144, 124);
		contentPane.add(lblTextOpinion);
		
		textOpinion = new JTextArea();
		textOpinion.setFont(new Font("Monospaced", Font.PLAIN, 25));
		textOpinion.setText("== Text ==\n== Test ==");
		textOpinion.setEditable(false);
		textOpinion.setBounds(683, 200, 308, 140);
		contentPane.add(textOpinion);
	}
	
	public void send(Question question, InfectionCheck infection) throws FileNotFoundException {
		this.infection = infection;
		this.question = question;
		this.report = infection.report;
		
		question.getProbability_Infection();
		
		textResult.setText(Double.toString(question.getProbability()));
		textType.setText(infection.type);
		textOpinion.setText(question.getOpinion(infection.type));
		
		saveToFile();
	}
	public void send(Question question, SeriousnessJudge seriousness) throws FileNotFoundException {
		this.seriousness = seriousness;
		this.question = question;
		this.report = seriousness.report;
		
		question.getProbability_Seriousness();
		
		textResult.setText(Double.toString(question.getProbability()));
		textType.setText(seriousness.type);
		textOpinion.setText(question.getOpinion(seriousness.type));
		
		saveToFile();
	}
	public void saveToFile() throws FileNotFoundException{
		Scanner input = new Scanner(new File("report.txt"));
		int i = 0;
		Question[] lastQuestion = new Question[1000];
		
		while(input.hasNextLine()) {
			//type;
			String type = input.next();
			
			//probability
			double probability = Double.parseDouble(input.next());
			
			//Opinion
			char opinion = input.next().charAt(0);
			
			lastQuestion[i] = new Question(type, probability, opinion);
			i++;
		}
		PrintStream toFile = new PrintStream(new File("report.txt"));
		
		data = new String[i+1][4]; 
		i = 0;
		
		while(i<data.length - 1 ) {
			System.out.println("i : " + i);
			String all = lastQuestion[i].getType()+" "+
					Double.toString(lastQuestion[i].getProbability()) + " " +
					//Level == Opinion (level of seriousness)
					Character.toString(lastQuestion[i].getLevel());
			
			toFile.println(all);
			
			data[i][0] = Integer.toString(i);
			data[i][1] = lastQuestion[i].getType();
			data[i][2] = Double.toString(lastQuestion[i].getProbability());
			data[i][3] = Character.toString(lastQuestion[i].getLevel());
			
			i++;
		}
		
		String newdata = question.getType()+" "+
		Double.toString(question.getProbability()) + " " +
		Character.toString(question.getLevel());
		
		toFile.print(newdata);
		
		data[i][0] = Integer.toString(i);
		data[i][1] = question.getType();
		data[i][2] = Double.toString(question.getProbability());
		data[i][3] = Character.toString(question.getLevel());
		
		String[] columnNames = {"Test No", "Type", "Probability" , "Level"};
		table = new JTable(data, columnNames);
		table.setBounds(350, 30, 100, 90);
		table.setAutoCreateRowSorter(true);
		
		scrollPane.getViewport().setView(table);
		contentPane.add(scrollPane);
	}
	
	
}
