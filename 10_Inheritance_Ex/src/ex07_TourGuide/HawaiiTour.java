package ex07_TourGuide;

public class HawaiiTour implements Tour {

  @Override
  public void sightseeing() {
    System.out.println("와이키키해변");
  }

  @Override
  public void leisure() {
    System.out.println("헬기투어");
  }

  @Override
  public void meal() {
    System.out.println("파인애플피자");
  }

}
