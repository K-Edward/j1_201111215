package headfirst.command.undo;
//receiver가 없는 Command.
//아무것도 하지 않는 NULL
public class NoCommand implements Command {
  public void execute(){
    System.out.println("do nothing....");
  }
  
  public void undo(){
    System.out.println("did not anything..");
  }
}