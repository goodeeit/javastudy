package ex07_constructor;

/*
 * 생성자(constructor)
 * 1. 객체를 생성할 때 사용하는 메소드이다.
 * 2. new 키워드 이후에 호출된다.
 * 3. 특징
 *    1) 생성자도 메소드이다.
 *    2) 생성자의 이름은 클래스의 이름과 같다. 바꿀 수 없다.
 *    3) 반환(return)이 존재하지 않는다. 반환(return)이 없다는 의미의 void가 아니라 반환(return)이라는 개념 자체가 없다.
 *    4) 파라미터는 일반 메소드와 동일하게 사용할 수 있다. 메소드 오버로딩(overloading)이 가능하다.(생성자를 여러 개 만들 수 있다.)
 * 4. 생성자를 안 만들면 Java가 "디폴트 생성자"가 사용된다.
 */

/*
 * 디폴트 생성자(default constructor)
 * 1. 개발자가 생성자를 하나도 만들지 않는다면 Java가 자동으로 만드는 생성자이다.
 * 2. 파라미터가 없고, 본문이 비어 있다.
 * 3. 기본 필드값(0, 0.0, false, null)을 가진 객체를 생성할 때 사용한다.
 */


public class Computer {

  private String model;
  
  public Computer() {
    System.out.println("Computer() 생성자가 호출되었다.");
  }
  
  public Computer(String model) {
    System.out.println("Computer(String model) 생성자가 호출되었다.");
    this.model = model;
  }
  
  // Setter
  public void setModel(String model) {
    this.model = model;
  }
  
  // Getter
  public String getModel() {
    return model;
  }
  
}