package ex04_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
  
  public static void ex02() {
    
    // HashMap 선언 & 생성
    Map<String, Object> person = new HashMap<String, Object>();
    
    // Entry 저장(Key는 변수명으로, Value는 변수값으로 저장)
    person.put("name", "홍길동");
    person.put("age", 30);
    
    // Entry 수정(기존의 Key를 사용하면 해당 Key의 Value가 수정되는 방식)
    person.put("name", "제시카");
    person.put("age", 40);
    
    // Value 확인
    System.out.println(person.get("name"));
    System.out.println(person.get("age"));
    
  }

  public static void ex03() {
    
    // HashMap 선언 & 생성
    Map<String, Object> map = new HashMap<String, Object>();
    
    // Entry 저장
    map.put("top", 10);
    map.put("bottom", 20);
    map.put("left", 30);
    map.put("right", 40);
    
    // 반복자(Iterator)를 이용한 순회
    // 1. Key만 모두 꺼내서 Set에 저장한다.(keySet 메소드)
    // 2. Set에 반복자(Iterator)를 붙여서 Key를 하나씩 꺼낸다.
    // 3. get() 메소드에 Key를 전달하면 Value가 나온다.
    Set<String> keySet = map.keySet();
    Iterator<String> arm = keySet.iterator();
    while(arm.hasNext()) {
      String key = arm.next();
      Object value = map.get(key);
      System.out.println(key + ": " + value);
    }
    
  }
  
  public static void ex04() {
    
    // HashMap 선언 & 생성
    Map<String, Object> map = new HashMap<String, Object>();
    
    // Entry 추가
    map.put("id", "admin");
    map.put("pw", "1234");
    map.put("role", "DBA");
    
    // 향상 for문 순회 (Entry 단위로 값을 빼는 entrySet() 메소드 활용)
    for(Entry<String, Object> entry : map.entrySet()) {
      String key = entry.getKey();
      Object value = entry.getValue();
      System.out.println(key + ": " + value);
    }
    
  }
  
  public static void main(String[] args) {
    ex01();
  }
  
}
