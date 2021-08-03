package Exceptions;

class MyException extends Exception {
	public MyException(String expception) {
		super("Exception Occured:" + expception);
	}
}

class Student {
	public int regNo;
	public String sName;
	public String sCource;
	public int sMarks;

	public Student(int regNo, String sName, String sCource, int sMarks) {
		this.regNo = regNo;
		this.sName = sName;
		this.sCource = sCource;
		this.sMarks = sMarks;
	}

	public void display() {
		System.out.println("Student Registration no:" + regNo);
		System.out.println("Student Name:" + sName);
		System.out.println("Student Cource:" + sCource);
		System.out.println("Student Marks:" + sMarks);
	}

}

public class ThrowsException {
	public static void main(String args[]) throws MyException {
		try {
			int regno = Integer.parseInt("80");
			String sname = "Suman";
			String cource = "MCA";
			int marks = Integer.parseInt("550");
			if (regno < 0 || regno > 100) {
				throw new MyException("Invalid Register Number:" + regno);
			}
			if (cource != "MCA") {
				throw new MyException("Invalid Cource name:" + cource);
			}
			if (marks < 250 || marks >= 600) {
				throw new MyException("Invalid Marks:" + marks);
			}
			Student s = new Student(regno, sname, "MCA", 480);
			s.display();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (NumberFormatException ex) {
			System.out.println("Number Exception");
		}
	}
}
