package ex02_random;

import java.security.SecureRandom;

public class Ex03_SecureRandom {

  public static void main(String[] args) {
    
    // java.security.SecureRandom 클래스
    // 1. 보안 처리된 난수를 발생한다.
    // 2. Random 클래스와 같은 사용법을 가진다.
    
    // SecureRandom 객체 선언 & 생성
    SecureRandom secureRandom = new SecureRandom();
    
    // 실수
    double randomNumber1 = secureRandom.nextDouble();
    
    // 정수
    int randomNumber2 = secureRandom.nextInt();
    int randomNumber3 = secureRandom.nextInt(5);
    
    System.out.println(randomNumber1);
    System.out.println(randomNumber2);
    System.out.println(randomNumber3);    

  }

}
