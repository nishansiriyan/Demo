package TimeConcept;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.Month;
public class ZonedTimeExample {

	public static void main(String[] args) {
		System.out.println("=========================================");
		ZonedDateTime zonedTime= ZonedDateTime.of(2020, 12, 3, 12, 20, 59,90000, ZoneId.systemDefault());
		System.out.println("Zoned time is:"+zonedTime);
		
		
		
		ZonedDateTime now = ZonedDateTime.now();
		 System.out.println("DayOfMonth        : " + now.getDayOfMonth());
	     System.out.println("MonthValue        : " + now.getMonthValue());
	     System.out.println("Year              : " + now.getYear());
	     System.out.println("Hour              : " + now.getHour());
	     System.out.println("Minute            : " + now.getMinute());
	     System.out.println("Second            : " + now.getSecond());
	     System.out.println("DAY_OF_MONTH      : " + now.get(ChronoField.DAY_OF_MONTH));        
	     System.out.println("MONTH_OF_YEAR     : " + now.get(ChronoField.MONTH_OF_YEAR));
	    System.out.println("YEAR              : " + now.get(ChronoField.YEAR));
		System.out.println("=========================================");
		//Zoned time modification
		//3 hours later
		ZonedDateTime zonedDateTime1 = now.plusHours(3);    
		 
		//3 minutes earliar
		ZonedDateTime zonedDateTime2 = now.minusMinutes(3);
		 
		//Next year same time
		ZonedDateTime zonedDateTime3 = now.plusYears(1);
		 
		//Last year same time
		ZonedDateTime zonedDateTime4 = now.minusYears(1);
		
		//
		ZonedDateTime zonedDateTime5=now.plusNanos(40000);
		System.out.println("Zoned time after adding 3 hours:"+zonedDateTime1);
		System.out.println("Zoned time after Substracting 3 minutes:"+zonedDateTime2 );
		System.out.println("Zoned time afetr adding 1 year:"+zonedDateTime3);
		System.out.println("Zoned time after substracting 2 years:"+zonedDateTime4);
		System.out.println("Zoned time after ading nano seconds:"+zonedDateTime5);
		
		System.out.println("=========================================");
		LocalDate ldate=LocalDate.parse("2021-04-28");
		LocalTime ltime=LocalTime.parse("11:23:43");
		ZoneId zid= ZoneId.of("Europe/Paris");
		ZonedDateTime zt =ZonedDateTime.of(ldate,ltime, zid);
		System.out.println("Created new Zoned time:"+zt);
		
		LocalDateTime localdt= LocalDateTime.parse("2018-11-03T12:45:30");
		ZoneId zoneid = ZoneId.of("Europe/Paris");
		ZonedDateTime zonedt= ZonedDateTime.of(localdt, zoneid );
		System.out.println("Created new Zoned time is:"+zonedt);
		
		//converting ZoneDatetime to local date
		System.out.println("=========================================");
		LocalDate localDate= zt.toLocalDate();
		System.out.println("Local Date is:"+localDate);
		
		//formating
		System.out.println("=========================================");
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("UTC"));
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss z");
		String formattedString2 = zonedDateTime.format(format);
		System.out.println("Formated time is:"+formattedString2);
		
		//Adding
		System.out.println("=========================================");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HHmm, dd MMM uuuu");
		LocalDateTime ldt = LocalDateTime.of(2017,Month.AUGUST, 22, 14, 30);
		ZonedDateTime klDateTime = ldt.atZone(ZoneId.of("Asia/Kuala_Lumpur"));
		System.out.println("LocalDateTime : " + format2.format(ldt));
		ZonedDateTime japanDateTime = klDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).plusHours(7);
	    System.out.println("Arrive : " + format.format(japanDateTime));
	    System.out.println("\n---Detail---");
	    System.out.println("Depart : " + klDateTime);
	    System.out.println("Arrive : " + japanDateTime);
	    
	    //comparing
	    System.out.println("=========================================");
	    ZonedDateTime zoneddatetime1 = ZonedDateTime.now();
	    ZonedDateTime zoneddatetime2 = ZonedDateTime.parse("2019-04-03T11:21:12.123+05:30[UTC]");
	    System.out.println("zoneddatetime1 in [Asia/Calcutta] - " + zoneddatetime1);
	    System.out.println("zoneddatetime2 in [UTC] - " + zoneddatetime2);
	    long difference = zoneddatetime1.compareTo(zoneddatetime2);
        if(difference > 0) {
            System.out.println("zoneddatetime1 > zoneddatetime2");
        } else if(difference < 0) {
            System.out.println("zoneddatetime1 < zoneddatetime2");
        } else {
            System.out.println("\"zoneddatetime1 = zoneddatetime2");
        }
		
        System.out.println("=========================================");
        ZonedDateTime zoneddatetime3 =  ZonedDateTime.parse("2019-04-03T13:01:14.745+05:30[Asia/Calcutta]");
        ZonedDateTime zoneddatetime4 = ZonedDateTime.parse("2019-04-03T12:11:11.745+05:30[Asia/Calcutta]");
        System.out.println(zoneddatetime3.isAfter(zoneddatetime4));    
        System.out.println(zoneddatetime3.isBefore(zoneddatetime4));     
        System.out.println(zoneddatetime3.isEqual(zoneddatetime4));  
        
        
	}
}
