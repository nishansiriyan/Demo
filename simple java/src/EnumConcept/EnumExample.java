package EnumConcept;

public class EnumExample {
public enum weeks{
	sunday, monday, tuesday, wednesday, thursday, friday, saturday ;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="monday";
		weeks e=weeks.valueOf(day);
		//return name of enum value
				System.out.println(e.name());
		switch(e) {
		case sunday:
			System.out.println("Happy Sunday");
			break;
		case monday:
			System.out.println("Happy Monday");
			break;
		case tuesday:
			System.out.println("Happy Tuesday");
			break;
		case wednesday:
			System.out.println("Happy Wednesday");
			break;
		case thursday:
			System.out.println("Happy Thursday");
			break;
		case friday:
			System.out.println("Happy Friday");
			break;
		case  saturday :
			System.out.println("Happy Saturday ");
			break;
		
		}
		
		//enum with loop
		weeks w[]=weeks.values();
		for(weeks w1:w) {
			System.out.println(w1+":Index value is:"+w1.ordinal());
		}
		
		
		System.out.println("Checking");
		weeks w1=weeks.tuesday;
		weeks w2=weeks.monday;
		System.out.println(w1.equals(w2));
		System.out.println("Comparing two values");
		int num=w1.compareTo(w2);
		if(num>0) {
			System.out.println("w1 is greater than w2");
		}else if(num<0){
			System.out.println("w1 is less than w2");
		}else {
			System.out.println("equal");
		}
	}
}
