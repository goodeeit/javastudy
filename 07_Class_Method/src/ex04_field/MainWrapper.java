package ex04_field;

public class MainWrapper {

  public static void main(String[] args) {
    
    // AccCalculator 객체의 선언 & 생성
    AccCalculator myAcc = new AccCalculator();
    
    // value 확인
    myAcc.showValue();
    
    // 사칙연산
    myAcc.addition(3);        // +3
    myAcc.substraction(2);    // -2
    myAcc.multiplication(3);  // *3
    myAcc.division(2);        // /2
    
    // value 확인
    myAcc.showValue();

  }

}
