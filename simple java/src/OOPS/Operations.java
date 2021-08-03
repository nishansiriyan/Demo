package OOPS;

class Calculate implements Interface {
	public int number1;
	public int number2;
	public double result = 0;

	public Calculate(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
	}

	@Override
	public void add() {
		result = number1 + number2;
		System.out.println("Addition:" + result);

	}

	@Override
	public void sub() {
		result = number1 - number2;
		System.out.println("Substraction:" + result);

	}

	@Override
	public void mul() {
		result = number1 * number2;
		System.out.println("Multiplication:" + result);

	}

	@Override
	public void div() {
		result = number1 / number2;
		System.out.println("Division:" + result);
	}

}

public class Operations {
	public static void main(String args[]) {
		Calculate c = new Calculate(60, 20);
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}
