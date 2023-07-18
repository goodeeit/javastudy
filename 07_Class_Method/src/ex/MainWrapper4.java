package ex;

public class MainWrapper4 {

  // void : 리턴이 없다.
  public static void ex01() {
    System.out.println("리턴이 없는 ex01");
  }
  
  // int : 리턴이 int 타입이다.
  public static int ex02() {
    return 100;
  }
  
  public static String ex03() {
    return "Hello world";
  }
  
  public static void main(String[] args) {
  
    ex01();
 
    int n = ex02();  // 실행 후에는 int n = 100;
    System.out.println(n);
    System.out.println(ex02());  // 실행 후에는 System.out.println(100);
    if(ex02() > 0) {
      System.out.println("양수");
    } else {
      System.out.println("음수");
    }
    
    String str = ex03();
    System.out.println(str);  // Hello world
    
  }

}
