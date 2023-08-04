package ex05_Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainWrapper {

  /*
   * java.io.Reader 클래스
   * 1. 문자 기반의 입력스트림이다.
   * 2. 입력 단위
   *    1) int
   *    2) char[]
   *    3) String
   */
  
  public static void ex01() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex01.txt");
    
    // 파일입력스트림 선언
    FileReader fr = null;
    
    try {
      
      // 파일입력스트림 생성(반드시 예외 처리 필요, 파일이 없으면 FileNotFoundException 발생)
      fr = new FileReader(file);
      
      // 입력된 문자 저장 변수
      int ch = 0;
      
      // 입력된 문자를 누적할 StringBuffer 생성
      StringBuffer sb = new StringBuffer();
      
      // read() 메소드
      // 1. 1개 문자를 읽어서 반환한다.
      // 2. 읽은 문자가 없으면 -1을 반환한다.
      
      // 반복문 : 읽은 문자가 -1이 아니면 계속 읽는다.
      while((ch = fr.read()) != -1) {
        sb.append((char)ch);
      }
      
      // 결과 확인
      System.out.println(sb.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fr != null) {
          fr.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex02() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex02.txt");
    
    // 파일입력스트림 선언
    FileReader fr = null;
    
    try {
      
      // 파일입력스트림 생성(반드시 예외 처리 필요, 파일이 없으면 FileNotFoundException 발생)
      fr = new FileReader(file);
      
      // 입력된 문자 저장 배열
      char[] cbuf = new char[2];
      
      // 실제로 읽은 글자 수 저장 변수
      int readChar = 0;
      
      // 입력된 문자를 누적할 StringBuffer 생성
      StringBuffer sb = new StringBuffer();
      
      // int read(char[] cbuf) 메소드
      // 1. 파라미터로 전달된 char[] cbuf에 읽은 문자를 저장한다.
      // 2. 실제로 읽은 글자 수를 반환한다.
      // 3. 읽은 문자가 없으면 -1을 반환한다. 
      
      // 반복문 : read()의 반환값이 -1이 아니면 계속 읽는다.
      while((readChar = fr.read(cbuf)) != -1) {
        sb.append(cbuf, 0, readChar);  // 배열 cbuf의 인덱스 0부터 readChar개 문자를 sb에 추가한다.
      }
      
      // 결과 확인
      System.out.println(sb.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fr != null) {
          fr.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex03() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex02.txt");
    
    // 파일입력스트림 선언
    FileReader fr = null;
    
    try {
      
      // 파일입력스트림 생성(반드시 예외 처리 필요, 파일이 없으면 FileNotFoundException 발생)
      fr = new FileReader(file);
      
      // 입력된 문자 저장 배열
      char[] cbuf = new char[2];
      
      // 실제로 읽은 글자 수 저장 변수
      int readChar = 0;
      
      // 입력된 문자를 누적할 StringBuffer 생성
      StringBuffer sb = new StringBuffer();
      
      // int read(char[] cbuf) 메소드
      // 1. 파라미터로 전달된 char[] cbuf에 읽은 문자를 저장한다.
      // 2. 실제로 읽은 글자 수를 반환한다.
      // 3. 읽은 문자가 없으면 -1을 반환한다. 
      
      // 반복문 : read()의 반환값이 -1이 아니면 계속 읽는다.
      while((readChar = fr.read(cbuf)) != -1) {
        sb.append(cbuf, 0, readChar);  // 배열 cbuf의 인덱스 0부터 readChar개 문자를 sb에 추가한다.
      }
      
      // 결과 확인
      System.out.println(sb.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fr != null) {
          fr.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void main(String[] args) {
    ex02();
  }
  
}
