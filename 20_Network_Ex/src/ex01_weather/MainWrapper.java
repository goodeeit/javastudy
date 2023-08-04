package ex01_weather;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainWrapper {

  public static void main(String[] args) {
    
    // C:/storage/sfc_web_map.xml 파일로 저장하기

    // 1시간마다 갱신되는 전국 날씨 정보 URL
    String spec = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";

    // URL 객체 선언
    URL url = null;
    
    // HttpURLConnection 객체 선언
    HttpURLConnection con = null;
    
    // 입력스트림 선언 (전국 날씨 정보를 읽는 스트림)
    BufferedReader br = null;
    
    // 출력스트림 선언 (C:/storage/sfc_web_map.xml 파일을 만드는 스트림)
    BufferedWriter bw = null;
    
    try {
      
      // URL 객체 생성
      url = new URL(spec);
      
      // HttpURLConnection 객체 생성
      con = (HttpURLConnection) url.openConnection();
      
      // 입력스트림 생성 (전국 날씨 정보를 읽는 스트림)
      br = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      // 출력스트림 생성 (C:/storage/sfc_web_map.xml 파일을 만드는 스트림)
      bw = new BufferedWriter(new FileWriter("C:/storage/sfc_web_map.xml"));
      
      // 입력된 문자열을 저장할 변수
      String line = null;      
      
      // 반복문 : 읽은 내용이 null이 아니면 계속 읽어서 파일로 보낸다.
      while((line = br.readLine()) != null) {
        bw.write(line);
        bw.newLine();
      }
      
      // 메시지
      System.out.println("파일 생성 완료");
      
    } catch(MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(bw != null) bw.close();
        if(br != null) br.close();
        if(con != null) con.disconnect();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
    
  }
  
}
