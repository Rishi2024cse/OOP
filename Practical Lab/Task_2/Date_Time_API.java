package practical_Task2;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time_API {
 public static void main(String[] args) {
	 //String Handling
	 String name = "JAVA";
	 System.out.println("Original: "+name);
	 System.out.println("Uppercase: "+name.toUpperCase());
	 System.out.println("Substring: "+name.substring(1,3));
	 System.out.println("Replaced " + name.replace('a','@'));
	 
	 // Date and Time API
	 LocalDateTime now = LocalDateTime.now();
	 DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
	 System.out.println("Current Date-Time: " + now.format(format));
	 
	 //Period example
	 LocalDate starDate = LocalDate.of(2025,  1, 1);
	 Period diff = Period.between(starDate, LocalDate.now());
	 System.out.println("Difference: "+diff.getYears()+" years,"+ diff.getMonths() + "months");
 }
}

