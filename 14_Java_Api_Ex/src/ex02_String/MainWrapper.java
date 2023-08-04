package ex02_String;

import java.time.LocalDate;
import java.util.Scanner;

public class MainWrapper {

  // 문제1. 다음 주소를 아래와 같이 분석하여 분리하시오.
  // String url = "https://comic.naver.com/webtoon/detail?titleId=758037&no=112&weekday=mon";
  // String requestURI = "https://comic.naver.com/webtoon/detail";  // 물음표(?) 이전 문자열만 추출
  // String param = "titleId=758037&no=112&weekday=mon";            // 물음표(?) 이후 문자열만 추출
  public static void ex01() {
    String url = "https://comic.naver.com/webtoon/detail?titleId=758037&no=112&weekday=mon";
    int question = url.indexOf("?");
    String requestURI = url.substring(0, question);  // 0 <=  < question
    String param = url.substring(question + 1);
    System.out.println(requestURI);
    System.out.println(param);
  }

  // 문제2. 다음 파일명을 분석하여 파일명과 확장자를 분리하시오.
  // String fullName = "a.p.p.l.e.jpg";
  // String fileName = "apple";
  // String extName = "jpg";
  public static void ex02() {
    String fullName = "a.p.p.l.e.jpg";
    int dot = fullName.lastIndexOf(".");
    String fileName = fullName.substring(0, dot);  // 0 <=  < dot
    String extName = fullName.substring(dot + 1);
    System.out.println(fileName);
    System.out.println(extName);
  }

  // 문제3. 다음 기준에 따라서 파일명을 변환하시오.
  // 사용자로부터 공백이 포함되어 있지 않은 파일명을 입력 받은 뒤 파일명을 다음과 같이 수정하시오.
  // 파일명 마지막에 밑줄(_)과 타임스탬프 값을 붙이시오.
  // 실행예시)
  // 변환 전 파일명 >>> happy.jpg
  // 변환 후 파일명 = happy_1658792128410.jpg
  public static void ex03() {
    String beforeName = "";  // 변환 전 파일명
    String afterName = "";   // 변환 후 파일명
    Scanner sc = new Scanner(System.in);
    System.out.println("변환 전 파일명 >>> ");
    beforeName = sc.next();
    int dot = beforeName.lastIndexOf(".");
    StringBuilder sb = new StringBuilder();
    sb.append(beforeName.substring(0, dot));
    sb.append("_");
    sb.append(System.currentTimeMillis());
    sb.append(beforeName.substring(dot));
    afterName = sb.toString();
    System.out.println("변환 후 파일명 = " + afterName);
    sc.close();
  }
  
  // 문제4. 주어진 주민등록번호(personalId)를 분석하여 나이와 성별을 출력하시오.
  // 나이 : 현재년도 - 태어난년도 (생일이 지났는지 여부는 따지지 않습니다.)
  // 성별 : 하이픈(-) 뒤의 글자가 1,3이면 "남자", 2,4이면 "여자"
  // 실행예시)
  // 9살 남자입니다.
  public static void ex04() {
    String personalId = "141212-3345678";
    LocalDate localDate = LocalDate.now();
    int year = localDate.getYear();
    int genderNo = Integer.parseInt(personalId.substring(7, 8));
    int birth = 0;
    switch(genderNo) {
    case 1: case 2:
      birth = 1900 + Integer.parseInt(personalId.substring(0, 2));
      break;
    case 3: case 4:
      birth = 2000 + Integer.parseInt(personalId.substring(0, 2));
      break;
    }
    int age = year - birth;
    String[] gender = {"여자", "남자"};
    System.out.println(age + "살 " + gender[genderNo % 2] + "입니다.");
  }
  
  // 문제5. 사용자로부터 입력 받은 문자열을 거꾸로 읽어도 원래 문자열과 동일한지 여부를 파악하는 프로그램을 구현하시오.
  // 실행예시1)
  //   문자열 입력 >>> 메롱
  //   메롱 : 거꾸로 읽으면 메롱과 다릅니다.
  // 실행예시2)
  //   문자열 입력 >>> 역삼역
  //   역삼역 : 거꾸로 읽어도 역삼역입니다.
  public static void ex05() {
    //
    // n  o  o  n
    // 앞 (i=0~1)   뒤 (3 - i == s.length() - 1 - i)   
    // s.charAt(0)  s.charAt(3)
    // s.charAt(1)  s.charAt(2)
    // 
    // l  e  v  e  l
    // 앞 (i=0~1)   뒤 (4 - i == s.length() - 1 - i)
    // s.charAt(0)  s.charAt(4)
    // s.charAt(1)  s.charAt(3)
    // 
    Scanner sc = new Scanner(System.in);
    System.out.println("문자열 입력 >>> ");
    String str = sc.next();
    int length = str.length();
    boolean isPalindrome = true;
    for(int i = 0; i < length / 2; i++) {
      if(str.charAt(i) != str.charAt(length - 1 - i)) {
        isPalindrome = false;
        break;
      }
    }
    if(isPalindrome) {
      System.out.println(str + " : 거꾸로 읽어도 " + str + "입니다.");
    } else {
      System.out.println(str + " : 거꾸로 읽으면 " + str + "과 다릅니다.");
    }
    sc.close();
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
    ex05();
  }

}
