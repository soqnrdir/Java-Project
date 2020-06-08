package lecture11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDandT {

	public static void main(String[] args) {
	
	LocalDateTime currDateTime = LocalDateTime.now();
	System.out.println("현재 날짜와 시간: " + currDateTime);
			
	System.out.println();
	
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter dateTimeFormatter =
		DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
	String nowString = now.format(dateTimeFormatter);
	System.out.println(nowString);
		
		

	}

}
