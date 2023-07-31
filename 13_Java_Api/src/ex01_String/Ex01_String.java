package ex01_String;

public class Ex01_String {

  public static void ex01() {
    
    // 문자열 리터럴(Literal)
    // 문자열 표현 방법 : 큰 따옴표로 문자열을 묶는다.
    String name1 = "tom";
    String name2 = "tom";
    
    // 문자열 리터럴은 Java에 의해서 최적화되기 때문에
    // 동일한 리터럴이 2번 이상 나타나면 기존 리터럴을 재사용한다.
    //
    //       ┌--------------┐
    //  name1│  0x12345678  │
    //       │--------------│
    //  name2│  0x12345678  │
    //       │--------------│
    //       │      ...     │
    //       │--------------│
    //       │      tom     │0x12345678
    //       │--------------│
    //       │      ...     │
    //       └--------------┘
    
    // 문자열 리터럴 비교
    // name1과 name2의 참조값이 동일하다.
    boolean isEqual = name1 == name2;
    System.out.println(isEqual);
    
  }
  
  public static void ex02() {
    
    // 문자열 객체(Object)
    String name1 = new String("tom");
    String name2 = new String("tom");
    
    // 문자열 객체는 항상 새로 생성된다.
    //
    //       ┌--------------┐
    //  name1│  0x12345678  │
    //       │--------------│
    //  name2│  0x98765432  │
    //       │--------------│
    //       │      ...     │
    //       │--------------│
    //       │      tom     │0x12345678
    //       │--------------│
    //       │      ...     │
    //       │--------------│
    //       │      tom     │0x98765432
    //       │--------------│
    //       │      ...     │
    //       └--------------┘
    
    // 문자열 객체 비교
    // name1과 name2의 참조값이 다르다.
    boolean isEqual = name1 == name2;
    System.out.println(isEqual);
    
  }
  
  public static void ex03() {
    
    // equals 메소드
    // 문자열이 동일하면 true, 아니면 false 반환
    
    String name1 = new String("tom");
    String name2 = new String("tom");
    String name3 = new String("Tom");
    
    boolean isEqual1 = name1.equals(name2);
    System.out.println(isEqual1);
    
    boolean isEqual2 = name1.equals(name3);  // 대소문자도 일치해야 동일한 문자열로 인식한다.
    System.out.println(isEqual2);
    
    boolean isEqual3 = name1.equalsIgnoreCase(name3);  // 대소문자를 무시하고 문자열을 비교한다.
    System.out.println(isEqual3);
    
  }
  
  public static void main(String[] args) {
    ex03();
  }

}
