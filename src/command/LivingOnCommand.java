package command;

public class LivingOnCommand implements Command {
  Living liv;

  public LivingOnCommand(Living liv){
    this.liv = liv;
  }

  @Override
  public void execute(){
    Living.on();
  }
}
