package ex05_log_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainWrapper {

  public static void main(String[] args) {
    
    @SuppressWarnings("resource")  // sc.close()를 생략해도 경고 메시지를 보이지 말라.
    Scanner sc = new Scanner(System.in);

    while(true) {
      
      try {
        
        System.out.print("첫 번째 정수를 입력하세요 >>> ");
        int n1 = sc.nextInt();
        
        System.out.print("연산자를 입력하세요(+-*/%) >>> ");
        String op = sc.next();
        
        System.out.print("두 번째 정수를 입력하세요 >>> ");
        int n2 = sc.nextInt();
        
        int result = 0;
        switch(op) {
        case "+" : result = n1 + n2; break;
        case "-" : result = n1 - n2; break;
        case "*" : result = n1 * n2; break;
        case "/" : result = n1 / n2; break;
        case "%" : result = n1 % n2; break;
        default: throw new RuntimeException("invalid operator " + op);
        }
        
        System.out.println(n1 + op + n2 + "=" + result);
        
      } catch(Exception e) {
        
        sc.nextLine();
        
        // 문제. 예외가 발생할때마다 예외가 발생한 시간과 예외 메시지(message)를 C:/storage/log.txt 파일에 기록하시오.
        // C:/storage/log.txt 파일 내용 예시)
        // 2023-08-04 오후 3:10:30    / by zero
        // 2023-08-04 오후 3:11:23    invalid operator ++
        // 2023-08-04 오후 3:12:52    null
        
        // 예외 발생 시간
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a h:mm:ss");
        String time = dtf.format(now);
        
        // 예외 메시지
        String message = e.getMessage();
        
        // 예외 클래스
        String clazz = e.getClass().getName();
        
        // File 객체
        File dir = new File("C:/storage");
        if(dir.exists() == false) {
          dir.mkdirs();
        }
        File file = new File(dir, "log.txt");
        
        // try-catch-resources
        // 추가 모드 : 기존 파일에 내용을 추가하는 모드  new FileWriter(file, true)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
          
          // 로그 파일에 "시간 예외메시지 예외클래스" 추가하기
          bw.write(time + "  " + message + "  " + clazz);
          bw.newLine();
          
          // 결과 메시지
          System.out.println(file.getPath() + " 파일에 예외 처리 완료");
          
        } catch (IOException e2) {
          e2.printStackTrace();
        }
        
      }
      
    }

  }

}
