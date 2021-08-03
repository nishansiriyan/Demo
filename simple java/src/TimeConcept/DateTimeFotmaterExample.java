package TimeConcept;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFotmaterExample {
	public static void main(String args[]) {
		 	LocalDateTime currentDateTime = LocalDateTime.now();  
		 	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		    String formatDateTime = currentDateTime.format(format);   
		    System.out.println(formatDateTime);  
		    
	        System.out.println("\n*** LocalDateTime ***");
	        LocalDateTime localDateTime = LocalDateTime.now();
	        System.out.println("MEDIUM:" +DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(localDateTime));
	        System.out.println("SHORT:"+ DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(localDateTime));
	        System.out.println("Date:"+ DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(LocalDate.now()));
	        System.out.println("time:"+ DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(LocalTime.now()));
	        System.out.println("Date and time:"+ DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.now()));
	        System.out.println("Date and time:"+ DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).format(LocalDateTime.now()));
	        
	        System.out.println("====================================");
	        String DatePattern = "dd.MM.yyyy";
	        DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern(DatePattern);
	        System.out.println(DateFormatter.format(LocalDate.of(2016, 7, 31)));
	        
	        System.out.println("====================================");
	        String localTime = "hh:mm:ss a";
	        DateTimeFormatter local = DateTimeFormatter.ofPattern(localTime);
	        LocalTime colonTime = LocalTime.of(17, 35, 50);
	        System.out.println(local.format(colonTime));
	        
	        
	}
}
