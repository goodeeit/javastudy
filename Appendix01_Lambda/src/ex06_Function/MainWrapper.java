package ex06_Function;

import java.util.function.Function;

public class MainWrapper {

  /*
   * Function 인터페이스
   * 
   * 1. 형식
   * 
   *    @FunctionalInterface
   *    public interface Function<T, R> {
   *      R apply(T t);
   *    }
   *    
   * 2. 파라미터를 받아서 특정 처리를 한 뒤 해당 값을 반환하는 함수형 인터페이스이다.
   * 3. 파라미터 T를 받아서 R을 반환하는 apply() 메소드를 가지고 있다.
   * 4. 특정 처리를 한 뒤 처리된 값을 반환하기 때문에 "함수(Function)"라고 부른다.
   */
  
  public static void ex01() {
    
    Function<String, String> function = (name) -> name + "님";  // name을 전달하면 name+"님"을 반환
    String name = function.apply("홍길동");
    System.out.println(name);
    
  }
  
  public static void ex02() {
    
    // String 전달("100")하면 Integer 반환(100)하는 Function
    
    Function<String, Integer> function = (str) -> Integer.parseInt(str);
    int n = function.apply("100");
    System.out.println(n);
    
  }
  
  public static void main(String[] args) {
//    ex01();
    ex02();
  }

}