import java.util.*;

class Ex10_2 {
	public static void main(String[] args) {
		// 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워두었다.
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
 
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		// month의 경우 0부터 시작하기 때문에 4월인 경우, 3로 지정해야한다.
		// date1.set(2019, Calendar.APRIL, 29);와 같이 할 수도 있다.
		date1.set(2019, 3, 29); // 2019년 4월 29일로 날짜를 설정한다. 
		System.out.println("date1은 "+ toString(date1) 
                  + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
		System.out.println("오늘(date2)은 " + toString(date2) 
                 + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");

	   // 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야한다.
   	long difference = 
            (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 "
                                           + difference +"초가 지났습니다.");
		System.out.println("일(day)로 계산하면 "+ difference/(24*60*60) 
                                     +"일입니다."); // 1일 = 24 * 60 * 60
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) 
                            +"월 " + date.get(Calendar.DATE) + "일 ";
	}
}