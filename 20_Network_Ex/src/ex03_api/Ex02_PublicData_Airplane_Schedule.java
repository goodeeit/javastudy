package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ex02_PublicData_Airplane_Schedule {

  /*
   * 한국공항공사_항공기 운항정보 - 국제선 운항 스케쥴
   * 1. 요청주소 : http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList
   * 2. 요청변수(Request Parameter)
   *    1) serviceKey      : 필수, 인코딩된 인증키
   *    2) pageNo          : 필수, 1
   *    3) schDate         : 선택, 검색일자(20151005)
   *    4) schDeptCityCode : 선택, 출발도시코드(GMP)
   *    5) schArrvCityCode : 선택, 도착도시코드(HND)
   */
  public static void ex01() {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;  // 응답데이터를 읽는 입력스트림
    
    try {
      
      String spec = "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList";
      String serviceKey = "bEQBRPHjt0tZrc7EsL0T8usfsZ1+wT+5jqamBef/ErC/5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ==";
      String pageNo = "1";
      String schDate = new SimpleDateFormat("YYYYMMDD").format(new Date());
      String schDeptCityCode = "ICN";
      String schArrvCityCode = "JFK";
      
      StringBuilder sb = new StringBuilder();
      sb.append(spec);
      sb.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
      sb.append("&pageNo=" + URLEncoder.encode(pageNo, "UTF-8"));
      sb.append("&schDate=" + URLEncoder.encode(schDate, "UTF-8"));
      sb.append("&schDeptCityCode=" + URLEncoder.encode(schDeptCityCode, "UTF-8"));
      sb.append("&schArrvCityCode=" + URLEncoder.encode(schArrvCityCode, "UTF-8"));
      
      url = new URL(sb.toString());
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");  // 생략 가능
      
      int responseCode = con.getResponseCode();
      if(responseCode == HttpURLConnection.HTTP_OK) {
        reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      } else {
        reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
      }
      
      StringBuilder responseBody = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        responseBody.append(line + "\n");
      }
      
      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, "국제선운항스케쥴.xml");
      
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
        writer.write(responseBody.toString());
        writer.flush();
      } catch (Exception e) {
        e.printStackTrace();
      }
      
      System.out.println(file.getPath() + " 파일 생성 완료");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  /*
   * org.w3c.dom.Document : XML문서
   * org.w3c.dom.Node     : 구성요소(Element의 부모)
   * org.w3c.dom.Element  : 구성요소(Node의 자식)
   */
  public static void ex02() {
    
    try {
      
      // File
      File dir = new File("C:/storage");
      File file = new File(dir, "국제선운항스케쥴.xml");
      
      // Document
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(file);
      
      // root (최상위 요소)
      Element root = document.getDocumentElement();
      System.out.println(root.getNodeName());
      
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
  
  public static void main(String[] args) {
//    ex01();
    ex02();
  }

}
