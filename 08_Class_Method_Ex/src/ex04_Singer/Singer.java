package ex04_Singer;

public class Singer {

  private String name;
  private Song titleSong;
  
  // Setter
  public void setName(String name) {
    this.name = name;
  }
  public void setTitleSong(Song titleSong) {
    this.titleSong = titleSong;
  }
  
  // info
  public void info() {
    System.out.println("이름: " + name);
    titleSong.info();
  }
  
}