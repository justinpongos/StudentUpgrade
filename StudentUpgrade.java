
public class StudentUpgrade {
	private String firstname;
	private String lastname;
	private double[] grades;
	
	public StudentUpgrade() {
		this.firstname = "Justin";
		this.lastname = "Pongos";
		this.grades = new double[6];
		this.grades [0] = 4.0;
		this.grades [1] = 2.5;
		this.grades [2] = 4.0;
		this.grades [3] = 4.0;
		this.grades [4] = 3.5;
		this.grades [5] = 4.0;
	}//end zero argument instructor
	
	public StudentUpgrade (String firstname, String lastname, double[] grades) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.grades = new double [6];
	for (int index = 0; index < grades.length; index++) {
		this.grades[index] = grades[index];
		}//end for
	}//end multi argument instructor
	
	public double getMath() {
		return grades [1];
	}//end getter
	
	public void setMath(double math) {
		 this.grades [1] = math;
	}//end setter 
	
	public double calcGPA() {
		double GPA = 0;
		for (int index = 0; index < grades.length; index++) {
			GPA += grades[index] / grades.length;
		}//end for
		GPA = (double)Math.round(GPA*100)/100;
		return GPA;
	}//end method calcGPA
	
	public String toString() {
		String output;
		output = ("Student: " + firstname + " " + lastname + "\n" + "Cumulative GPA: " + calcGPA());
		return output; 
	}//end toString
}//end class
