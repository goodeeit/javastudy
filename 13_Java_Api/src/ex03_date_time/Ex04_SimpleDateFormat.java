package ex03_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04_SimpleDateFormat {

  public static void main(String[] args) {
    
    /*
     * java.text.SimpleDateFormat 클래스
     * 1. 날짜, 시간 형식을 지정할 수 있는 클래스이다.
     * 2. 원하는 형식을 패턴(Pattern)으로 전달할 수 있다.
     * 3. 패턴
     *    1) yy   : 년도 2자리
     *    2) yyyy : 년도 4자리
     *    3) M    : 월 1자리(1~12)
     *    4) MM   : 월 2자리(01~12)
     *    5) MMM  : 문자열(1월~12월)
     *    6) d    : 일 1자리(1~31)
     *    7) dd   : 일 2자리(01~31)
     *    8) E    : 요일(일~토)
     *    9) a    : 오전/오후(오전, 오후)
     *   10) h    : 12시각 1자리(1~12)
     *   11) hh   : 12시각 2자리(01~12)
     *   12) H    : 24시각 1자리(0~23)
     *   13) HH   : 24시각 2자리(00~23)
     *   14) m    : 분 1자리(0~59)
     *   15) mm   : 분 2자리(00~59)
     *   16) s    : 초 1자리(0~59)
     *   17) ss   : 초 2자리(00~59)
     */
    
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
    String strDate = sdf.format(date);
    System.out.println(strDate);

    System.out.println(new SimpleDateFormat("yy/MM/dd E HH:mm:ss").format(date));
    
  }

}