package headfirst.command.simpleremote;

public class SimpleRemoteControl {
  //��ư ����
  //��ư ������
  //���� 2���� �Լ� �ʿ�.
  
  Command slot; //�������� �ִ� �ϳ��� ��ư(�̸� : slot, Ÿ�� : Command)
  
  public void setCommand(Command c){
    slot = c;
  }
  
  public void buttonWasPressed() {
    slot.execute();
  }
}