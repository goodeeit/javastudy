package ex07_Object;

/*
 * Object 클래스
 * 1. 모든 클래스의 최상위 슈퍼 클래스이다.
 * 2. 별도의 슈퍼 클래스를 명시하지 않은 클래스들은(extends가 없는 클래스) 모두 Object 클래스의 서브 클래스이다.
 * 3. 모든 것을 저장할 수 있는 Java의 만능 타입이다.
 * 4. Object 타입으로 저장하면 Object 클래스의 메소드만 호출할 수 있다. 이를 해결하기 위해서 "반드시" 캐스팅을 해야 한다.
 */

public class Person {

  private String name;
  private int age;
  
  // new Person()
  public Person() {
    
  }
  // new Person("홍길동", 20)
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  
}
