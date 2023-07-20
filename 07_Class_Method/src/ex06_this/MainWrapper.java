package ex06_this;

public class MainWrapper {

  public static void main(String[] args) {
    
    // ChainCalculator 객체 선언 & 생성
    ChainCalculator myCalc = new ChainCalculator();
    
    // 객체 자체는 참조값이다.
    System.out.println(myCalc);
    
    // myCalc 객체가 호출한 printThis 메소드이기 때문에,
    // 여기서 확인된 this값은 myCalc 객체의 참조값과 같다.
    myCalc.printThis();

  }

}
