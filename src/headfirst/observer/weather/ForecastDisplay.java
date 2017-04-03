package headfirst.observer.weather;
//예보에 관한 Display
//pressure의 변화를 통해서 날씨가 좋아질지, 변함 없을지, 비가 오게 될지 예보 알림을 줘야함.
public class ForecastDisplay implements Observer, DisplayElement {
  private float current_Pressure;
  private float last_Pressure;
  private int count;
  private Subject weatherData;
  
  public ForecastDisplay(Subject weatherDate){
    this.weatherData = weatherDate;
    weatherData.registerObserver(this);
  }
  
  public void update(float temperature, float humidity, float pressure) {
    count++;
    if(count == 1){
      last_Pressure = pressure;
      current_Pressure = pressure;
    }
    else{
      last_Pressure = current_Pressure;
      current_Pressure = pressure;
    }
    
    display();
  }
  
  public void display(){
    System.out.println("Forecast :) ");
    if(current_Pressure > last_Pressure)
      System.out.println("고기압의 영향으로 날씨가 좋아질 예정입니다 ! ^_^");
    else if(current_Pressure == last_Pressure)
      System.out.println("현재 날씨가 유지될 전망입니다.");
    else if(current_Pressure < last_Pressure)
      System.out.println("저기압의 영향으로 비가 오겠습니다. 기온이 낮아질 수 있으니 유의하세요 !");
    
    System.out.println("");
  }
  
}