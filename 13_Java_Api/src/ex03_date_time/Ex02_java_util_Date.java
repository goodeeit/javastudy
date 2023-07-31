package ex03_date_time;

import java.util.Date;

public class Ex02_java_util_Date {

  public static void main(String[] args) {
  
    // 현재 날짜와 시간
    Date date1 = new Date();
    System.out.println(date1);
    
    // 타임스탬프 값에 해당하는 날짜와 시간
    Date date2 = new Date(24 * 60 * 60 * 1000);  // 1일이 지난 타임스탬프
    System.out.println(date2);
    
  }
  
}
