package ex03_update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class MainWrapper {

  public static void main(String[] args) {
  
    // 수정할 User 정보 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("수정할 USER_NO >>> ");
    int user_no = sc.nextInt();
    sc.nextLine();
    System.out.print("수정할 USER_NAME >>> ");
    String user_name = sc.nextLine();
    sc.close();
    
    // UserDto 객체 생성
    UserDto user = new UserDto();
    user.setUser_no(user_no);
    user.setUser_name(user_name);
    
    // Connection 객체 선언 (DB 접속)
    Connection con = null;
    
    // PreparedStatement 객체 선언 (쿼리문 실행)
    PreparedStatement ps = null;
    
    try {
      
      // Connection 객체 생성 (DB_Connect 클래스의 getConnection 메소드로부터 받아오기)
      con = DB_Connect.getConnection();
      
      // 쿼리문
      String sql = "";
      sql += "UPDATE USER_T";
      sql += "   SET USER_NAME = ?";
      sql += " WHERE USER_NO = ?";
      
      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);
      
      // 쿼리문에 변수 넣기
      ps.setString(1, user.getUser_name()); // 1번째 물음표 ← user.getUser_name()
      ps.setInt(2, user.getUser_no());      // 2번째 물음표 ← user.getUser_no()
      
      // 쿼리문 실행 : update 된 행의 개수가 반환된다.
      int updateResult = ps.executeUpdate();
      
      // 결과
      System.out.println(updateResult + "행이 수정되었습니다.");
      
      // 커밋? 안 한다.
      // con.setAutoCommit(true); ← 기본값으로 사용되고 있다.
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }

}
