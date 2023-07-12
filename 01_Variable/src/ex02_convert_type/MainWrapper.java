package ex02_convert_type;

public class MainWrapper {

  public static void main(String[] args) {
    
    /*
     * 자동 변환(promotion)
     * 1. 작은 크기 -> 큰 크기
     * 2. 정수 -> 실수
     */
    
    byte num1 = 127;  // byte는 -128~127 가능
    int num2 = num1;  // 1바이트 크기를 가진 num1을 4바이트 크기로 자동 변환
    System.out.println(num2);
    
    double addResult = 1.5 + 5;  // 5를 5.0으로 자동 변환
    System.out.println(addResult);
    
    /*
     * 강제 변환(casting)
     * 1. 큰 크기 -> 작은 크기
     * 2. 실수 -> 정수
     */
    
    int bigNum = 256;
    byte smallNum = (byte)bigNum;  // 4바이트 bigNum을 강제로 1바이트로 변환
    System.out.println(smallNum);
    
    double pct = 0.5;
    int iPct = (int)pct;  // 실수를 강제로 정수로 변환(소수점 잘려나간다.)
    System.out.println(iPct);
    
    /*
     * 구문 분석(parsing)
     * 1. 문자열 -> 정수(int, long)
     * 2. 문자열 -> 실수(double)
     */
    
    String strScore = "100";
    int score = Integer.parseInt(strScore);
    
    String strMoney = "10000000000";
    long money = Long.parseLong(strMoney);
    
    String strComm = "0.5";
    double comm = Double.parseDouble(strComm);
    
    System.out.println(score);
    System.out.println(money);
    System.out.println(comm);
    
  }
  
}
