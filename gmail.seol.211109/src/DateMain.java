import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//1986년 5월 5일
		Calendar meetday = new GregorianCalendar(1986, 4, 5);
		
		//오늘 날짜
		Calendar today = Calendar.getInstance();
		
		//epoch time으로 변환해서 빼기
		long cha = today.getTimeInMillis() - meetday.getTimeInMillis();
		
		//초 단위
		long second = cha / 1000;
		
		long minute = second / 60;
		
		long hour = minute / 60;
		
		long day = hour / 24;
		
		System.out.println("제시카를 만난지 "+ day + "일이 지났습니다");
		
		Date date= new Date(today.getTimeInMillis());
		System.out.println(date);
		
		//캘린더는 직접 출력하지는 않는다
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal);
		
	}

}
