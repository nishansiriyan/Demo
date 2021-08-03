package Package2;

import Package1.Access1;

public class Acess3 extends Access1 {
	public static void main(String args[]) {
		Access1 a=new  Access1();
		//public
		System.out.println(a.name);
		
		//protected
		Acess3 a2=new Acess3();
		System.out.println(a2.number);
	}
}
