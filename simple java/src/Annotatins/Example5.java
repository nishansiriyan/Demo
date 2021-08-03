package Annotatins;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SingleAnnotation{
	int number(); 
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface SingleAnnotationMethod{
	String name() default "Sharath";
}

@SingleAnnotation(number=200)
class SimpleClass{
	
	@SingleAnnotationMethod
	public void display() {
		System.out.println("Annotation for method");
	}
}

public class Example5 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		SimpleClass ex=new SimpleClass();
		
		//Method
		Method method=ex.getClass().getMethod("display");
		Annotation[] anno1=method.getAnnotations();
		for(Annotation ann:anno1) {
			System.out.println(ann);
		}
		
		//Class
		Annotation[] anno2=ex.getClass().getAnnotations();
		for(Annotation ann2:anno2) {
			System.out.println(ann2);
		}
		
		
		
	}

}
