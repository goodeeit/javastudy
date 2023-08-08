package ex02_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class NaverCaptcha {

  private static final String CLIENT_ID = "RTJMyHb54a63lvLzPh7A";
  private static final String CLIENT_SECRET = "0xR9yv0oo3";
  
  private static String getKey() {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    String result = null;
    
    try {
      
      String spec = "https://openapi.naver.com/v1/captcha/nkey?code=0";
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");
      
      con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
      con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);
      
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
      
      System.out.println(sb.toString());
      
      JSONObject obj = new JSONObject(sb.toString());
      result = obj.getString("key");
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    return result;
    
  }
  
  public static void main(String[] args) {
    
    String key = getKey();
    System.out.println("캡차키: " + key);

  }

}
