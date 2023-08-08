package ex01_web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Ex05_Encoder_Decoder {

  public static void main(String[] args) {
    
    /*
     * Encoding : 원본 데이터를 암호화 하는 것
     * Decoding : 암호화 된 데이터를 원본 데이터로 복호화 하는 것
     */
    
    try {
      
      // 원본 데이터
      String originData = "홍길동 tom 12345 !@#$%^&*()_+";
      System.out.println("원본: " + originData);
      
      // Encoding(암호화)
      String encodeData = URLEncoder.encode(originData, "UTF-8");  // UnsupportedEncodingException 발생
      System.out.println("암호: " + encodeData);
      
      // Decoding(복호화)
      String decodeData = URLDecoder.decode(encodeData, "UTF-8");  // UnsupportedEncodingException 발생
      System.out.println("복호: " + decodeData);
      
    } catch(UnsupportedEncodingException e) {
      System.out.println("인코딩 오류");
    }
    
  }

}
