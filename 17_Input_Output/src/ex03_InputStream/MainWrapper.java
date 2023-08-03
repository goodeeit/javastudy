package ex03_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainWrapper {

  /*
   * java.io.InputStream 클래스
   * 1. 바이트 기반의 입력스트림이다.
   * 2. 입력 단위
   *    1) int
   *    2) byte[]
   */
  
  public static void ex01() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex01.dat");
    
    // 파일입력스트림 선언
    FileInputStream fin = null;
    
    try {
      
      // 파일입력스트림 생성 (반드시 예외 처리 필요, 파일이 없으면 예외 발생)
      fin = new FileInputStream(file);
      
      // 입력된 데이터 저장 변수
      int c = 0;
      
      // read() 메소드
      // 1. 1개 데이터를 읽어서 반환한다.
      // 2. 읽은 내용이 없으면 -1을 반환한다.
      
      // 1개씩 읽은 데이터를 누적할 StringBuilder 생성
      StringBuilder sb = new StringBuilder();
      
      // 반복문 : 읽은 내용이 -1이 아니면 계속 읽는다.
      while( (c = fin.read()) != -1 ) {
        sb.append((char)c);
      }
      
      // 결과 확인
      System.out.println(sb.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fin != null) {
          fin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  
  public static void main(String[] args) {
    ex01();
  }

}
