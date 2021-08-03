package OOPS;

class Operation1 {
	public void sum(int num1, int num2) {
		int total = 0;
		total = num1 + num2;
		System.out.println("Sum of two number:" + total);
	}

	public void sum(int num1, int num2, int num3) {
		int total = 0;
		total = num1 + num2 + num3;
		System.out.println("Sum of three number:" + total);
	}

	public void display() {
		sum(10, 30);
		sum(30, 68, 90);
	}
}

class Operation2 extends Operation1 {
	public void Mul(int num1, int num2) {
		int total = 0;
		total = num1 * num2;
		System.out.println("Mul of thwo number:" + total);
	}

	public void display() {
		Mul(30, 40);
	}
}

public class Polymorphism {
	public static void main(String args[]) {
		Operation1 o = new Operation1();
		o.display();
		Operation2 o2 = new Operation2();
		o2.display();
	}
}
