package Exceptions;

public class ThrowException {
	static void check(int age) {
		if (age < 25) {
			throw new ArithmeticException("Age must be greater than 20");
		} else {
			System.out.println("Your Available");
		}
	}

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("23");
			check(num);
		} catch (NumberFormatException ex) {
			System.out.println("Number Exception");
		}

	}
}
