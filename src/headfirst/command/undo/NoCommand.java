package headfirst.command.undo;
//receiver�� ���� Command.
//�ƹ��͵� ���� �ʴ� NULL
public class NoCommand implements Command {
  public void execute(){
    System.out.println("do nothing....");
  }
  
  public void undo(){
    System.out.println("did not anything..");
  }
}