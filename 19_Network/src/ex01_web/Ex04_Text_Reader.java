package ex01_web;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex04_Text_Reader {

  public static void main(String[] args) {
    
    // 웹 상의 텍스트 파일 읽기 (XML)
    // 구글 : "기상청 rss" 검색 - 동네예보>중기예보 - 전국 
    
    // 주소
    String spec = "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";
    
    // URL 객체 선언
    URL url = null;
    
    // HttpURLConnection 객체 선언
    HttpURLConnection con = null;
    
    // 입력스트림 선언 (전국 중기예보를 읽는 스트림)
    BufferedReader reader = null;
    
    // 출력스트림 선언 (C:/storage/weather.xml 파일을 만드는 스트림)
    BufferedWriter writer = null;
    
    try {
      
      // URL 객체 생성
      url = new URL(spec);
      
      // HttpURLConnection 객체 생성
      con = (HttpURLConnection) url.openConnection();
      
      // 입력스트림 생성 (버퍼끼우기 ← 문자스트림으로변경 ← 바이트입력스트림)
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      // 출력스트림 생성
      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, "weather.xml");
      writer = new BufferedWriter(new FileWriter(file));
      
      // 입력스트림으로부터 한 줄 읽기 → 읽은 한 줄 그대로 출력스트림으로 보내기
      String line = null;
      while((line = reader.readLine()) != null) {
        writer.write(line + "\n");
      }
      
      // 결과 메시지
      System.out.println(file.getPath() + " 파일 내려받기 성공");
      
    } catch (MalformedURLException e) {  // url 생성
      System.out.println(e.getMessage());
    } catch (IOException e) {  // con 생성, reader 생성, writer 생성 등 
      System.out.println(e.getMessage());
    } finally {
      try {
        if(writer != null) writer.close();
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }

}
