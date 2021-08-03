package TimeConcept;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeExample2 {

	public static void main(String[] args) {
	
		LocalTime time=LocalTime.now();
		System.out.println("Time is:"+time);
		
		//creating own time
		LocalTime time2=LocalTime.of(3,45, 53);
		System.out.println("=============================================");
		System.out.println("New Time is:"+time2);
		LocalTime time3 = LocalTime.parse("12:32:22", DateTimeFormatter.ISO_TIME);
	    System.out.println(time3);
	 // Retrieving from LocalDateTime
        LocalTime time4 = LocalDateTime.now().toLocalTime();
        System.out.println(time4);
        
        System.out.println("=============================================");
        System.out.println("Hour:"+time.getHour());
        System.out.println("Minute:"+time.getMinute());
        System.out.println("Second:"+time.getSecond());
       
        
        //Local time Arithmatic
        System.out.println("=============================================");
        //Addition
        System.out.println("Adding 2 hours: " + time.plusHours(2));
        System.out.println("Adding 25 minutes: " + time.plusMinutes(25));
        System.out.println("Adding 40 seconds: " + time.plusSeconds(40));
        System.out.println("Adding 30000 nanoseconds: " + time.plusNanos(30000));
        
        //subtraction
        System.out.println("Subtracting 3 hours: " + time.minusHours(3));
        System.out.println("Subtracting 30 minutes: " + time.minusMinutes(30));
        System.out.println("Subtracting 45 seconds: " + time.minusSeconds(45));
        System.out.println("Subtracting 40000 nanoseconds: " + time.minusNanos(40000));
        
        //unill
        System.out.println("=============================================");
        LocalTime t1=LocalTime.now();
        LocalTime t2=LocalTime.parse("22:15:30");
        System.out.printf(" %shours%n",t1.until(t2, ChronoUnit.HOURS));
        System.out.printf(" %sminutes%n", t1.until(t2 ,ChronoUnit.MINUTES));
        System.out.printf(" %sseconds%n", t1.until(t2, ChronoUnit.SECONDS));
        System.out.println("=============================================");
        
        //Comparing 
        LocalTime t3 = LocalTime.of(4, 23, 12);
        LocalTime t4 = LocalTime.of(8, 03, 50);
        if (t3.compareTo(t4) == 0) {
            System.out.println("t3 and t4 are equal");
        } else {
            System.out.println("t3 and t4 are not equal");
        }

        if (t3.isBefore(t4)) {
            System.out.println("t3 comes before t4");
        } else {
            System.out.println("t3 does not come before t4");
        }

        if (t3.isAfter(t4)) {
            System.out.println("t3 comes after t4");
        } else {
            System.out.println("t3 does not come after t4");
        }
        
        //truncate
        System.out.println("=============================================");
        LocalTime t5=LocalTime.now();
        System.out.println(t5.truncatedTo(ChronoUnit.HOURS));
        System.out.println(t5.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(t5.truncatedTo(ChronoUnit.SECONDS));
        
        System.out.println("=============================================");
        //with
        LocalTime t6=LocalTime.now();
        LocalTime newTime1=t6.withHour(6);
        System.out.println("New time with hour:"+newTime1);
        LocalTime newTime2=t6.withMinute(30);
        System.out.println("New time with Minute:"+newTime2);
        LocalTime newTime3=t6.withSecond(28);
        System.out.println("New time with Second:"+newTime3);
	}

}
