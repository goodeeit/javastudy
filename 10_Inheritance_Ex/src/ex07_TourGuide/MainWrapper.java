package ex07_TourGuide;

public class MainWrapper {

  public static void main(String[] args) {
    
    TourGuide guide1 = new TourGuide();
    guide1.setTour(new HawaiiTour());  // public void setTour(Tour tour) { }   Tour tour = new HawaiiTour();
    guide1.sightseeing();
    guide1.leisure();
    guide1.meal();
    
    TourGuide guide2 = new TourGuide();
    guide2.setTour(new JapanTour());
    guide2.sightseeing();
    guide2.leisure();
    guide2.meal();

  }

}
