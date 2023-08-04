package ex05_Reader;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    /*
     * java.io.BufferedReader 클래스
     * 1. 내부 버퍼를 가지고 있는 입력스트림이다.
     * 2. 많은 데이터를 한 번에 입력받기 때문에 속도 향상을 위해서 사용한다.
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex03.txt");
    
    // 버퍼입력스트림 선언
    BufferedReader br = null;
    
    try {
      
      // 버퍼입력스트림 생성(반드시 예외 처리 필요, 파일이 없으면 FileNotFoundException 발생)
      br = new BufferedReader(new FileReader(file));
      
      // 입력된 문자열 저장 변수
      String line = null;
      
      // 입력된 문자를 누적할 StringBuffer 생성
      StringBuffer sb = new StringBuffer();
      
      // String readLine() 메소드
      // 1. 한 줄 전체를 반환한다.
      // 2. 읽은 문자가 없으면 null을 반환한다. 
      
      // 반복문 : readLine()의 반환값이 null이 아니면 계속 읽는다.
      while((line = br.readLine()) != null) {
        sb.append(line + "\n");  // 읽은 라인에 줄 바꿈(\n)은 포함되어 있지 않다.
      }
      
      // 결과 확인
      System.out.println(sb.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(br != null) {
          br.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex04() {
    
    // 바이트 출력스트림으로 보낸 문자를 바이트 입력스트림으로 읽기(한글 실패)
    // 바이트 출력스트림으로 보낸 문자를 문자 입력스트림으로 읽기(한글 성공)
    
    // 1단계. 바이트 출력스트림으로 문자 보내기
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, "server.dat");
    BufferedOutputStream bout = null;
    try {
      bout = new BufferedOutputStream(new FileOutputStream(file));
      String s1 = "안녕하세요";
      String s2 = "Hello";
      bout.write(s1.getBytes("UTF-8"));
      bout.write(s2.getBytes("UTF-8"));
      bout.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    // 2단계. 문자 입력스트림으로 읽기
    /*
     * java.io.InputStreamReader 클래스
     * 1. Reader 클래스를 상속 받는 클래스이다. (문자 입력스트림이다.)
     * 2. InputStream(바이트 입력스트림)을 받아서 Reader(문자 입력스트림)으로 변환한다.
     */
    BufferedReader br = null;
    try {
      br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
      String line = null;
      StringBuffer sb = new StringBuffer();
      while((line = br.readLine()) != null) {
        sb.append(line + "\n");
      }
      System.out.println(sb.toString());
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    ex04();
  }
  
}
