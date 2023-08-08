package ex02_api;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class Ex05_Naver_Papago {

  public static void main(String[] args) {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedOutputStream bout = null;  // 서버로 POST 데이터 보내는 용도
    BufferedReader reader = null;
    
    try {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("번역할 한국어 입력 >>> ");
      String text = sc.nextLine();
      sc.close();
      
      String spec = "https://openapi.naver.com/v1/papago/n2mt";
      String clientId = "RTJMyHb54a63lvLzPh7A";
      String clientSecret = "0xR9yv0oo3";
      
      String params = "source=ko&target=en&text=" + text;
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      // 요청 메소드 POST (생략할 수 없다.)
      con.setRequestMethod("POST");
      
      // 요청 헤더 (clientId, clientSecret)
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
      
      // OutputStream을 이용해서 POST 데이터를 보내겠다.
      con.setDoOutput(true);
      
      // OutputStream을 이용해서 POST 데이터 보내기
      bout = new BufferedOutputStream(con.getOutputStream());
      bout.write(params.getBytes());
      bout.flush();
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line);
      }
      
      JSONObject obj = new JSONObject(sb.toString());
      JSONObject message = obj.getJSONObject("message");
      JSONObject result = message.getJSONObject("result");
      String translatedText = result.getString("translatedText");
      
      System.out.println("번역 결과");
      System.out.println("---------");
      System.out.println(translatedText);
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(reader != null) reader.close();
        if(bout != null) bout.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }

}