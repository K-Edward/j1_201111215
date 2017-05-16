package headfirst.command.undo;

public class RemoteControlwithUndo {
  Command[] onCommands;
  Command[] offCommands;
  
  Command undoCommand;
  
  public RemoteControlwithUndo() {
    onCommands = new Command[7];
    offCommands = new Command[7];
    //Null Object Pattern
    Command noCommand = new NoCommand();
    for(int i = 0; i<7; i++){
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    
    undoCommand = noCommand;
  }
  
  public void setCommand(Command c1, Command c2, int slot){
    onCommands[slot] = c1;
    offCommands[slot] = c2;
    
  }
  
  public void onButtonWasPressed(int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }
  
  public void offButtonWasPressed(int slot){
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }
  
  public void undoWasPressed(){
    undoCommand.undo();
  }
}