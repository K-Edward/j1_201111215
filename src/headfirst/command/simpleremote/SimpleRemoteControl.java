package headfirst.command.simpleremote;

public class SimpleRemoteControl {
  //버튼 설정
  //버튼 누르기
  //위의 2개의 함수 필요.
  
  Command slot; //리모컨에 있는 하나의 버튼(이름 : slot, 타입 : Command)
  
  public void setCommand(Command c){
    slot = c;
  }
  
  public void buttonWasPressed() {
    slot.execute();
  }
}