package ex03_functional_interface;

public class MainWrapper {

  public static void ex01() {
    
    // Anonymous inner Type 생성
    /*
    MyInterface1 interface1 = new MyInterface1() {
      @Override
      public void method1() {
        System.out.println("Hello World");
      }
    };
    */
    
    // 람다 표현식으로 생성
    MyInterface1 interface1 = () -> System.out.println("Hello World");
    
    // method1() 호출
    interface1.method1();
    
  }
  
  public static void ex02() {
    
    // Anonymous inner Type 생성
    /*
    MyInterface2 interface2 = new MyInterface2() {
      @Override
      public void method2(String name) {
        System.out.println(name + "님");
      }
    };
    */
    
    // 람다 표현식으로 생성
    MyInterface2 interface2 = (name) -> System.out.println(name + "님");
    
    // method2() 호출
    interface2.method2("홍길동");
    
  }
  
  public static void ex03() {
    
    // Anonymous inner Type 생성
    /*
    MyInterface3 interface3 = new MyInterface3() {
      @Override
      public String method3() {
        return "Hello World";
      }
    };
    */
    
    // 람다 표현식 생성
    MyInterface3 interface3 = () -> "Hello World";
    
    // method3() 호출
    String str = interface3.method3();
    System.out.println(str);
    
  }
  
  public static void ex04() {
    
    // Anonymous inner Type 생성
    /*
    MyInterface4 interface4 = new MyInterface4() {
      @Override
      public String method4(String name) {
        return name + "님";
      }
    };
    */
    
    // 람다 표현식 생성
    MyInterface4 interface4 = (name) -> name + "님";
    
    // method4() 호출
    String str = interface4.method4("홍길동");
    System.out.println(str);
    
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
    ex04();
  }

}
