package headfirst.state.gumballstate;

public class SoldState implements State{
  GumballMachine gm;
  
  public SoldState(GumballMachine gm){
    this.gm = gm;
  }
  
  public void insertQuarter(){
    System.out.println("Please wait, we're already giving you a gumball");
  }
  public void ejectQuarter(){
    System.out.println("Sorry, you already turned the crank");
  }
  public void turnCrank(){
    System.out.println("Turning twice doesn't get you another ");
  }
  public void dispense(){
    gm.releaseBall();
    if(gm.getCount() >0){
      gm.setState(gm.getNoQuarterState());
    }
    else {
      System.out.println("Oops, out of gumballs !");
      gm.setState(gm.getSoldOutState());
    }
  }
}
