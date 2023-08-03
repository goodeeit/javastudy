package ex06_try_catch_resources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainWrapper {

  /*
   * try - catch - resources문
   * 1. 사용한 자원(대표적으로 입출력 스트림)을 자동으로 close 해 주는 try문이다.
   * 2. 형식
   *    try (입출력 스트림 생성) {
   *      코드
   *    } catch(Exception e) {
   *      e.printStackTrace();
   *    }
   */
  
  public static void main(String[] args) {
    
    // 디렉터리를 File 객체로 생성
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 생성
    File file = new File(dir, "ex01.txt");
    
    // try 블록에서 출력스트림 생성하기
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {  // 추가모드
      
      // 출력할 데이터
      String str1 = "안녕하세요";
      String str2 = "반갑습니다";
      
      // 출력 (추가모드이므로 기존 파일 뒤에 추가된다.)
      bw.newLine();
      bw.write(str1);
      bw.newLine();
      bw.write(str2);
      
      System.out.println(file.getPath() + " 파일에 데이터 추가 완료");
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
}
