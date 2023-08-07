package ex02_json_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;

public class MainWrapper {

  public static void ex01() {
    
    // 문제. 아래 내용을 가지는 C:/storage/product.json 파일 생성하기
    /*
        [
          {
            "code": "0001",
            "name": "냉장고",
            "price": 100,
            "sales": [
              "하이마트",
              "전자랜드"
            ]
          },
          {
            "code": "0002",
            "name": "에어컨",
            "price": 200,
            "sales": [
              "하이마트"
            ]
          }
        ]
     */
    
    // Map
    Map<String, Object> map1 = new HashMap<String, Object>();
    map1.put("code", "0001");
    map1.put("name", "냉장고");
    map1.put("price", 100);
    map1.put("sales", Arrays.asList("하이마트", "전자랜드"));
    
    // Map
    Map<String, Object> map2 = new HashMap<String, Object>();
    map2.put("code", "0002");
    map2.put("name", "에어컨");
    map2.put("price", 200);
    map2.put("sales", Arrays.asList("하이마트"));
    
    // List
    List<Map<String, Object>> list = Arrays.asList(map1, map2);
    
    // JSONArray
    JSONArray array = new JSONArray(list);
    
    // JSONArray -> String
    String products = array.toString();
    
    // 디렉터리 File 객체
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    // 파일 File 객체
    File file = new File(dir, "product.json");
    
    // try - catch - resources (close를 생략할 수 있는 try 문)
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
      bw.write(products);
      System.out.println(file.getPath() + " 파일 생성 완료");
    } catch(IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void ex02() {
    
    // 문제. 아래 링크에 연결된 JSON 파일을 모두 읽은 뒤 아래 데이터를 가져와서 출력하시오.
    // 가져올 데이터)
    // ○ (강수) 10일(목) 전국에, 11일(금) 오전 수도권과 강원도에 비가 오겠습니다.<br />○ (기온) 이번 예보기간 아침 기온은 23~26도, 낮 기온은 27~33도로 평년(최저기온 22~24도, 최고기온 29~32도)과 비슷하겠습니다. <br />○ (해상) 전해상에 10일(목)까지, 동해상은 11일(금)까지 물결이 1.0~4.0m(동해상과 남해동부해상 5.0m 이상)로 매우 높게 일겠습니다.<br />○ (주말전망) 12일(토)과 13일(일)은 전국이 구름많겠습니다. 아침 기온은 23~26도, 낮 기온은 30~33도가 되겠습니다.

    String spec = "https://gdlms.cafe24.com/uflist/curri/10014/bbs/231_64d09afdc7c01.json";
    
  }
  
  public static void main(String[] args) {
    // ex01();
    ex02();
  }

}
