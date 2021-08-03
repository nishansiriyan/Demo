package Annotatins;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


//Market Annotation
//Single value annotation
//Multi value annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(RepetableAnnotation.class)
@interface MyAnnotaion{
	int bikeSpeed();
	String BikeName();
	int bikeMileage() default 35;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RepetableAnnotation{
	MyAnnotaion[] value();
}


public class Example4 {
	
	//Multiple Annotation
	@MyAnnotaion(bikeSpeed = 200,BikeName = "Pulsar")
	@MyAnnotaion(bikeSpeed = 150,BikeName = "Duke",bikeMileage = 25)
	public void display() {
		System.out.println("Custom annotaion");
	}
	
	
	public static void main(String[] args) throws NoSuchMethodException {
		Example4 multi=new Example4();
		try {
			Method method=multi.getClass().getMethod("display");
			Annotation[] anno=method.getAnnotations();
			System.out.println("Annotations are:");
			for(Annotation annotation:anno) {
				RepetableAnnotation repeat=(RepetableAnnotation )annotation;
				for(MyAnnotaion repeatAnno:repeat.value()) {
					System.out.println("Bike Name:"+repeatAnno.BikeName());
					System.out.println("Bike Speed:"+repeatAnno.bikeSpeed());
					System.out.println("Bike Mileage:"+repeatAnno.bikeMileage());	
				}
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
