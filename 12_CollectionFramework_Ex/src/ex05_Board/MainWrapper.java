package ex05_Board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainWrapper {

  public static void main(String[] args) {

    // 게시판(제목, 작성자, 조회수)을 저장하는 ArrayList 만들기
    // Map  : 게시글
    // List : 게시글 목록
    
    // 3개 게시글을 만들고, ArrayList에 저장하기
    Map<String, Object> board1 = new HashMap<String, Object>();
    board1.put("title", "제목1");
    board1.put("writer", "작성자1");
    board1.put("view", 10);
    
    Map<String, Object> board2 = new HashMap<String, Object>();
    board2.put("title", "제목2");
    board2.put("writer", "작성자2");
    board2.put("view", 20);
    
    Map<String, Object> board3 = new HashMap<String, Object>();
    board3.put("title", "제목3");
    board3.put("writer", "작성자3");
    board3.put("view", 30);
    
    // ArrayList 선언 & 생성
    List<Map<String, Object>> boardList = new ArrayList<Map<String,Object>>();
    
    // ArrayList에 저장
    boardList.add(board1);
    boardList.add(board2);
    boardList.add(board3);
    
    // 게시글 정보 확인
    for(int i = 0, length = boardList.size(); i < length; i++) {
      
      Map<String, Object> board = boardList.get(i);
      
      System.out.println("title: " + board.get("title"));
      System.out.println("writer: " + board.get("writer"));
      System.out.println("view: " + board.get("view"));
      
//    for(Entry<String, Object> entry : board.entrySet()) {
//      System.out.println(entry.getKey() + ": " + entry.getValue());
//    }
      
    }

  }

}
