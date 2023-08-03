package ex01_mkdirs;

import java.io.File;
import java.time.LocalDateTime;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 현재 날짜와 시간을 이용하여 디렉터리를 만드시오.
    // C:/2023/08/03/14
    
    LocalDateTime localDateTime = LocalDateTime.now();
    int year = localDateTime.getYear();
    int month = localDateTime.getMonthValue();
    int day = localDateTime.getDayOfMonth();
    int hour = localDateTime.getHour();
    
    StringBuilder sb = new StringBuilder();
    sb.append("C:");
    sb.append("/");
    sb.append(year);
    sb.append("/");
    sb.append(String.format("%02d", month));
    sb.append("/");
    sb.append(String.format("%02d", day));
    sb.append("/");
    sb.append(String.format("%02d", hour));
    
    File dir = new File(sb.toString());
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    System.out.println(dir.getPath() + " 디렉터리 생성 완료");

  }

}