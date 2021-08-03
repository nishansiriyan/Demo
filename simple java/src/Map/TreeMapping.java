package Map;

import java.util.*;

class Employee {
	public int empId;
	public String empName;
	public String empDept;

	public Employee(int empId, String empName, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
	}

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

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

}

public class TreeMapping {
	static void display(Employee emp) {
		System.out.println("====================");
		System.out.println("EMPLOYEE DETAILS:");
		System.out.println("Employee ID:" + emp.getEmpId());
		System.out.println("Employee Name:" + emp.getEmpName());
		System.out.println("Employee Department:" + emp.getEmpDept());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Employee> employee = new TreeMap<Integer, Employee>();
		Employee emp1 = new Employee(101, "Ramesh", "Civil");
		Employee emp2 = new Employee(103, "Suresh", "Mechanical");
		Employee emp3 = new Employee(102, "Ramya", "It");
		employee.put(emp1.getEmpId(), emp1);
		employee.put(emp2.getEmpId(), emp2);
		employee.put(emp3.getEmpId(), emp3);
		for (Map.Entry employeeEntry : employee.entrySet()) {
			Employee e = (Employee) employeeEntry.getValue();
			display(e);
		}

		System.out.println("Enter the emoployee id to delete:");
		int empid = sc.nextInt();
		employee.remove(empid);
		for (Map.Entry employeeEntry : employee.entrySet()) {
			Employee e = (Employee) employeeEntry.getValue();
			display(e);
		}

	}

}
