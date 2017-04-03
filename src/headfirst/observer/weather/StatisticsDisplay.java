package headfirst.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;
  
  public StatisticsDisplay(Subject weatherDate){
    this.weatherData = weatherDate;
    weatherData.registerObserver(this);
  }
  
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
  
  public void display(){
    
    System.out.println("Statistics conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure.");
  }
  
}