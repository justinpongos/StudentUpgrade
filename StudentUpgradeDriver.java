
public class StudentUpgradeDriver {
	public static void main(String[]args) {
		double[] grades = new double[] {2.5, 3.0, 3.5, 4.0, 3.5, 4.0};
		StudentUpgrade senior001 = new StudentUpgrade("Master", "Yoda", grades);
			System.out.println(senior001);
		senior001.setMath(4.00);
			System.out.println("The Math GPA is now set to " + senior001.getMath());
			System.out.println(senior001);
	}//end main
}//end class
