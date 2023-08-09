package ex08_method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainWrapper {

  /*
   * 메소드 참조(method reference)
   * 1. 람다식이 오직 1개의 메소드만 호출하는 경우에 불필요한 매개변수 선언을 제거하고 사용할 수 있도록 도와주는 방식이다.
   * 2. 문법상으로만 매개변수가 제거되는 것이지 실제로 제거되는 것은 아니다. (여전히 매개변수로 인수를 전달할 수 있다.)
   * 3. 매개변수가 제거되기 때문에 람다식의 "() ->" 부분이 없어진다.
   * 4. 형식
   *    1) 클래스::메소드
   *    2) 객체::메소드
   */
  
  public static void ex01() {
    
    // Consumer 람다식 (매개변수 number로 전달된 인수를 출력한다.)
    Consumer<Integer> consumer1 = (number) -> System.out.println(number);
    consumer1.accept(10);

    // Consumer 메소드 참조 (문법상으로 매개변수가 제거된 상태이지만 매개변수로 인수가 여전히 전달된다.)
    Consumer<Integer> consumer2 = System.out::println;
    consumer2.accept(20);
    
  }
  
  public static void ex02() {
    
    // Function 람다식 (매개변수 t를 Integer로 변환한 값을 반환한다.)
    Function<String, Integer> function1 = (t) -> Integer.parseInt(t);
    int n1 = function1.apply("100");
    System.out.println(n1);

    // Function 메소드 참조 (Integer.parse() 결과를 반환한다. -> 역시 어떤 값이 전달되는지는 문법상으로 제거된 상태이다.)
    Function<String, Integer> function2 = Integer::parseInt;
    int n2 = function2.apply("200");
    System.out.println(n2);
    
  }
  
  public static void ex03() {
    
    // List
    List<Person> people = Arrays.asList(
      new Person("정숙", 20),
      new Person("재홍", 30),
      new Person("정희", 40)
    );
    
    // Function 람다식 (매개변수 p의 getName() 메소드 결과를 반환한다.)
    Function<Person, String> function3 = (p) -> p.getName();
    for(Person p : people) {
      System.out.println(function3.apply(p));
    }
    
    // Function 메소드 참조 (매개변수가 생략되어 있지만 매개변수는 Person 타입임을 알 수 있다. 매개변수로 전달된 Person의 getName() 메소드 결과를 반환한다.
    Function<Person, String> function4 = Person::getName;
    for(Person p : people) {
      System.out.println(function4.apply(p));
    }
    
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
  }

}
