package ex02_return;

import java.util.Arrays;

public class MainWrapper1 {

  /*
   * 반환(return)
   * 1. 메소드의 실행 결과 값을 의미한다.
   * 2. 반환값이 없는 경우에는 void 키워드를 작성하고, 반환값이 있는 경우에는 반환값의 타입을 작성한다.
   */
  
  public static void main(String[] args) {
    System.out.println(getName());
    System.out.println(getAge());
    System.out.println(isAlive());
    System.out.println(Arrays.toString(getHobbies()));
  }
  
  public static String[] getHobbies() {
    String[] hobbies = {"여행", "수영", "영화"};
    return hobbies;
  }
  
  public static boolean isAlive() {
    boolean isAlive = getAge() <= 100;
    return isAlive;
  }
  
  public static int getAge() {
    int age = 500;
    return age;
  }
  
  public static String getName() {
    String name = "홍길동";
    return name;  // 메소드를 호출한 곳으로 반환한다.
  }

}
