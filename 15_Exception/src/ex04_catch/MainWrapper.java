package ex04_catch;

public class MainWrapper {

  public static void ex01() {

    try {
      
      // 1. Java가 발생시킨 예외
      // int a = 5 / 0;
      // System.out.println(a);
      
      // 2. 개발자가 발생시킨 예외
      throw new RuntimeException("개발자 예외");
      
      
    } catch (Exception e) {
      
      // 예외 클래스 확인하기
      System.out.println(e.getClass().getName());  // Object의 메소드 활용
      
      // 예외 메시지 확인하기(예외가 발생한 이유)
      System.out.println(e.getMessage());
      
    }
    
  }
  
  public static void ex02(String name) {
    
    try {
      
      System.out.println(name.substring(0, 1));
      
    } catch(Exception e) {
      
      e.printStackTrace();  // 예외 추적 메시지를 출력하는 메소드 (개발 중에는 이것만 사용한다.)
    
    }
    
  }
  
  public static void main(String[] args) {
    ex02(null);
  }

}
