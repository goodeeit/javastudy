package ex01_parameter;

public class MainWrapper3 {

  /*
   * 말 줄임표(ellipsis)
   * 1. 메소드로 전달하는 인수의 타입이 동일하지만, 갯수가 여러 개인 경우에 사용할 수 있다.
   * 2. 말 줄임표(...)를 활용한다.
   * 3. 말 줄임표로 선언된 변수는 배열로 처리한다.
   */
  
  public static void main(String[] args) {
    print(10);          // 인수가 정수 1개이다.
    print(10, 20);      // 인수가 정수 2개이다.
    print(10, 20, 30);  // 인수가 정수 3개이다.
  }
  
  public static void print(int... a) {  // 말 줄임표로 선언된 파라미터는 사실 배열이다.
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

}