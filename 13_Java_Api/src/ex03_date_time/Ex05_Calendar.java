package ex03_date_time;

import java.util.Calendar;

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
    int year = calendar.get(Calendar.YEAR);  // Calendar.YEAR == 1
    
    System.out.println(year);
    
    
  }
  
  public static void main(String[] args) {
    ex01();
    
    
    
    
  }

}
