package headfirst.state.gumballstate;

public class GumballMachine{
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  
  State state = soldOutState;
  int numGumballs;
  
  public GumballMachine(int num){
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    this.numGumballs = num;
    if(num > 0){
      state = noQuarterState;
    }
  }
  public void insertQuarter() {
    state.insertQuarter();
  }
  
  public void ejectQuarter(){
    state.ejectQuarter();
  }
  
  public void turnCrank(){
    state.turnCrank();
    state.dispense();
  }
  
  public void setState(State s){
    this.state = s;
  }
  
  public State getState() {
    return state;
  }
  
  public State getNoQuarterState(){
    return noQuarterState;
  }
  
  public State getSoldOutState(){
    return soldOutState;
  }
  
  public State getHasQuarterState(){
    return hasQuarterState;
  }
  
  public State getSoldState(){
    return soldState;
  }
  
  public int getCount(){
    return numGumballs;
  }
  
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (numGumballs != 0) {
      numGumballs = numGumballs - 1;
    }
  }
  
}