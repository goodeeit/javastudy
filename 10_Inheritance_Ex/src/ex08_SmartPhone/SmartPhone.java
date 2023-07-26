package ex08_SmartPhone;

// 인터페이스는 다중 구현이 가능하다.
// 클래스 상속과 인터페이스 구현을 동시에 할 수 있다.(상속 먼저, 구현 나중)

public class SmartPhone extends Camera implements Phone, Computer {

  @Override
  public void game() {
    System.out.println("게임");
  }

  @Override
  public void internet() {
    System.out.println("인터넷");
  }

  @Override
  public void call() {
    System.out.println("전화");
  }

  @Override
  public void sms() {
    System.out.println("문자");
  }

}
