package OOPS;

class Person{
	public int personId;
	public String personName;
	public long personMobile;
	public int age;
	public String personAddress;
	public Person(int personId,String personName,long personMobile,int age,String personAddress){
		this.personId=personId;
		this.personName=personName;
		this.personMobile=personMobile;
		this.age=age;
		this.personAddress=personAddress;
	}
	public void display() {
		System.out.println("Person ID:"+personId);
		System.out.println("Person Name:"+personName);
		System.out.println("Person Number:"+personMobile);
		System.out.println("Person Age:"+age);
		System.out.println("Address:"+personAddress);
	}
	
}
class Occupation extends Person{
	public String position;
	public String companyName;
	public int empId;
	public Occupation(int personId,String personName,long personMobile,int age,String personAddress,String position,String companyName,int empId ){
		super(personId,personName,personMobile, age, personAddress);
		this.position=position;
		this.companyName=companyName;
		this.empId=empId;
	}
	public void display() {
		super.display();
		System.out.println("Position:"+position);
		System.out.println("Company Name:"+companyName);
		System.out.println("Employee ID:"+empId);
	}
	
}

class VehicleDetails extends Person{
	public String vechileType;
	public String vechileName;
	public int speed;
	public VehicleDetails(int personId,String personName,long personMobile,int age,String personAddress,String vechileType,String vechileName,int speed){
		super(personId,personName,personMobile, age, personAddress);
		this.vechileType=vechileType;
		this.vechileName= vechileName;
		this.speed=speed;
	}
	public void display() {
		super.display();
		System.out.println("VechileType:"+vechileType);
		System.out.println("Vechile Name:"+vechileName);
		System.out.println("Speed:"+speed);
	}
}
public class HierarchicalInheritance {
	public static void main(String args[]) {
		Occupation o=new Occupation(100,"Akash",998012954,34,"Mangalore","Team Leader","Infosys",4000);
		o.display();
		VehicleDetails v=new VehicleDetails(200,"Praveen",889001234,56,"Mysore","two-wheeler","pulsar",200);
		v.display();
	}
}
