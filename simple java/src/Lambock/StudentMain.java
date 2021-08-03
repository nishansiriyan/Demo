package Lambock;

public class StudentMain {

	public static void main(String[] args) {
		Student s=new Student();
		s.setRegno(111);
		s.setSname("Arjun");
		s.setSaddress("Mangalore");
		s.setPhonenumber(9980129544l);
		
		System.out.println("Student details:");
		System.out.println("Student Regno:"+s.getRegno());
		System.out.println("Student Name:"+s.getSname());
		System.out.println("Student Address:"+s.getSaddress());
		System.out.println("Student Mobile:"+s.getPhonenumber());
		
		Student s2=new Student(122,"Allen","Bombay",9980129544l);
		System.out.println("Student Regno:"+s2.getRegno());
		System.out.println("Student Name:"+s2.getSname());
		System.out.println("Student Address:"+s2.getSaddress());
		System.out.println("Student Mobile:"+s2.getPhonenumber());
	}

}
