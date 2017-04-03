package headfirst.observer.weather;
//������ ���� Display
//pressure�� ��ȭ�� ���ؼ� ������ ��������, ���� ������, �� ���� ���� ���� �˸��� �����.
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
      System.out.println("������ �������� ������ ������ �����Դϴ� ! ^_^");
    else if(current_Pressure == last_Pressure)
      System.out.println("���� ������ ������ �����Դϴ�.");
    else if(current_Pressure < last_Pressure)
      System.out.println("������� �������� �� ���ڽ��ϴ�. ����� ������ �� ������ �����ϼ��� !");
    
    System.out.println("");
  }
  
}