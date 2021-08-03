package OOPS;

class Department {
	public String headOfDepartment;
	public int totalStudents;
	public int numberOfFaculty;

	public void displayDetails() {
		System.out.println("Head of the Department:" + headOfDepartment);
		System.out.println("Total students:" + totalStudents);
		System.out.println("Total faculty:" + numberOfFaculty);
	}
}

class ComputerScience extends Department {
	public void setInfo(String hod, int tstudents, int faculty) {
		headOfDepartment = hod;
		totalStudents = tstudents;
		numberOfFaculty = faculty;
	}
}

public class SingleInheritance {
	public static void main(String args[]) {
		ComputerScience obj = new ComputerScience();
		obj.setInfo("Hemanth", 1000, 50);
		obj.displayDetails();
	}

}
