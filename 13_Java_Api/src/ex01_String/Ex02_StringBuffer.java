package ex01_String;

public class Ex02_StringBuffer {

  public static void main(String[] args) {
    
    /*
     * java.lang.StringBuffer 클래스
     * 1. JDK 1.0부터 사용 가능하다.
     * 2. String을 연결하는 클래스이다. (문자열 연결 연산자 +를 대체하는 클래스)
     * 3. synchronized(동기화) 처리되어 멀티스레드 환경에서 사용할 수 있다.
     * 4. 동작이 느리다.
     * 5. String 클래스에 비해서 메모리 낭비가 적다.
     */
    
    // StringBuffer 객체 선언
    StringBuffer sb;
    
    // StringBuffer 객체 생성
    sb = new StringBuffer();
    
    // append 메소드를 이용한 문자열 연결
    sb.append("ha");
    sb.append("va");
    sb.append("na");
    
    // StringBuffer 객체에 저장된 문자열을 String으로 변환
    String str = sb.toString();
    System.out.println(str);

  }

}