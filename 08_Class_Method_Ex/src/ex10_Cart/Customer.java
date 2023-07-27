package ex10_Cart;

import java.text.DecimalFormat;

public class Customer {

  /* Cart */   private Cart cart;
  /* 돈 */     private int money;
  /* 포인트 */ private int point;
  
  // new Customer(100_000, 1_000)
  public Customer(int money, int point) {
    super();
    this.money = money;
    this.point = point;
  }

  public Cart getCart() {
    return cart;
  }
  public void setCart(Cart cart) {
    this.cart = cart;
  }
  public int getMoney() {
    return money;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  public int getPoint() {
    return point;
  }
  public void setPoint(int point) {
    this.point = point;
  }
  
  // 카트에 물건 넣기
  public void addProductToCart(Product product) {
    cart.addProduct(product);
  }
  
  // 카트의 물건 바꾸기
  public void changeProductFromCart(int idx, Product product) {
    cart.changeProduct(idx, product);
  }
  
  // 카트의 물건 빼기
  public void deleteProductFromCart(int idx) {
    cart.deleteProduct(idx);
  }
  
  // 물건 구매하기
  public String buy() {
    
    String receipt = "------ 영수증 ------\n";
    
    int totalPrice = 0;
    
    for(int i = 0, prodCount = cart.getProdCount(); i < prodCount; i++) {
      
      // cart에서 뺀 물건 1개
      Product[] products = cart.getProducts();
      Product product = products[i];
      
      // 구매액 누적
      totalPrice += product.getProdPrice();
      
      // 구매가 불가능한 경우
      if(money < totalPrice) {
        System.out.println("돈이 부족합니다.");
        return "";
      }
      
      // 영수증 만들기
      // 참고 (#,##0은 천 단위 구분 기호(,)를 넣어 주는 패턴, 패턴 적용을 위해서 DecimalFormat 클래스 사용)
      receipt += String.format("%-10s", product.getProdName());
      receipt += String.format("%10s", new DecimalFormat("#,##0").format(product.getProdPrice()));
      receipt += "\n";
      
    }
    
    // 비용 지불
    money -= totalPrice;
    
    // 발생 포인트 누적
    point += totalPrice * 0.1;
    
    // 영수증 만들기
    receipt += "--------------------\n";
    receipt += "구매총액" + String.format("%12s", new DecimalFormat("#,##0").format(totalPrice)) + "\n";
    receipt += "발생포인트" + String.format("%10s", new DecimalFormat("#,##0").format(totalPrice * 0.1)) + "\n";
    receipt += "보유포인트" + String.format("%10s", new DecimalFormat("#,##0").format(point)) + "\n";
    
    // 영수증 반환
    return receipt;
    
  }

  @Override
  public String toString() {
    return "Customer [money=" + money + ", point=" + point + "]";
  }
  
}
