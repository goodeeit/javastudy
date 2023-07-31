package ex03_date_time;

import java.sql.Date;
import java.sql.Timestamp;

public class Ex03_java_sql_Date {

  public static void main(String[] args) {
    
    // java.sql.Date 클래스
    // DB의 DATE 타입을 처리하는 Date 클래스
    Date date = new Date(System.currentTimeMillis());  // 현재 날짜
    System.out.println(date);
    
    // java.sql.Timestamp 클래스
    // DB의 TIMESTAMP 타입을 처리하는 Timestamp 클래스
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());  // 현재 날짜
    System.out.println(timestamp);

  }

}