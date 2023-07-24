package ex01_Car;

/*
 * HybridCar는 charge()와 addFuel()이 모두 가능하기 때문에,
 * Ev와 EngineCar를 모두 상속 받으면 좋지만
 * Java는 다중 상속을 지원하지 않는다.
 */

public class HybridCar extends EngineCar {

  public void charge() {
    System.out.println("충전");
  }
  
}
