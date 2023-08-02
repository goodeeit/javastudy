package ex01_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class MainWrapper {

  /*
   * java.io.File 클래스
   * 1. 파일, 디렉터리를 관리하는 클래스이다.
   * 2. 파일, 디렉터리를 생성/삭제가 가능하다.
   * 3. 파일, 디렉터리의 각종 정보(이름, 크기, 최종수정일 등)를 확인할 수 있다.
   */
  
  /*
   * 경로 작성 방법
   * 1. 윈도우 : 백슬래시(\), Java에서 백슬래시 입력하는 방법(\\)
   * 2. 리눅스 : 슬래시(/)
   * 3. java.io.File 클래스에는 플랫폼에 따라서 경로 구분자를 자동으로 바꿔주는 separator 필드 값이 있다.
   */
  
  public static void ex01() {
    
    // 디렉터리 생성/삭제
    
    // 경로 구분자
    String sep = File.separator;
    
    // File 객체 선언
    File dir;
    
    // File 객체 생성
    dir = new File("C:" + sep + "storage");  // C드라이브 아래에 있는 storage 디렉터리
    
    // C:\storage 디렉터리가 없으면 만들고, 있으면 지우기
    if(dir.exists()) {
      // dir.deleteOnExit();  // Java 실행이 끝나면 지운다.
      dir.delete();  // 지금 당장 지운다.
      System.out.println("C:\\storage 디렉터리 삭제 완료");
    } else {
      dir.mkdirs();  // 디렉터리 내부에 또 다른 디렉터리도 만들 수 있다.
      System.out.println("C:\\storage 디렉터리 생성 완료");
    }
    
  }
  
  public static void ex02() {
    
    // 파일 생성/삭제
    
    try {
    
      // 디렉터리를 File 객체로 생성
      File dir = new File("C:/storage");  // Windows 플랫폼에서도 슬래시(/)가 인식된다.
      
      // 디렉터리가 없으면 만들기
      if(!dir.exists()) {
        dir.mkdirs();
      }
      
      // 파일을 File 객체로 생성
      File file = new File(dir, "myfile.txt");
      
      // 파일이 있으면 지우고, 없으면 만들기
      if(file.exists()) {
        file.delete();
        System.out.println("myfile.txt 파일 삭제 완료");
      } else {
        file.createNewFile();  // 반드시 예외 처리를 해야 하는 코드(Checked Exception인 IOException 발생)
        System.out.println("myfile.txt 파일 생성 완료");
      }
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void ex03() {
    
    // 파일, 디렉터리 정보 확인
    // listFiles()    : 모든 File 객체를 저장한 File[] 반환
    // getName()      : 이름 반환
    // getParent()    : 저장된 디렉터리 반환
    // getPath()      : getParent() + getName()
    // lastModified() : 최종수정일을 long 타입으로 반환
    // length()       : 크기를 long 타입의 바이트 단위로 반환
    // isDirectory()  : 디렉터리이면 true 반환
    // isFile()       : 파일이면 true 반환
    
    // 디렉터리를 File 객체로 생성
    File dir = new File("C:/Program Files/Java/jdk-11");
    
    // 디렉터리에 있는 모든 File 객체(파일, 디렉터리) 가져오기
    File[] files = dir.listFiles();
    
    // 디렉터리에 있는 모든 File 객체의 정보 확인하기
    for(int i = 0; i < files.length; i++) {
      
      // 개별 File 객체
      File file = files[i];
      
      // 출력 결과를 저장할 StringBuilder 생성
      StringBuilder sb = new StringBuilder();
      
      // File 객체 이름
      sb.append(String.format("%-15s", file.getName()));
      
      // File 객체 최종수정일
      long lastModified = file.lastModified();
      String strLastModified = new SimpleDateFormat("yyyy-MM-dd a h:mm").format(lastModified);
      sb.append(String.format("%-20s", strLastModified));
      
      // File 객체 유형(파일, 디렉터리)
      String kind = file.isDirectory() ? "파일 폴더" : "파일";
      sb.append(String.format("%-10s", kind));
      
      // File 객체 크기
      long size = file.isFile() ? file.length() : 0;  // 파일은 바이트 단위로 크기가 저장, 디렉터리는 크기를 표시하지 않으므로 0으로 저장
      long kbSize = (size / 1024) + (size % 1024 != 0 ? 1 : 0);
      if(size != 0) {
        sb.append(String.format("%10s", kbSize + "KB"));
      }
      
      // StringBuilder 객체를 String으로 변환
      String str = sb.toString();
      
      // 출력
      System.out.println(str);
      
    }
    
  }
  
  public static void main(String[] args) {
    ex03();
  }

}