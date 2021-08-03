package Example;

public class Check {
	public void primitive(int number) {
		for(int i=0;i< number;i++) ;	
	}
	public void wrapper(Integer number) {
		for(int i=0;i< number;i++) ;	
	}
	public static void main(String[] args) {
		Check obj=new Check();
		// get the start time
	    long start = System.nanoTime();
	    // call the method
	    //obj.primitive(5);
	    obj.wrapper(5);
	    // get the end time
	    long end = System.nanoTime();
	    long executing=end-start;
	    System.out.println("Execution time:"+executing);
	}
}
