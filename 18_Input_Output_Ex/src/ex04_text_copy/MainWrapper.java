package ex04_text_copy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainWrapper {

  public static void ex01() {
    
    // 문제1. 다음과 같이 알파벳 대문자가 입력된 C:/storage/alphabet.txt 파일을 만드시오.
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    
    // File 객체
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, "alphabet.txt");
    
    // 버퍼출력스트림 생성(close가 필요 없는 try-catch-resources문)
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
      
      // 알파벳 순차적으로 하나씩 저장
      for(char ch = 'A'; ch <= 'Z'; ch++) {
        writer.write(ch);
      }
      
      // 버퍼출력스트림에 (혹시) 남아 있는 모든 데이터를 보내기
      writer.flush();
      
      // 결과 메시지
      System.out.println(file.getPath() + " 파일 생성 완료");
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void ex02() {
    
    // 문제2. C:/storage/alphabet.txt 파일을 복사하여 C:/storage/alphabet2.txt 파일을 만드시오.
    
    
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
  }

}
