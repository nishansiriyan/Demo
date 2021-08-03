package OOPS;

interface EmpDetails {
	public void addEmployee(int empid, String empname, int empsal, int days);

	public void display();
}

interface CalculateSalary {
	public double calculateSal();

	public default void display() {
		System.out.println("======Employee Details==========");
	}

}

class Emp implements EmpDetails, CalculateSalary {

	public int empId;
	public String empName;
	public int empSal;
	public int noOfDays;
	public double totalSal = 0.00;

	@Override
	public void addEmployee(int empid, String empname, int empsal, int days) {
		empId = empid;
		empName = empname;
		empSal = empsal;
		noOfDays = days;
	}

	@Override
	public double calculateSal() {
		totalSal = empSal * noOfDays;
		return totalSal;
	}

	@Override
	public void display() {
		CalculateSalary.super.display();
		System.out.println("Employee ID:" + empId);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Salary:" + empSal);
		System.out.println("Total Salary:" + calculateSal());
	}

}

public class MultipleInterface {
	public static void main(String args[]) {
		Emp e = new Emp();
		e.addEmployee(2003, "Akash", 700, 30);
		e.display();
	}
}
