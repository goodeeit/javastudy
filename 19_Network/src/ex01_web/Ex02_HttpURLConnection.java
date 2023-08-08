package ex01_web;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex02_HttpURLConnection {

  public static void main(String[] args) {

    // 접속할 주소
    String spec = "https://ssl.pstatic.net/melona/libs/1456/1456783/f24d4712cb2688092681_20230803123239648.jpg";
    
    // URL 객체 선언
    URL url = null;
    
    // HttpURLConnection 객체 선언
    HttpURLConnection con = null;
    
    try {
      
      // URL 객체 생성 (MalformedURLException 발생)
      url = new URL(spec);
      
      // HttpURLConnection 객체 생성 (IOException 발생)
      con = (HttpURLConnection)url.openConnection();
      
      /*
       * HTTP 응답코드
       * 1. 200 : 정상
       * 2. 4XX : 잘못된 요청 (클라이언트의 잘못된 요청)
       * 3. 5XX : 서버 오류 (잘못된 개발)
       */
      // 접속 여부 확인
      int responseCode = con.getResponseCode();
      System.out.println("접속여부: " + (responseCode == HttpURLConnection.HTTP_OK));
      
      // 요청 헤더(User-Agent) : 무엇으로 접속했는가?
      String userAgent = con.getRequestProperty("User-Agent");
      System.out.println("User-Agent: " + userAgent);
      
      // 요청 헤더(Referer) : 이전 주소가 무엇인가?
      String referer = con.getRequestProperty("Referer");
      System.out.println("Referer: " + referer);
      
      // 컨텐트 타입 : 어떤 타입인가?
      String contentType = con.getContentType();
      System.out.println("Content-Type: " + contentType);

      // 컨텐트 크기 : 크기가 얼마인가?
      int contentLength = con.getContentLength();
      System.out.println("Content-Length: " + contentLength);
      
      /*
       * 요청 메소드
       * 1. GET  : 주소(URL)를 이용한 데이터 전송
       * 2. POST : 본문(Body)을 이용한 데이터 전송
       */
      // 요청 메소드 : 어떤 방식으로 요청했는가?
      String requestMethod = con.getRequestMethod();
      System.out.println("RequestMethod: " + requestMethod);
      
      // 접속 해제
      con.disconnect();
      
    } catch (MalformedURLException e) {
      System.out.println("접속 주소 오류");
    } catch (IOException e) {
      System.out.println("접속 오류");
    }

  }

}
