package headfirst.command.undo;

public class RemoteMain {
  public static void main(String[] args){
    Light light = new Light();
    LightOFFCommand lightOff = new LightOFFCommand(light);
    LightOnCommand lightOn = new LightOnCommand(light);
    
    RemoteControlwithUndo rcu = new RemoteControlwithUndo();
    
    rcu.setCommand(lightOn, lightOff, 0);
    
    rcu.onButtonWasPressed(0);
    rcu.offButtonWasPressed(0);
  }
}