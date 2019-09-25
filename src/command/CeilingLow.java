package command;

public class CeilingLow implements Command{
    Ceiling ceiling;

    public CeilingLow(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public void execute() {
        ceiling.low();
    }
}
