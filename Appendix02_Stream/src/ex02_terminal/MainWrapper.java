package ex02_terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainWrapper {

  public static void ex01() {
    
    // 통계 계산
    
    // IntStream iStream = IntStream.range(1, 6);  // 1,2,3,4,5
    
    System.out.println("합계: " + IntStream.range(1, 6).sum());
    System.out.println("평균: " + IntStream.range(1, 6).average().getAsDouble());
    System.out.println("개수: " + IntStream.range(1, 6).count());
    System.out.println("최대: " + IntStream.range(1, 6).max().getAsInt());
    System.out.println("최소: " + IntStream.range(1, 6).min().getAsInt());
    
  }

  public static void ex02() {
    
    // Stream -> List
    
    // Stream
    Stream<String> stream = Stream.of("봄", "여름", "가을", "겨울");
    
    // Stream -> List
    List<String> list = stream.collect(Collectors.toList());
    System.out.println(list);
    
  }
  
  public static void ex03() {
    
    List<Person> people = Arrays.asList(
        new Person("김철수", 20),
        new Person("고영희", 30),
        new Person("김상철", 5),
        new Person("이미희", 7)
    );
    
    // allMatch() : 모든 요소를 검사해서 모두 만족하면 true 반환
    boolean result1 = people.stream()
                            .allMatch((person) -> person.getAge() >= 20);
    System.out.println("모두 20살 이상인가? " + result1);
    
    // anyMatch() : 모든 요소를 검사해서 하나만 만족해도 true 반환
    boolean result2 = people.stream()
                            .anyMatch((person) -> person.getAge() >= 20);
    System.out.println("한 명이라도 20살 이상인가? " + result2);
    
    // noneMatch() : 모든 요소를 검사해서 모두 만족하지 않으면 true 반환
    boolean result3 = people.stream()
                            .noneMatch((person) -> person.getAge() >= 20);
    System.out.println("모두 20살 이상이 아닌가? " + result3);
    
  }
  
  public static void ex04() {
    
    // List
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    
    // T reduce(T identity, BinaryOperator<T> accumulator);
    int total1 = numbers.stream()
                        .reduce(0, (a, b) -> a + b);  // 스트림 요소가 없는 경우 0을 반환
    System.out.println(total1);
    
    
    // Optional<T> reduce(BinaryOperator<T> accumulator);
    Optional<Integer> opt = numbers.stream()
                                   .reduce((a, b) -> a + b);
    int total2 = opt.get();  // Optinal로 감싼 값을 꺼내는 get() 메소드
    System.out.println(total2);
    
    
    // Optional<T> reduce(BinaryOperator<T> accumulator);
    int total3 = numbers.stream()
                        .reduce(Integer::sum)
                        .get();// reduce의 결과가 Optional이므로 값을 빼기 위해 get() 메소드를 추가한다.
    System.out.println(total3);

    // Integer::sum은 Integer 클래스의 sum 메소드를 호출함을 의미한다.
    // class Integer { 
    //   public static int sum(int a, int b) {
    //     return a + b;
    //   }
    // }
    
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
    ex04();
  }

}
