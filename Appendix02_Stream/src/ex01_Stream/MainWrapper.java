package ex01_Stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MainWrapper {

  /* 스트림 생성 & forEach() */
  public static void ex01() {
    
    /*
     * forEach() 메소드
     * 1. Stream 파이프라인의 마지막에 사용할 수 있는 메소드 중 하나이다.
     * 2. Stream 파이프라인의 각 요소를 순회할 때 사용한다.
     * 3. for문처럼 동작한다.
     * 4. 형식
     *    void forEach(Consumer<T> consumer);
     */
    
    // Stream 생성
    Stream<String> stream = Stream.of("봄", "여름", "가을", "겨울");
    
    // Consumer 생성 (Anonymous inner Type 생성)
    Consumer<String> consumer = new Consumer<String>() {
      @Override
      public void accept(String t) {
        System.out.println(t);        
      }
    };
    
    // forEach() 메소드 호출
    stream.forEach(consumer);
    
  }
  
  public static void ex02() {
    
    // Stream 생성
    Stream<String> stream = Stream.of("봄", "여름", "가을", "겨울");
    
    // Consumer 생성 (람다 표현식 생성)
    Consumer<String> consumer = (t) -> System.out.println(t);
    
    // forEach() 메소드 호출
    stream.forEach(consumer);
    
  }
  
  public static void ex03() {
    
    // Stream 생성
    Stream<String> stream = Stream.of("봄", "여름", "가을", "겨울");
    
    // forEach() 메소드 호출
    stream.forEach((t) -> System.out.println(t));
    
  }
  
  /* 각종 스트림 생성 방법 */
  public static void ex04() {
    
    // 1. Integer 전용 Stream
//  IntStream iStream = IntStream.of(1,2,3,4,5);      // 1,2,3,4,5
//  IntStream iStream = IntStream.range(1, 6);        // 1이상 6미만 (1,2,3,4,5)
//  IntStream iStream = IntStream.rangeClosed(1, 5);  // 1이상 5이하 (1,2,3,4,5)
    
    IntStream iStream = IntStream.of(1,2,3,4,5);      // 1,2,3,4,5
    iStream.forEach((number) -> System.out.println(number));
    
    // 2. Long 전용 Stream (range, rangeClosed 가능)
    LongStream lStream = LongStream.of(1,2,3,4,5);
    lStream.forEach((number) -> System.out.println(number));
    
    // 3. Double 전용 Stream (range, rangeClosed 불가능)
    DoubleStream dStream = DoubleStream.of(1.1, 2.2);
    dStream.forEach((number) -> System.out.println(number));
    
  }
  
  public static void ex05() {
    
    // 배열 -> Stream
    
    // 1. 일반 Stream
    String[] season = {"봄", "여름", "가을", "겨울"};
    Stream<String> stream = Arrays.stream(season);
    stream.forEach((t) -> System.out.println(t));
    
    // 2. IntStream
    int[] iNumber = {1,2,3,4,5};
    IntStream iStream = Arrays.stream(iNumber);
    iStream.forEach((number) -> System.out.println(number));
    
    // 3. DoubleStream
    double[] dNumber = {1.1, 2.2};
    DoubleStream dStream = Arrays.stream(dNumber);
    dStream.forEach((number) -> System.out.println(number));  
    
  }
  
  
  
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
    ex05();
  }

}
