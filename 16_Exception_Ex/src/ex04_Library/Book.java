package ex04_Library;

import java.util.Objects;

public class Book {

  private String title;
  private int price;

  // new Book()
  public Book() {
    
  }
  // new Book("좋은생각")
  public Book(String title) {
    this(title, 0);  // 파라미터가 2개인 다른 생성자를 호출한다. public Book(String title, int price){}를 의미한다.
  }
  // new Book("어린왕자", 10000)
  public Book(String title, int price) {
    super();
    this.title = title;
    this.price = price;
  }
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  
  @Override
  public String toString() {
    return "Book [title=" + title + ", price=" + price + "]";
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(price, title);
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return price == other.price && Objects.equals(title, other.title);
  }
  
}
