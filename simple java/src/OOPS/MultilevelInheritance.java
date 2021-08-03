package OOPS;

class Student {
	private int roleNumber;
	private String studName;

	public Student(String sName, int rollNo) {
		this.roleNumber = rollNo;
		this.studName = sName;
	}

	public void displayStudentDetails() {
		System.out.println("Role:" + roleNumber);
		System.out.println("Student Name:" + studName);
	}
}

class Study extends Student {
	public int physics;
	public int chemistry;
	public int math;

	public Study(int roleNo, String studName, int physics, int chemistry, int math) {
		super(studName, roleNo);
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
	}

	public void displayStudyDetails() {
		displayStudentDetails();
		System.out.println("Physics:" + physics);
		System.out.println("Chemistry:" + chemistry);
		System.out.println("Maths:" + math);
	}
}

class Sports extends Study {
	public String teamName;
	public int rank;

	public Sports(int roleNo, String studName, int physics, int chemistry, int math, String teamName, int rank) {
		super(roleNo, studName, physics, chemistry, math);
		this.teamName = teamName;
		this.rank = rank;
	}

	public void displaySportsDetails() {
		displayStudyDetails();
		System.out.println("Team Name:" + teamName);
		System.out.println("Rank:" + rank);
	}
}

public class MultilevelInheritance {
	public static void main(String args[]) {
		Sports obj = new Sports(123, "Nishan", 70, 80, 67, "Real Madrid", 1);
		obj.displaySportsDetails();
	}
}
