package ex05_throws;

public class MainWrapper {

  /*
   * throws
   * 1. 메소드에서 발생하는 모든 예외를 던질 때 사용한다.
   * 2. 메소드 내부에서 try-catch를 처리하지 않고, 메소드를 호출하는 곳으로 예외를 던질 때 사용한다.
   * 3. 메소드를 호출하는 곳에서 try-catch를 처리한다.
   */
  
  // print 메소드 정의
  // throws NullPointerException : 메소드를 호출할 때 NullPointerException 처리가 필요하다.
  public static void print(String str) throws NullPointerException {
    System.out.println("첫 글자: " + str.substring(0, 1));
    System.out.println("나머지 글자: " + str.substring(1));
  }
  
  public static void main(String[] args) {
    
    try {
      // print 메소드 호출
      print("홍길동");
      print(null);
    } catch(NullPointerException e) {
      System.out.println(e.getMessage());
    }
    
  }

}