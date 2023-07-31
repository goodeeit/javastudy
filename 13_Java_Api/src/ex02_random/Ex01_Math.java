package ex02_random;

public class Ex01_Math {

  public static void ex01() {
    
    // java.lang.Math 클래스의 random 메소드
    // 1. 0 이상 1 미만의 난수를 반환
    // 2. 클래스 메소드이므로 Math 클래스를 이용해서 호출함
    
    double randomNumber = Math.random();  // 0.0 <= 난수 < 1.0
    
    // 확률 처리하기
    if(randomNumber < 0.1) {
      System.out.println("대박");
    } else {
      System.out.println("꽝");
    }
    
  }
  
  public static void ex02() {
    
    /*
     * 정수 난수로 바꿔서 사용하기
     * 
     * 1단계 : Math.random()                 0.0 <= n < 1.0
     * 2단계 : Math.random() * 3             0.0 <= n < 3.0
     * 3단계 : (int)(Math.random() * 3)        0 <= n < 3
     * 4단계 : (int)(Math.random() * 3) + 1    1 <= n < 4
     * ----------------------------------------------------- 
     *         (int)(Math.random() * 개수) + 시작값
     *         (int)(Math.random() * 개수 + 시작값)
     */
    
    int randomNumber = (int)(Math.random() * 3) + 1;  // 1부터 3개의 난수 발생
    System.out.println(randomNumber);
    
  }
  
  public static void main(String[] args) {
    ex02();
  }

}
