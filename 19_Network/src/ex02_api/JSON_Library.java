package ex02_api;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSON_Library {

  /*
   * JSON 공식 홈페이지
   * 1. 링크 : https://www.json.org/
   * 2. Java 라이브러리 다운로드
   *    JSON-Java 라이브러리
   */
  
  /*
   * JSON
   * 1. JavaScript Object Notation
   * 2. 자바스크립트 객체 표기법
   * 3. 객체는 중괄호 {}로 묶어서 표기한다.
   * 4. 배열은 대괄호 []로 묶어서 표기한다.
   * 5. 속성(property)과 값(value)를 콜론(:)으로 구분하여 작성한다. 
   */
  
  /*
   * JSON-Java 라이브러리에서 제공하는 클래스
   * 1. JSONObject 클래스 : 객체 처리용
   * 2. JSONArray  클래스 : 배열 처리용
   */
  
  public static void ex01() {
    
    // JSON 객체 만들기
    
    JSONObject obj = new JSONObject();
    obj.put("name", "tom");
    obj.put("age", 50);
    obj.put("height", 180.5);
    
    // JSON 객체 확인하기
    System.out.println(obj.toString());
    
  }
  
  public static void ex02() {
    
    // JSON 배열 만들기 (JSON 객체를 2개 저장한 배열)
    
    // 객체1
    JSONObject obj1 = new JSONObject();
    obj1.put("name", "tom");
    obj1.put("age", 50);
    obj1.put("height", 180.5);
    
    // 객체2
    JSONObject obj2 = new JSONObject();
    obj2.put("name", "jessica");
    obj2.put("age", 60);
    obj2.put("height", 190.5);
    
    // 배열
    JSONArray array = new JSONArray();
    array.put(obj1);
    array.put(obj2);
    
    // 배열 확인
    System.out.println(array.toString());
    
  }

  public static void ex03() {
    
    // String 형식의 JSON 객체 분석하기
    String str = "{\"name\":\"tom\",\"age\":50,\"height\":180.5}";
    
    // String -> JSONObject 객체로 변환
    JSONObject obj = new JSONObject(str);
    
    // 원하는 Key(Property)를 가져오기
    String name = obj.getString("name");     // String name = (String)obj.get("name");
    int age = obj.getInt("age");             // int age = (int)obj.get("age");
    double height = obj.getDouble("height"); // double height = (double)obj.get("height");
    
    // 결과 확인
    System.out.println(name);
    System.out.println(age);
    System.out.println(height);
    
  }
  
  public static void main(String[] args) {
    ex03();
  }

}








