package ex05_Cup;

public class MainWrapper {

  public static void main(String[] args) {
    
    Cup cup1 = new Cup();
    cup1.setCoffee(new Americano());
    
    Cup cup2 = new Cup();
    cup2.setCoffee(new CafeLatte());

  }

}
