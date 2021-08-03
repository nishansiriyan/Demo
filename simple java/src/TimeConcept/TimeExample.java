package TimeConcept;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;
public class TimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Local date
		LocalDate date=LocalDate.now();
		System.out.println("Todays date:"+date);
		
		System.out.println("====Adding and Substracting days========");
		LocalDate date1=date.minusDays(1);
		System.out.println("Yesturdays date:"+date1);
		LocalDate date3=date.plusDays(1);
		System.out.println("Tommarrows date"+date3);
		LocalDate ldate=LocalDate.parse("1997-08-18");
		
		System.out.println("=========Adding and subtracting month and year======");
		LocalDate aMonth=date.minusMonths(3);
		LocalDate sMonth=date.plusMonths(6);
		LocalDate sYear=date.minusYears(3);
		LocalDate aYear=date.plusYears(10);
		System.out.println("After adding month:"+aMonth);
		System.out.println("After subtracting month:"+sMonth);
		System.out.println("After adding year:"+aYear);
		System.out.println("Created date:"+ldate);
		//
		LocalDate d1=LocalDate.of(2021,11, 23);
		LocalDate d2=LocalDate.of(2022,11, 23);
		System.out.println("================================");
		System.out.println("Checking equal or not:");
		System.out.println(d1.equals(d2));
		
		//
		
		//
		System.out.println("================================");
		System.out.println("Checking leap year:");
		System.out.println(d1.isLeapYear());
		
		//
		System.out.println("================================");
		DateTimeFormatter newFormat=DateTimeFormatter .ofPattern("dd-MM-yyyy");
		String newDate=date.format(newFormat);
		System.out.println("New format of date:"+newDate);
		
		//
		System.out.println("==============temporal field==================");
		LocalDate d3=LocalDate.now();
		int field=d3.get(ChronoField.DAY_OF_MONTH);
		System.out.println("Day of the month:"+field);
		int field2=d3.get(ChronoField.DAY_OF_WEEK);
		System.out.println("Day of week is:"+field2);
		int field3=d3.get(ChronoField.DAY_OF_YEAR);
		System.out.println("Day of year is:"+field3);
		
		
	}

}
