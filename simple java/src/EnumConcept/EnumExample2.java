package EnumConcept;

public class EnumExample2 {
	public enum Bike{
		Pulsar(78000,30,200),Suzuki(650000,45,150),Kavasaki(900000,25,300);
		private int bPrice,bMileage,bSpeed;
		Bike(int price,int mileage,int speed){
			bPrice=price;
			bMileage=mileage;
			bSpeed=speed;
		}
		public void display() {
			System.out.println("Bike Price:"+bPrice);
			System.out.println("Bike Speed:"+bMileage);
			System.out.println("Bike Mileage:"+bSpeed);
		}
		
	}
	
	public static void main(String[] args) {
		Bike b=Bike.Kavasaki;
		System.out.println(b);
		b.display();
		Bike b2=Bike.Pulsar;
		System.out.println(b2);
		b2.display();
		Bike b3=Bike.Pulsar;
		System.out.println(b3);
		b3.display();
	}

}
