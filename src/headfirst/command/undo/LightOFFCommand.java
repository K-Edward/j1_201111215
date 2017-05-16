package headfirst.command.undo;

public class LightOFFCommand implements Command {
  Light light;
  int level;
  
  public LightOFFCommand(Light light){
    this.light = light;
  }
  
  public void execute(){
    level = light.getLevel();
    light.off();
  }
  
  public void undo(){
    light.dim(level);
  }
}