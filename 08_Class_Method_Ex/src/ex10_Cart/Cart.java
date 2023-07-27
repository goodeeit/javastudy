package ex10_Cart;

public class Cart {

  /* Product 배열 길이 */ private final int CART_LENGTH = 10;
  /* Product 배열 */      private Product[] products;
  /* 담긴 Product 갯수 */ private int prodCount;
  
  // new Cart()
  public Cart() {
    products = new Product[CART_LENGTH];
  }

  public Product[] getProducts() {
    return products;
  }
  public void setProducts(Product[] products) {
    this.products = products;
  }
  public int getProdCount() {
    return prodCount;
  }
  public void setProdCount(int prodCount) {
    this.prodCount = prodCount;
  }
  
  
  // 물건 넣기
  // addProduct(new Product("제품번호", "제품명", 제품가격))
  public void addProduct(Product product) {
    // 물건을 못 넣는 경우
    if(prodCount == CART_LENGTH) {
      System.out.println("Cart is Full!");
      return;
    }
    // 물건 넣기
    products[prodCount++] = product;
  }
  
  
  // 물건 바꾸기
  // changeProduct(0, new Product("제품번호", "제품명", 제품가격))
  public void changeProduct(int idx, Product product) {
    // 물건 못 바꾸는 경우
    if(idx < 0 || idx >= prodCount) {
      System.out.println("There is no product!");
      return;
    }
    // 물건 바꾸기
    products[idx] = product;
  }
  
  
  // 물건 빼기
  // deleteProduct(0)
  public void deleteProduct(int idx) {
    // 물건을 못 빼는 경우
    if(prodCount == 0) {
      System.out.println("Cart is Empty!");
      return;
    }
    if(idx < 0 || idx >= prodCount) {
      System.out.println("There is no product!");
      return;
    }
    // idx    복사할 요소의 갯수  물건의 갯수
    // 0      3                   4
    // 1      2                   4
    // 2      1                   4
    // 3      0                   4
    // ---------------------------------------
    // idx + x + 1 = prodCount
    // x = prodCount - idx - 1
    System.arraycopy(products, idx + 1, products, idx, prodCount - idx - 1);
    products[--prodCount] = null;
  }
  
}