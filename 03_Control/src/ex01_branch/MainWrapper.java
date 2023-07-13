package ex01_branch;

public class MainWrapper {

  /*
   * if문
   * 1. 조건을 만족하는 경우에만 실행할 수 있다.
   * 2. 형식
   *    if(조건식){
   *      실행문
   *    }    
   */
  
  public static void ex01() {
    
    int score = 100;
    
    if(score >= 60) {
      System.out.println("합격");
    }
    
    // 중괄호는 실행문이 하나인 경우에 생략할 수 있다.
    if(score < 60) 
      System.out.println("불합격");
    
  }
  
  /*
   * else if문
   * 1. if문 이후에 조건식이 필요한 경우 사용할 수 있다.
   * 2. 원하는만큼 반복해서 사용할 수 있다.
   * 3. 형식
   *    if(조건식){
   *      실행문
   *    }
   *    else if(조건식){
   *      실행문
   *    }
   *    else if(조건식){
   *      실행문
   *    }
   */
  public static void ex02() {
    
    int score = 100;
    
    if(score < 0 || score > 100) {
      System.out.println("잘못된 점수");
    } else if(score >= 60) {
      System.out.println("합격");
    } else if(score < 60) {
      System.out.println("불합격");
    }
    
  }
  
  /*
   * else문
   * 1. if문의 마지막에 추가할 수 있다.
   * 2. 조건식을 작성하지 않는다.
   * 3. 형식
   *    if(조건식){
   *      실행문
   *    } else if(조건식){
   *      실행문
   *    } else {
   *      실행문
   *    }
   */
  public static void ex03() {
    
    int score = 100;
    
    if(score < 0 || score > 100) {
      System.out.println("잘못된 점수");
    } else if(score >= 60) {
      System.out.println("합격");
    } else {
      System.out.println("불합격");
    }
    
  }
  
  /*
   * switch문
   * 1. 지정된 표현식의 결과에 따라 분기 처리한다.(true/false에 의한 분기 처리가 아니다.)
   * 2. 일반적으로 if문에 비해서 가독성이 좋다.
   * 3. 각 분기를 구분하는 case와 default로 구성된다.
   * 4. break를 통해서 switch문을 종료시킬 수 있다.
   * 5. 형식
   *    switch(표현식){  // 표현식의 결과는 String, char, int가 가능하다.(boolean, double, long 불가)
   *    case 결과1:
   *      실행문
   *      break
   *    case 결과2:
   *      실행문
   *      break
   *    default:  // else
   *      실행문
   *    }
   */
  public static void ex04() {
    
    int button = 1;
    
    switch(button) {
    case 1:
      System.out.println("목록보기");
      break;
    case 2:
      System.out.println("상세보기");
      break;
    case 3:
      System.out.println("삽입하기");
      break;
    case 4:
      System.out.println("수정하기");
      break;
    case 5:
      System.out.println("삭제하기");
      break;
    default:
      System.out.println("잘못된 선택");
    }
    
  }
  
  public static void main(String[] args) {
    // ex01();
    // ex02();
    // ex03();
    ex04();
  }

}
