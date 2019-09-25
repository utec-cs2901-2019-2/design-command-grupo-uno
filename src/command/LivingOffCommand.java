package command;

public class LivingOffCommand implements Command {
  Living liv;

  public LivingOffCommand(Living liv){
    this.liv = liv;
  }

  @Override
  public void execute(){
    Living.off();
  }
}
