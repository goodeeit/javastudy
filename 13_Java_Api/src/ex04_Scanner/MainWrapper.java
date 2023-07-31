package ex04_Scanner;

import java.util.Scanner;

public class MainWrapper {

  public static void main(String[] args) {
    
    /*
     * java.util.Scanner 클래스
     * 1. 어떤 정보를 읽어 들일 때 사용한다.
     * 2. 파일, 사용자 입력 정보 등을 읽어 들일 수 있다. (사용자 입력에 초점을 맞춘다.)
     * 3. 사용자가 입력하는 데이터의 타입에 따라서 입력 메소드가 구분되어 있다.
     *    1) int    : nextInt();
     *    2) long   : nextLong();
     *    3) double : nextDouble();
     *    4) String
     *      (1) 공백 없는 문자열 : next()
     *      (2) 공백 있는 문자열 : nextLine()
     * 4. 사용자 입력을 위해서 사용해야 하는 입력 스트림(InputStream)은 System.in이다.
     */

    
    // Scanner 객체 선언 & 생성
    Scanner sc = new Scanner(System.in);
    
    // String 입력
    System.out.println("이름을 입력하세요");
    String name = sc.next();  // 이름에 공백이 없어야 한다.
    System.out.println("입력된 이름: " + name);
    
    // int 입력
    System.out.println("나이를 입력하세요");
    int age = sc.nextInt();
    System.out.println("입력된 나이: " + age);
    
    // double 입력
    System.out.println("키를 입력하세요");
    double height = sc.nextDouble();
    System.out.println("입력된 키: " + height);
    
    // 사용한 입력 스트림 종료(생략 가능하다.)
    sc.close();
    
  }

}
