package OOPS;

class GradFater {

	public void land() {
		System.out.println("GradFater's land");
	}
}

class Father extends GradFater {

	public void home() {
		System.out.println("Father's home");
	}

	public void Car() {
		System.out.println("Father's Car");
	}
}

class Son extends Father {
	public Son() {
		System.out.println("Son");
	}

	public void mobile() {
		System.out.println("Son's mobile");
	}
}

class Daughter extends Father {
	public Daughter() {
		System.out.println("Daughter");
	}

	public void purse() {
		System.out.println("Daughter's purse");
	}
}

public class HybridInheritance {
	public static void main(String args[]) {
		Son s = new Son();
		s.land();// Grand father method
		s.Car(); // Father method
		s.home();// Father method
		s.mobile();// son method

		Daughter d = new Daughter();
		d.land();// Grand father method
		d.Car(); // Father method
		d.home();// Father method
		d.purse();// daughter method
	}
}
