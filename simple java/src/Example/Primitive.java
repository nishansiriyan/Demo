package Example;
public class Primitive {
	
	public static void main(String[] args) {
		//byte=8
		//short=16
		//int=32
		//long=64
		//float=32
		//double=64
		//char=16
		//boolean=1
		
		//byte
		byte byteValue=127;
		System.out.println("byte:");
		System.out.println("byte value is:"+byteValue);
		
		//short
		System.out.println("short:");
		short minShortvalue=-32768;
		short maxShortvalue=32767;
		System.out.println("Minimum short value:"+minShortvalue);
		System.out.println("Maximum short value:"+maxShortvalue);
		
		//int 
		System.out.println("int:");
		int minIntvalue =-2147483648;
		int maxIntvalue=2147483647;
		System.out.println("Minimum int value:"+minIntvalue);
		System.out.println("Maximun int value:"+maxIntvalue);
		
		//long
		System.out.println("long");
		long maxLongvalue=-9223372036854775808L;
		long minLongValue=9223372036854775807L;
		System.out.println("Minimum long value:"+maxLongvalue);
		System.out.println("Maximum long value:"+minLongValue);
		
		//float
		System.out.println("float:");
		float floatValue=5.45687f;
		System.out.println("float value:"+floatValue);
		System.out.println(String.format("%.3f", floatValue));
		
		//double
		System.out.println("double:");
		double doubleValue=34.566555555;
		System.out.println(doubleValue);
		
		//Boolean
		System.out.println("boolean:");
		int number1=30;
		int number2=50;
		boolean value=true;
		if(number1<number2) {
			System.out.println("boolean value:"+value);
		}
		
		//char
		System.out.println("char:");
		char charValue='a';
		int num1=78;
		char charValue2=(char)num1;
		System.out.println("char value:"+charValue);
		System.out.println(charValue2);	
	}

}
