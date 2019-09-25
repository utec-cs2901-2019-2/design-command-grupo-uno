package command;

public class CeilingHigh implements Command{
    Ceiling ceiling;

    public CeilingHigh(Ceiling ceiling){
        this.ceiling = ceiling;
    }

    @Override
    public void execute() {
        ceiling.high();
    }
}
