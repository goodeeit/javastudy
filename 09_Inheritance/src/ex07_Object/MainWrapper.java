package ex07_Object;

public class MainWrapper {

  public static void ex01() {
    
    // Object 타입으로 모든 객체를 저장할 수 있다.
    // Object 타입으로 저장한 객체를 사용할 때는 캐스팅 해야 한다.

    Object obj = new Person();
    ((Person)obj).setName("홍길동");
    ((Person)obj).setAge(20);
    System.out.println(((Person)obj).getName());
    System.out.println(((Person)obj).getAge());
    
  }
  
  public static void ex02() {
    
    // 동일한 객체 2개
    Person p1 = new Person("홍길동", 20);
    Person p2 = new Person("홍길동", 20);
    
    // 동일한 객체인지 판단
    boolean same = p1.equals(p2);
    
    // 결과 확인
    System.out.println(same ? "동일한 객체" : "다른 객체");
    
  }
  
  public static void main(String[] args) {
    ex02();
  }

}
