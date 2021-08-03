package Example;

import java.util.*;

public class WrapperClass {
	public static void main(String[] args) {
		// Wrapper class
		Integer numberValue = new Integer(20);
		System.out.println("Wraper class:" + numberValue);
		// Collection
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(1287);
		System.out.println("Collection:" + arraylist);

		/// ---------------------------------Boxing------------------------------------------------------//
		// Integer
		int value1 = 30;
		Integer newInt = new Integer(value1);
		// Float
		float value2 = 29.65f;
		Float newFloat = new Float(value2);

		// Long
		long value3 = 12345678l;
		Long newLong = new Long(value3);

		// Double
		double value4 = 123.7896543;
		Double newDouble = new Double(value4);

		// Short
		short value5 = 1289;
		Short newShort = new Short(value5);

		// Byte
		byte value6 = 127;
		Byte newByte = new Byte(value6);

		// Character
		char character = 'a';
		Character newCharacer = new Character(character);

		// Boolean
		boolean bool = true;
		Boolean newBool = new Boolean(bool);

		// -----------------------------------------Unboxing----------------------------------------//
		byte unBoxingByte = newByte.byteValue();
		short unBoxingShort = newShort.shortValue();
		int unBoxingInt = newInt.intValue();
		float unBoxingFloat = newFloat.floatValue();
		long unBoxingLong = newLong.longValue();
		double unBoxingDouble = newDouble.doubleValue();
		char unBoxingCharacter = newCharacer.charValue();
		boolean unBoxingBool = newBool.booleanValue();

	}
}
