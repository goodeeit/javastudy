package ex03_intermedia;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import ex02_terminal.Person;

public class MainWrapper {

  public static void ex01() {
    
    // 필터 (원하는 요소만 사용)
    
    // List
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    // 홀수만 출력하기
    list.stream()
      .filter((number) -> number % 2 == 1)     // 조건
      .forEach((n) -> System.out.println(n));  // 할일
    
  }

  public static void ex02() {
    
    // 필터 (원하는 요소만 사용)
    
    // List
    List<Person> list = Arrays.asList(
        new Person("홍자", 20),
        new Person("영미", 10),
        new Person("미희", 30),
        new Person("숙자", 15)
    );
    
    // age가 20 이상인 Person을 List로 생성
    List<Person> adult = list.stream()
                             .filter((person) -> person.getAge() >= 20)
                             .collect(Collectors.toList());
    
    // adult 확인
    adult.stream()
        .forEach((person) -> System.out.println(person.getName() + ", " + person.getAge()));
    
  }

  public static void ex03() {
    
    // 변환 (값을 바꿈)
    
    // List
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    // 1씩 증가시키기
    list.stream()
        .map((number) -> number + 1)
        .forEach((number) -> System.out.println(number));
    
  }
  
  public static void ex04() {
    
    // 변환 (값을 바꿈)
    
    // List
    List<Person> list = Arrays.asList(
        new Person("홍자", 20),
        new Person("영미", 10),
        new Person("미희", 30),
        new Person("숙자", 15)
    );
    
    // 필터 + 변환
    List<Person> adult = list.stream()
        .filter((person) -> person.getAge() >= 20)
        .map((person) -> new Person(person.getName() + "님", person.getAge() + 1))
        .collect(Collectors.toList());
    
    System.out.println(adult);
    
  }
  
  public static void ex05() {
    
    // distinct (중복된 요소 제거)
    
    IntStream.of(1, 1, 2, 2, 3, 3)
      .distinct()
      .forEach((number) -> System.out.println(number));
    
    // Person 객체의 중복 검사를 위해서는 Person 클래스에 equals 메소드의 오버라이딩이 필요하다.
    List<Person> people = Arrays.asList(
        new Person("이정숙", 15),
        new Person("이정숙", 15),
        new Person("김영철", 16),
        new Person("김영철", 16)
    );
    people.stream()
      .distinct()
      .forEach((person) -> System.out.println(person.getName() + ", " + person.getAge()));
  }
  
  public static void ex06() {
    
    // sorted (전달된 Comparator 또는 사전 편찬 순으로 정렬된 스트림을 반환)
    IntStream.of(3, 1, 6, 5, 2, 4)
      .sorted()  // 오름차순 정렬
      .forEach((number) -> System.out.println(number));
    
    System.out.println();
    
    Stream.of("google", "daum", "naver")
      .sorted()  // 사전순으로 정렬
      .forEach((word) -> System.out.println(word));
    
    System.out.println();
    
    Stream.of("google", "daum", "naver")
      .sorted(Comparator.comparing((word) -> word.length()))  // 글자수로 정렬
      .forEach((word) -> System.out.println(word));
    
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
//    ex05();
    ex06();
  }

}
