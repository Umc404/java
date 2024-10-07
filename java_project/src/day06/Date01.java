package day06;

import java.util.Calendar;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜 / 시간 클래스
		 * Date 클래스 => Deprecated(비권장). 업데이트가 멈추고 다른 사용방법으로 우회.
		 * Calendar => Date 후속작. 추상클래스 => 객체를 생성할 수 없음.
		 * new 키워드로 객체 생성이 불가능.
		 * getInstance() 메서드를 이용하여 객체를 얻어 옴.
		 * 
		 * */
		Calendar c = Calendar.getInstance(); // 오늘 날짜 가져옴.
		System.out.println(c);
		// month 0~11 표현(배열방식) => +1 해야함.
		System.out.println(c.getTime());
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		int month = c.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		int minute = c.get(Calendar.MINUTE);
		System.out.println(minute);
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		// 일 = 1, 월 = 2, ... 토 = 7
		
		int am_pm = c.get(Calendar.AM_PM);
		String weekStr="";
		
		switch(week) {
		case 1:		weekStr="일";		break;
		case 2: 	weekStr="월";		break;
		case 3:		weekStr="화";		break;
		case 4:		weekStr="수";		break;
		case 5:		weekStr="목";		break;
		case 6:		weekStr="금";		break;
		case 7:		weekStr="토";		break;
		}
		
		// 2024-10-7(월) 오후 3:51
		System.out.println(year + "-" + month + "-" + day + "(" + weekStr + ") "
							+ ((am_pm==0)? "오전":"오후") + " " + hour + ":" + minute);
	}
	
}
