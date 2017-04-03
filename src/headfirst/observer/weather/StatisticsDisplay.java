package headfirst.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float max_Temperature;
  private float min_Temperature;
  private float sum_Temperature;
  private int count; //�����Ͱ� ���� Ƚ���� ī��Ʈ�� ����
  private Subject weatherData;
  
  public StatisticsDisplay(Subject weatherDate){
    this.weatherData = weatherDate;
    weatherData.registerObserver(this);
  }
  
  public void update(float temperature, float humidity, float pressure) {
    // ���⼭ ��踦 ������.
    // ��� ������ ��� �µ��� �ְ� �µ�, ���� �µ��� ���ؾ� ��
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