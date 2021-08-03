package TimeConcept;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

	public static void main(String[] args) {
		//Creating local date time
		LocalDateTime lt=LocalDateTime.now();
		System.out.println(lt);
		LocalDateTime localDateTime = LocalDateTime.of(2021, 04, 24, 14, 33, 48, 123456789);
	        
	     System.out.println(localDateTime);
		//parsing
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
		String time1 = "2019-03-27 10:15:30 AM";
		LocalDateTime localTimeObj1 = LocalDateTime.parse(time1, formatter);
		System.out.println("Parsed time:"+localTimeObj1);

		System.out.println("=======================Modification========================");
		
		LocalDateTime localDateTime1 = lt.plusHours(5);    
		LocalDateTime localDateTime2 =lt.minusMinutes(9);
		LocalDateTime localDateTime3 = lt.plusYears(4);
		LocalDateTime localDateTime4 = lt.minusYears(8);
		
		System.out.println("After adding 3 hour:"+localDateTime1);
		System.out.println("After substracting 9 minutes:"+localDateTime2);
		System.out.println("After adding 4 years:"+localDateTime3);
		System.out.println("After substracting 8 years:"+localDateTime4);
		
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.getNano());
		
		System.out.println("=========================================================");
		System.out.println(lt.get(ChronoField.DAY_OF_MONTH));
		System.out.println(lt.get(ChronoField.DAY_OF_WEEK));
		System.out.println(lt.get(ChronoField.DAY_OF_YEAR));

		
		System.out.println("=========================================================");
		LocalDate ld=lt.toLocalDate();
		LocalTime ltime=lt.toLocalTime();
		System.out.println("Local Time:"+ltime);
		System.out.println("Local day:"+ld);
		
		//=================checking================================================
		System.out.println("=========================================================");
		System.out.println(lt.equals(localDateTime1));
		System.out.println(lt.isBefore(localDateTime4));
		System.out.println(lt.isAfter(localDateTime4));
		
		System.out.println("=========================================================");
		System.out.println(lt.withHour(8));
		System.out.println(lt.withSecond(45));
		System.out.println(lt.withMinute(25));
			}

}
