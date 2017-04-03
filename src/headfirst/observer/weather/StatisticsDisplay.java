package headfirst.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float max_Temperature;
  private float min_Temperature;
  private float sum_Temperature;
  private int count; //데이터가 들어온 횟수를 카운트할 변수
  private Subject weatherData;
  
  public StatisticsDisplay(Subject weatherDate){
    this.weatherData = weatherDate;
    weatherData.registerObserver(this);
  }
  
  public void update(float temperature, float humidity, float pressure) {
    // 여기서 통계를 내야함.
    // 통계 내용은 평균 온도와 최고 온도, 최저 온도를 구해야 함
    sum_Temperature = sum_Temperature + temperature;
    count++;
    
    if(count == 1){
      max_Temperature = temperature;
      min_Temperature = temperature;
    }
    else{
      if(temperature > max_Temperature){
        max_Temperature = temperature;
      }
      
      if(min_Temperature > temperature){
        min_Temperature = temperature;
      }
    }
    
    display();
  }
  
  public void display(){
    System.out.println("Statistics - Average temperature : " + (sum_Temperature/count) + "F, Max temperature : " + (max_Temperature) + "F, Minimum temperature : " + (min_Temperature) + "F");
  }
  
}