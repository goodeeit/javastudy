package ex02_has_a;

public class MainWrapper {

  public static void main(String[] args) {
    
    // Tv 객체 선언 & 생성
    Tv tv = new Tv();
    
    // Tv 객체 메소드
    tv.upCh();
    tv.upVol();
    System.out.println(tv.getCh());
    System.out.println(tv.getVol());

    tv.downCh();
    tv.downVol();
    System.out.println(tv.getCh());
    System.out.println(tv.getVol());
    
  }

}