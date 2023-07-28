package ex04_Map;

import java.util.HashMap;
import java.util.Map;

public class MainWrapper {

  /*
   * HashMap
   * 1. Map 인터페이스를 구현한 클래스이다.
   * 2. 객체(Object)/인스턴스(Instance)를 대신할 수 있는 자료구조이다.
   * 3. 용어
   *    1) Entry : Key + Value를 합쳐서 부르는 말
   *    2) Key   : 데이터를 식별하는 식별자(변수명)
   *    3) Value : 데이터 자체(변수에 저장된 값)
   * 4. 특징
   *    1) Key는 중복이 불가능하다. (HashSet 구조로 되어 있다.)
   *    2) Value는 중복이 가능하다.
   *    3) Key와 Value 모두 Generic 처리한다.
   */
  
  public static void ex01() {
    
    // Map 인터페이스 타입으로 HashMap 선언
    Map<String, String> dict;
    
    // HashMap 생성
    dict = new HashMap<String, String>();
    
    // Entry 저장(Key, Value)
    dict.put("봄", "spring");
    dict.put("여름", "summer");
    dict.put("가을", "autumn");
    dict.put("겨울", "winter");
    
    // Value 확인(Key를 전달한다.)
    System.out.println(dict.get("봄"));
    System.out.println(dict.get("여름"));
    System.out.println(dict.get("가을"));
    System.out.println(dict.get("겨울"));
    
  }
  
  public static void main(String[] args) {
    ex01();
  }
  
}
