package ex03_date_time;

import java.util.Calendar;
import java.util.Date;

public class Ex05_Calendar {

  /*
   * java.util.Calendar 클래스
   * 1. 특정 날짜를 생성할 수 있다.
   * 2. 날짜의 구성 요소(년, 월, 일, ...)를 쉽게 가져다 사용할 수 있다.
   */

  public static void ex01() {
    
    // 현재 날짜와 시간
    Calendar calendar = Calendar.getInstance();
    
    // 구성요소 가져오기
    int year = calendar.get(Calendar.YEAR);           // Calendar.YEAR == 1 이므로 int year = calendar.get(1)과 같다.
    int month = calendar.get(Calendar.MONTH) + 1;     // 월(0~11) : 주의가 필요하다.
    int day = calendar.get(Calendar.DAY_OF_MONTH);    // 일(1~31)
    int weekNo = calendar.get(Calendar.DAY_OF_WEEK);  // 일(1), 월(2), ... 토(7)
    int ampm = calendar.get(Calendar.AM_PM);          // 오전(0), 오후(1)
    int hour12 = calendar.get(Calendar.HOUR);         // 12시각(1~12)
    int hour24 = calendar.get(Calendar.HOUR_OF_DAY);  // 24시각(0~23)
    int minute = calendar.get(Calendar.MINUTE);       // 분(0~59)
    int second = calendar.get(Calendar.SECOND);       // 초(0~59)
    
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(weekNo);
    System.out.println(ampm);
    System.out.println(hour12);
    System.out.println(hour24);
    System.out.println(minute);
    System.out.println(second);
    
  }
  
  public static void ex02() {
    
    // 현재 날짜와 시간
    Calendar calendar = Calendar.getInstance();
    
    // 특정 날짜로 변경
    calendar.set(Calendar.YEAR, 2022);        // 년도만 2022로 수정
    
    // 특정 기간 이후/이전으로 변경
    calendar.add(Calendar.MONTH, 1);          // 1개월 후
    calendar.add(Calendar.DAY_OF_MONTH, -1);  // 1일 전

    // Calendar를 이용해서 타임스탬프 알아내기
    long timestamp = calendar.getTimeInMillis();
    System.out.println(timestamp);
    
    // Calendar를 이용해서 Date 알아내기
    Date date = calendar.getTime();
    System.out.println(date);
    
  }
  
  public static void main(String[] args) {
    ex02();
  }

}
