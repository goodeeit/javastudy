package ex02_Coffee;

public class MainWrapper {

  public static void main(String[] args) {
    
    Coffee coffee1 = new Americano("아메리카노");
    Cup cup1 = new Cup();
    cup1.setCoffee(coffee1);
    
    Coffee coffee2 = new CafeLatte("카페라떼");
    Cup cup2 = new Cup();
    cup2.setCoffee(coffee2);
    
    Person p = new Person();
    p.addCupToTray(cup1);
    p.addCupToTray(cup2);
    
    p.trayInfo();

  }

}