package ex01_one_dim;

public class MainWrapper {
    
  /*
   * 배열
   * 1. 여러 변수를 하나의 이름으로 관리하는 자료 구조이다.
   * 2. 배열에 저장된 모든 변수가 이름은 같지만, 인덱스가 다르다.
   * 3. 인덱스란 배열의 모든 변수를 구분하기 위한 위치 정보이다. 0부터 1씩 증가하는 값을 가진다.
   * 4. 기본 용어
   *    1) 배열명   : 모든 변수의 대표 이름
   *    2) 인덱스   : 첨자, 모든 변수를 구분하는 숫자
   *    3) 배열요소 : 배열에 속한 각 변수를 의미
   */
  
  /*
   * 배열의 선언 & 생성
   * 1. 배열 선언
   *    1) int[] 배열명  -- 추천
   *    2) int 배열명[]
   * 2. 배열 생성
   *    배열명 = new int[생성할 변수의 갯수]
   */
  
  /*
   * 배열요소
   * 1. 배열에 저장된 각 변수를 의미한다.
   * 2. 일반 변수와 다르게 자동으로 초기화된다.
   *    0, 0.0, false, null 값으로 초기화된다.
   * 3. 배열요소 호출방법
   *    배열명[인덱스]
   */
  public static void ex01() {
    
    // 배열의 선언
    int[] a;
    
    // 배열의 생성
    a = new int[5];
    
    // 배열요소 확인
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    System.out.println(a[4]);
    System.out.println(a[5]);  // 인덱스의 범위를 벗어난 배열요소 : 예외발생
    
  }
  
  public static void ex02() {
    
    // 배열에 저장할 변수의 갯수를 앞으로 "배열의 길이"라고 표현한다.
    int length = 5;
    
    // 배열의 선언 & 생성
    int[] a = new int[length];
    
    // 배열요소를 하나씩 순차적으로 for문으로 접근해 보기
    for(int i = 0; i < length; i++) {
      System.out.println(a[i]);  // a[0], a[1], a[2], a[3], a[4]를 순서대로 호출
    }
    
  }
  
  public static void ex03() {
    
    // 배열의 선언 & 생성
    int[] a = new int[5];
    
    // 배열의 순회
    // 배열의 길이는 "배열명.length"로 알아낼 수 있다.
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    
  }
  
  public static void main(String[] args) {
    ex02();
  }

}
