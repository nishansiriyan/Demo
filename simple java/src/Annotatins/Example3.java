package Annotatins;

class StudentsMarks{
	public int mk1,mk2,mk3;
	public double total=0;
	public StudentsMarks(int m1,int m2,int m3) {
		this.mk1=m1;
		this.mk2=m2;
		this.mk3=m3;
	}
	
	@Deprecated
	public double result() {
		total=mk1+mk2+mk3;
		return total;
	}
	@Deprecated
	public void display() {
		System.out.println("Total Marks is:"+result());
	}
}
public class Example3 {

	public static void main(String[] args) {
		StudentsMarks m=new StudentsMarks(69,80, 90);
		m.result();
		m.display();
		
	}

}
