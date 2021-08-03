package TimeConcept;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalenderExample {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println("Time is:"+c.getTime());
		System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + c.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + c.get(Calendar.SECOND));
        System.out.println("Calendar's time value in milliseconds:"+c.getTimeInMillis());
        int max = c.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in a week: " + max);
        int min = c.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + min);
        
        System.out.println("==================Addind=======================");
        c.add(Calendar.DATE, -10);
        System.out.println("10 days ago: " + c.getTime());
        c.add(Calendar.MONTH, 2);
        System.out.println("2 months later: " + c.getTime());
        c.add(Calendar.YEAR, 5);
        System.out.println("5 years later: " + c.getTime());
        
        
        System.out.println("==================Seting maually==========");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
        c.set(Calendar.YEAR, 2014);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.MINUTE, 33);
        System.out.println("New Date: " + sdf.format(c.getTime()));
        
        System.out.println("=============================================");
        //Creating GregorianCalendar of specific date
        Calendar cal2 = new GregorianCalendar(2018, Calendar.MAY, 29);
        Date d = cal2.getTime();
        System.out.println("date from Calendar : " + d);

        //
        
        System.out.println("=============================");
        Calendar c2=Calendar.getInstance();
        c2.set(Calendar.YEAR, 2015);
        c2.set(Calendar.MONTH, 19);
        c2.set(Calendar.MINUTE, 23);
        
        System.out.println(c.after(c2));
        System.out.println(c.before(c2));
        System.out.println(c.equals(c2));
        
        //Compare
        System.out.println("=============================");
        System.out.println(c.compareTo(cal2));
        
        //====================================Formating===========================================
        //Converting calender to local time
        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();
        ZoneId zoneId = tz.toZoneId();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(calendar.toInstant(), zoneId);
        System.out.println("Local date time object  : "+localDateTime);
        Date input = calendar.getTime();
        LocalDate la = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("Calender to LocalDate : "+la);

	}

}
