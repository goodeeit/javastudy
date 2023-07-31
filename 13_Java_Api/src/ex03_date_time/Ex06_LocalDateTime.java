package ex03_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex06_LocalDateTime {

  /*
   * JDK 1.8 이후
   * 1. 날짜 : java.time.LocalDate
   * 2. 시간 : java.time.LocalTime
   * 3. 둘다 : java.time.LocalDateTime
   */
  
  public static void ex01() {
    
    // 현재 날짜
    LocalDate date1 = LocalDate.now();
    System.out.println(date1);
    
    // 특정 날짜
    LocalDate date2 = LocalDate.of(2023, 7, 31);  // 2023년 7월 31일
    System.out.println(date2);
    
    // 문자열 날짜 처리
    LocalDate date3 = LocalDate.parse("2023-07-31");  // 기본 패턴 : yyyy-MM-dd
    System.out.println(date3);
    
  }
  
  public static void ex02() {
    
    // 현재 시간
    LocalTime time1 = LocalTime.now();
    System.out.println(time1);
    
    // 특정 시간
    LocalTime time2 = LocalTime.of(15, 25, 30);  // 15시 25분 30초
    System.out.println(time2);
    
    // 문자열 시간 처리
    LocalTime time3 = LocalTime.parse("14:25:30");  // 기본 패턴 HH:mm:ss
    System.out.println(time3);
    
  }
  
  public static void ex03() {
    
    // 현재 날짜와 시간
    LocalDateTime dateTime1 = LocalDateTime.now();
    System.out.println(dateTime1);
    
    // 특정 날짜와 시간
    LocalDateTime dateTime2 = LocalDateTime.of(2023, 7, 31, 15, 25, 30);
    System.out.println(dateTime2);

    // 문자열 형식의 날짜와 시간
    LocalDateTime dateTime3 = LocalDateTime.parse("2023-07-31T15:28:30");
    System.out.println(dateTime3);
    
  }
  
  public static void ex04() {
    
    // 패턴 지정하기
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
    String strDateTime = dtf.format(dateTime);
    System.out.println(strDateTime);
    
  }
  
  public static void ex05() {
    
    // 날짜/시간 구성요소 가져오기
    
    LocalDateTime dateTime = LocalDateTime.now();
    
    int year = dateTime.getYear();         // 년
    int month = dateTime.getMonthValue();  // 월(1~12)
    int day = dateTime.getDayOfMonth();    // 일
    int hour = dateTime.getHour();         // 시(0~23)
    int minute = dateTime.getMinute();     // 분
    int second = dateTime.getSecond();     // 초
    
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(hour);
    System.out.println(minute);
    System.out.println(second);
    
  }
  
  public static void main(String[] args) {
    ex05();
  }

}
