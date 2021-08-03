package Annotatins;

@FunctionalInterface
interface StudentDetails{
	public void display();
}

class Student implements StudentDetails{
	public int regNo;
	public String sName;
	public String sAddress;
	public Student(int regno,String name,String address){
		this.regNo=regno;
		this.sName=name;
		this.sAddress=address;
	}
	@Override
	public void display() {
		System.out.println("Student regno:"+regNo);
	}
}
class Cource extends Student{
	public String sCource;
	public Cource(int regno,String name,String address,String cource) {
		super(regno,name,address);
		this.sCource=cource;
	}
	
	@Override
	public void display() {
		System.out.println("Student regno:"+regNo);
		System.out.println("Student name:"+sName);
		System.out.println("Student Address:"+sAddress);
		System.out.println("Student Cource:"+sCource);
	}
}
public class Example1 {
	public static void main(String[] args) {
		Student s=new Cource(12, "Nishan", "Mangalore", "Mca");
		s.display();
		
	}

}
