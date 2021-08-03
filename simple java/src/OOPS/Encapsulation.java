package OOPS;

class Employee {
	private int empId;
	private String empName;
	private int empSal;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

}

public class Encapsulation {
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("virat");
		emp.setEmpSal(20000);
		System.out.println("Employee ID:" + emp.getEmpId());
		System.out.println("Employee Name:" + emp.getEmpName());
		System.out.println("Employee Salary:" + emp.getEmpSal());

	}
}
