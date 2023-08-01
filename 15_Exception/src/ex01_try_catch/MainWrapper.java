package ex01_try_catch;

public class MainWrapper {

  public static void ex01() {
    
    try {
      String name = "tom";
      Integer.parseInt(name);  // 발생한 NumberFormatException을 catch 블록으로 Java가 던진다.
    } catch(RuntimeException e) {
      System.out.println("예외발생");
    }
    
  }
  
  public static void main(String[] args) {
    ex01();
  }

}
