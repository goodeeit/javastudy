package ex08_SmartPhone;

public class MainWrapper {

  public static void main(String[] args) {
    
    Phone p = new SmartPhone();
    p.call();
    p.sms();
    if(p instanceof Computer) {
      ((Computer) p).game();
      ((Computer) p).internet();
    }
    if(p instanceof Camera) {
      ((Camera) p).takePicture();
    }
    
    Computer c = new SmartPhone();
    c.game();
    c.internet();
    if(c instanceof Phone) {
      ((Phone) c).call();
      ((Phone) c).sms();
    }
    if(c instanceof Camera) {
      ((Camera) c).takePicture();
    }
    
    SmartPhone sp = new SmartPhone();
    sp.call();
    sp.sms();
    sp.game();
    sp.internet();
    sp.takePicture();

  }

}