package Exceptions;

public class SimpleException {

	static int devidedByZero(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}

	public static void main(String args[]) {
		try {
			int num1 = 20;
			int a[] = { 1 };
			int num2 = Integer.parseInt("0");
			int result = 0;
			String name = null;
			// result=devidedByZero(num1,num2);
			 //System.out.println(a[1]);
			// System.out.println(num2);
			if (name.equals("aaa")) {
				System.out.print("Same");
			} else {
				System.out.print("Not Same");
			}
		} catch (ArithmeticException ex) {
			System.out.println("Arithmatic Exception");
		} catch (NumberFormatException ex) {
			System.out.println("Number Exception Occured");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Index Out of bound Exception");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
		} finally {
			System.out.println("Done");
		}
	}
}
