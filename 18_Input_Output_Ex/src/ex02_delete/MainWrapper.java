package ex02_delete;

import java.io.File;

public class MainWrapper {

  /*
  public static void ex01() {

    // C:/2023 디렉터리를 삭제하시오.
    // 비어 있는 디렉터리만 삭제할 수 있다.
    
    new File("C:/2023/08/03/15").delete();
    new File("C:/2023/08/03").delete();
    new File("C:/2023/08").delete();
    new File("C:/2023").delete();
    
  }
  */
  
  // 재귀 호출을 이용해서 ex01() 다시 풀기
  public static void ex01(File dir) {
    File parent = dir.getParentFile();  // dir의 상위 디렉터리
    if(parent == null) {                // dir의 상위 디렉터리가 없으면 그만
      return;
    }
    System.out.println(dir.getPath() + " 디렉터리 삭제");
    dir.delete();  // 현재 디렉터리 삭제
    ex01(parent);  // 상위 디렉터리 전달
  }
  
  public static void ex02() {
    
    // C:/storage 디렉터리를 삭제하시오.
    
    File dir = new File("C:/storage");
    File[] files = dir.listFiles();
    if(files != null) {
      for(File file : files) {
        System.out.println(file.getPath() + " 파일 삭제");
        file.delete();
      }
    }
    
    System.out.println(dir.getPath() + " 디렉터리 삭제");
    dir.delete();
    
  }
  
  public static void main(String[] args) {
    // ex01();
    ex01(new File("C:/2023/08/03/16"));
    // ex02();
  }

}
