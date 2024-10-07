package day06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		
		String t = today.toString();
		System.out.println(t);
		
		String date = t.substring(0, t.indexOf("T"));
		System.out.println(date);
//		String time = t.substring(t.indexOf("T")+1, t.indexOf("T")+6);
		String time = t.substring(t.indexOf("T")+1);
		String time_hm[] = time.split(":");
		System.out.println(time_hm[0] + " : " + time_hm[1] +" : "+time_hm[2]);
//		System.out.println(time_sp[1]);
		System.out.println("time : "+time);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				
		LocalDateTime sDate = LocalDateTime.of(2009,9,30,8,30);
		System.out.println(sDate.format(dtf));
	}

}
