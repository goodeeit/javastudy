package ex07_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainWrapper {

  /*
   * Predicate 인터페이스
   * 
   * 1. 형식
   * 
   *    @FunctionalInterface
   *    public interface Predicate<T> {
   *      boolean test(T t);
   *    }
   *    
   * 2. 하나의 파라미터를 전달 받아서 true 또는 false를 반환하는 함수형 인터페이스이다.
   * 3. 특정 값을 전달하면 해당 값을 검사한 뒤 true/false 여부를 반환하는 test() 메소드를 가지고 있다.
   * 4. 어떤 값이 조건을 만족하는지 설명하기 때문에 "설명부(Predicate")이라고 부른다.
   */
  
  public static void ex01() {
    
    // 양수이면 true 아니면 false를 반환
    
    Predicate<Integer> isPositive = (n) -> n >= 0;
    if(isPositive.test(-1)) {
      System.out.println("양수");
    } else {
      System.out.println("음수");
    }
    
  }
  
  public static<T> void ex02(Predicate<T> predicate, List<T> list) {
    
    // List<T>에 존재하는 홀수만 출력하기
    
    for(int i = 0, length = list.size(); i < length; i++) {
      T element = list.get(i);
      if(predicate.test(element)) {
        System.out.println(element);
      }
    }
    
  }
  
  public static double getAverage(Predicate<Person> predicate, List<Person> list) {
    
    int total = 0;
    int count = 0;
    for(Person person : list) {
      if(predicate.test(person)) {
        total += person.getAge();
        count++;
      }
    }
    
    return (double)total / count;
    
  }
  
  public static void ex03() {
    
    List<Person> list = Arrays.asList(
        new Person("길동", 50),
        new Person("영철", 30),
        new Person("재동", 15),
        new Person("미희", 16)
    );
    
    double youngAge = getAverage((p) -> p.getAge() < 20, list);
    double oldAge = getAverage((p) -> p.getAge() >= 20, list);
    
    System.out.println(youngAge);
    System.out.println(oldAge);
    
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02((number) -> number % 2 == 1, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    ex03();
  }

}