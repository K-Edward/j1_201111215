package headfirst.decorator.starbuzz;

public class Milk extends CondimentDecorator {
  Beverage beverage;
  
  public Milk(Beverage b){
    this.beverage = b;
  }
  
  public String getDescription() {
    return beverage.getDescription() + ", adding Milk";
  }
  
  public double cost(){
    return beverage.cost() + 0.3;
  }
  
}