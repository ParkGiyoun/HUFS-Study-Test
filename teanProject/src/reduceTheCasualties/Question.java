package reduceTheCasualties;


public class Question {
	
	private String[] questForInfection = { 
			" 1 ",
			" 2 ",
			" 3 ", 
			" 4 ",
			" 5 ",
			" 6 ",
			" 7 ",
			" 8 ",
			" 9 ",
			" 10 "};
	private String[] questForSeriousness = { 
			" 5 ",
			" 6 ",
			" 7 ", 
			" 8 ",
			" 9 "};
	private boolean[] infectionAnswer = new boolean[10];
	private boolean[] seriousnessAnswer = new boolean[5];
	
	private double probability; // probability
	public int num; // for print the question & input the answer to list (index)
	private char level;
	private String type;
	
	//for report;
	public Question(String type, double probability, char opinion) {
		level = opinion;
		this.probability = probability;
		this.setType(type);
		
	}
	//for non parameter
	public Question(String type) {
		this.type = type;
	}
	
	//return the probability
	public void getProbability_Infection(){
		int t = 0;
		for(int i = 0 ; i < infectionAnswer.length ; i++) {
			if(infectionAnswer[i] == true) {
				t++;
			}
				
		}
		probability = ((double)t / infectionAnswer.length)*100 ;
	}
	public void getProbability_Seriousness(){
		int t = 0;
		for(int i = 0 ; i < seriousnessAnswer.length ; i++) {
			if(seriousnessAnswer[i] == true ) {
				t++;
			}
			
		}
		probability = ((double)t / seriousnessAnswer.length)*100 ;
	}
	public double getProbability() {
		return probability;
	}

	// return the number of list element
	public int getNumInfection() {
		return questForInfection.length;
	}

	public int getNumSerious() {
		return questForSeriousness.length;
	}

	// return the question
	public String getInfectionPrint() {
		return questForInfection[num];
	}
	
	public String getSeriousnessPrint() {
		return questForSeriousness[num];
	}

	public boolean[] setSeriousnessAnswer(boolean seriousnessAnswer) {
		this.seriousnessAnswer[num] = seriousnessAnswer;
		return this.seriousnessAnswer;
	}

	public boolean[] setInfectionAnswer(boolean infectionAnswer) {
		this.infectionAnswer[num] = infectionAnswer;
		return this.infectionAnswer;
	}
	
	public String getOpinion(String type) {
		String opinion = " "; 
		switch(type) {
			case "Infection": 
				if(probability == 0) {
					opinion = "You don't need to go\nhospital";
					setLevel('L');
					break;
				}
				else if(probability < 50) {
					opinion = "You can go hospital";
					setLevel('M');
					break;
				}
				else {
					opinion =  "You must go hospital";
					setLevel('H');
					break;
				}
			case "Seriousness":
				if(probability < 50) {
					opinion = "you don't need to be put\nin the isolation ward";
					setLevel('L');
					break;
				}else {
					opinion = "you need to be put\nin the isolation ward";
					setLevel('H');
					break;
				}
		}
		return opinion;
		
	}
	
	
	public char getLevel() {
		return level;
	}
	
	public void setLevel(char level) {
		this.level = level;
	}
	//just for report
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}