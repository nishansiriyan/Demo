package Example;

public class Parsing {
	public static void main(String[] args) {
		// parsing string to int;
		String strValue1 = "34";
		int intValue = Integer.parseInt(strValue1);
		System.out.println("Integer value is:" + intValue);

		// parsing string to float;
		String strValue2 = "34.645";
		float floatValue = Float.parseFloat(strValue2);
		System.out.println("Float value is:" + floatValue);

		// parsing string to double
		String strValue3 = "89.08544677";
		double doubleValue = Double.parseDouble(strValue3);
		System.out.println("Double value is:" + doubleValue);

		// parsing string to long
		String strValue4 = "888765432789";
		System.out.println("Long value is:" + doubleValue);

		//// parsing string to short
		String strValue5 = "123";
		short shortValue = Short.parseShort(strValue5);
		System.out.println("Short value is:" + shortValue);

		// parsing string to byte
		String strValue6 = "35";
		byte byteValye = Byte.parseByte(strValue6);
		System.out.println("Byte value is:" + byteValye);

		// parsing string to char
		String str_value3 = "Hello";
		char new_char = str_value3.charAt(2);
		System.out.println("char value is:" + new_char);

		// parsing character to string
		char new_char2 = 'a';
		String new_str = Character.toString(new_char2);
		System.out.println("String value is:" + new_str);

	}
}
