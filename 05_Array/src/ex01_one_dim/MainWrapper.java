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
  
  /*
   * 배열의 초기화
   * 1. 배열을 생성하면 자동으로 초기화된다.(0, 0.0, false, null)
   * 2. 중괄호({})를 이용해서 초기화 하고자 하는 값을 지정할 수 있다.
   * 3. 배열의 초기화는 배열을 선언할 때만 사용할 수 있다.
   * 4. 형식
   *    int[] a = {10, 20, 30};
   */
  public static void ex04() {
    
    // 배열의 초기화
    int[] a = {10, 20, 30};
    
    // 배열의 순회
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    
  }
  
  public static void ex05() {
    
    int day = 14;
    int nDay = 10;
    day += nDay;  // 14일로부터 10일 후
    
    String[] weeknames = {"금", "토", "일", "월", "화", "수", "목"};
    System.out.println(day + "일은 " + weeknames[day % 7] + "요일입니다.");
    
  }
  
  /*
   * 배열의 구조
   * 1. 배열의 타입은 참조 타입(reference type)이다.
   * 2. 배열의 모든 요소는 순서대로 메모리의 연속된 공간을 할당받는다.
   * 
   *    int[] a = {10, 20, 30};
   * 
   *    ┌--------------┐
   *   a│  0x10000000  │
   *    │--------------│
   *    │     ...      │
   *    │--------------│
   *    │      10      │0x10000000
   *    │--------------│
   *    │      20      │0x10000004
   *    │--------------│
   *    │      30      │0x10000008
   *    └--------------┘
   */
  public static void ex06() {
    
    // 배열의 선언 & 생성
    int[] a = new int[5];
    
    // 배열명 확인
    System.out.println(a);  // 배열의 참조 값(주소 값) 확인
    
  }
  
  public static void ex07() {
    
    // 배열의 초기화
    int[] a = {10, 20, 30};
    
    // 배열의 선언
    int[] b;
    
    // 배열 a의 참조 값을 배열 b로 전달하면, 배열 a와 b는 동일한 메모리 공간을 참조할 수 있다.
    b = a;
    
    // 배열 순회
    for(int i = 0; i < b.length; i++) {
      System.out.println(b[i]);  // 10 20 30
    }
    
    /*
     *    ┌--------------┐
     *   a│  0x10000000  │---------------
     *    │--------------│              │
     *    │     ...      │              │
     *    │--------------│              │
     *    │      10      │0x10000000    │
     *    │--------------│              │
     *    │      20      │0x10000004    │ b = a;
     *    │--------------│              │
     *    │      30      │0x10000008    │
     *    │--------------│              │
     *    │     ...      │              │
     *    │--------------│              │
     *   b│  0x10000000  │◀-------------
     *    └--------------┘              
     */
    
  }
  
  
  public static void main(String[] args) {
    ex07();
  }

}
