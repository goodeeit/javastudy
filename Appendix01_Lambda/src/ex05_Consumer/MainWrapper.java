package ex05_Consumer;

import java.util.Arrays;
import java.util.function.Consumer;

public class MainWrapper {

  /*
   * Consumer 인터페이스
   * 
   * 1. 형식
   * 
   *    @FunctionalInterface
   *    public interface Consumer<T> {
   *      void accept(T t);
   *    }
   *    
   * 2. 하나의 파라미터를 받아서 사용하고 반환하지 않는 함수형 인터페이스이다.
   * 3. accept() 추상 메소드를 가지고 있다.
   * 4. 값을 받아서 사용만 하기 때문에 "소비자(Consumer)"라고 부른다.
   */
  
  public static void ex01() {
    
    Consumer<String> consumer = (t) -> System.out.println(t + "님");
    consumer.accept("홍길동");
    
  }
  
  public static void ex02(Consumer<String> consumer) {
    String str = "east,west,south,north";
    consumer.accept(str);
  }
  
  public static void main(String[] args) {
//    ex01();
    ex02((t) -> {
      String[] array = t.split("[,]");
      System.out.println(Arrays.toString(array));
    });  // 콤마로 분리해서 배열에 저장한 뒤 해당 출력하기
  }

}