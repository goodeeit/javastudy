package ex03_class;

/**
 * 
 * 실수의 덧셈, 뺄셈, 곱셈, 나눗셈 기능을 제공하는 계산기 클래스
 * 
 * @author 홍길동
 * @since 2023.07.19
 * @version 1.0.0
 *
 */
public class Calculator {
  
  /**
   * 
   * 실수 2개를 전달 받아서 덧셈 결과를 반환하는 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개의 덧셈 결과
   * 
   */
  public double addition(double a, double b) {
    return a + b;
  }
  
  /**
   * 
   * 실수 2개를 전달 받아서 뺄셈 결과를 반환하는 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개의 뺄셈 결과
   */
  public double subtraction(double a, double b) {
    return a - b;
  }
  
  /**
   * 
   * 실수 2개를 전달 받아서 곱셈 결과를 반환하는 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개의 곱셈 결과
   */
  public double multiplication(double a, double b) {
    return a * b;
  }
  
  /**
   * 
   * 실수 2개를 전달 받아서 나눗셈 결과를 반환하는 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터 2개의 나눗셈 결과
   */
  public double division(double a, double b) {
    return a / b;
  }
  
}
