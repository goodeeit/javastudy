package ex10_Cart;

public class Product {

  /* 제품번호 */ private String prodNo;
  /* 제품이름 */ private String prodName;
  /* 제품가격 */ private int prodPrice;
  
  // new Product("P0001", "냉장고", 200);
  public Product(String prodNo, String prodName, int prodPrice) {
    super();
    this.prodNo = prodNo;
    this.prodName = prodName;
    this.prodPrice = prodPrice;
  }

  public String getProdNo() {
    return prodNo;
  }
  public void setProdNo(String prodNo) {
    this.prodNo = prodNo;
  }
  public String getProdName() {
    return prodName;
  }
  public void setProdName(String prodName) {
    this.prodName = prodName;
  }
  public int getProdPrice() {
    return prodPrice;
  }
  public void setProdPrice(int prodPrice) {
    this.prodPrice = prodPrice;
  }
  
}
