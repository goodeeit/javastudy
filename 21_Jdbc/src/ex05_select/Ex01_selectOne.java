package ex05_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import connect.DB_Connect;

public class Ex01_selectOne {

  // select 결과 행이 1개(0개)인 경우
  
  public static void main(String[] args) {
    
    // 조회할 사용자 번호(USER_NO) 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("조회할 USER_NO >>> ");
    int user_no = sc.nextInt();
    sc.close();
    
    // Connection 객체 선언 (DB 접속)
    Connection con = null;
    
    // PreparedStatement 객체 선언 (쿼리문 실행)
    PreparedStatement ps = null;
    
    // ResultSet 객체 선언 (검색 결과 처리)
    ResultSet rs = null;
    
    try {
      
      // Connection 객체 생성 (DB_Connect 클래스의 getConnection 메소드로부터 받아오기)
      con = DB_Connect.getConnection();
      
      // 쿼리문
      String sql = "";
      sql += "SELECT USER_NO, USER_ID, USER_NAME, JOINED_AT";
      sql += "  FROM USER_T";
      sql += " WHERE USER_NO = ?";
      
      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);
      
      // 쿼리문에 변수 넣기
      ps.setInt(1, user_no); // 1번째 물음표 ← user_no
      
      // 쿼리문 실행
      rs = ps.executeQuery();
      
      System.out.println("검색 결과: " + rs.next());
      
      /*
       * SELECT 검색 결과를 처리하는 방식
       * 
       * 1. ResultSet 객체는 검색 결과를 행(Row) 단위로 처리한다.
       * 2. next() 메소드를 통해서 검색 결과를 행(Row) 단위로 이동한다. 
       *    1) next() 메소드를 1번 호출하면 첫 번째 검색 결과 행(Row)을 처리한다.
       *    2) next() 메소드를 2번 호출하면 두 번째 검색 결과 행(Row)을 처리한다.
       *    3) ...
       * 3. next() 메소드는 boolean 타입의 값(true, false)를 반환한다.
       *    1) 검색 결과 행(Row)이 있으면 true를 반환한다.
       *    2) 검색 결과 행(Row)이 없으면 false를 반환한다.
       *    
       * |---------|---------|-----------|-----------|
       * | USER_NO | USER_ID | USER_NAME | JOINED_AT |
       * |---------|---------|-----------|-----------|
       * |    1    |  admin  |  관리자   | 23/08/09  | ← next() 메소드를 1번 호출하면 처리할 수 있는 행(Row) 있음, 검색 결과가 있으므로 true 반환
       * |---------|---------|-----------|-----------|
       *                                               ← next() 메소드를 2번 호출하면 처리할 수 있는 행(Row) 없음, 검색 결과가 없으므로 false 반환
       *                                               
       */
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }

}
