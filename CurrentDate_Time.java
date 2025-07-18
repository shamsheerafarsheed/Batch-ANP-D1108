package Date_Number_CurrencyDemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDate_Time {

	public static void main(String[] args) {
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate=now.format(formatter);
		System.out.println("Formatted Date:"+formattedDate);

	}

}
