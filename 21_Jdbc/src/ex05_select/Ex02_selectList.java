package ex05_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DB_Connect;
import dto.UserDto;

public class Ex02_selectList {

  // select 결과 행이 여러 개인 경우
  
  public static void main(String[] args) {

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
      sql += " ORDER BY USER_NO";
      
      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);
      
      // 쿼리문 실행
      rs = ps.executeQuery();
      
      // 검색 결과를 저장할 List<UserDto> 생성
      List<UserDto> users = new ArrayList<UserDto>();
      
      // 검색 결과가 여러 개인 경우 while문을 이용해서 검색 결과가 있는지 여러 번 체크한다.
      while(rs.next()) {
        
        // 검색 결과 행(Row) 1개 → UserDto 객체 생성
        UserDto user = new UserDto();
        user.setUser_no(rs.getInt(1));
        user.setUser_id(rs.getString(2));
        user.setUser_name(rs.getString(3));
        user.setJoined_at(rs.getDate(4));
        
        // UserDto 객체 -> List<UserDto> 추가
        users.add(user);
        
      }
      
      // 검색 결과 확인
      for(UserDto user : users) {
        System.out.println(user);
      }
      
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
    
    /*
     * |---------|---------|-----------|-----------|
     * | USER_NO | USER_ID | USER_NAME | JOINED_AT | ← 최초 rs
     * |---------|---------|-----------|-----------|
     * |    1    |  admin  |    tom    | 23/08/09  | ← 1번째 rs.next() 호출, 검색 결과 행이 있으므로 true 반환
     * |---------|---------|-----------|-----------|
     * |    2    |  bravo  |   alice   | 23/08/09  | ← 2번째 rs.next() 호출, 검색 결과 행이 있으므로 true 반환
     * |---------|---------|-----------|-----------|
     * |    3    |  mango  |  jessica  | 23/08/09  | ← 3번째 rs.next() 호출, 검색 결과 행이 있으므로 true 반환
     * |---------|---------|-----------|-----------|
     *                                               ← 4번째 rs.next() 호출, 검색 결과 행이 없으므로 false 반환
     */

  }

}
