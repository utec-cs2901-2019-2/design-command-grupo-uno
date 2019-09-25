package command;

public class GarageOpenCommand implements Command {
    Garage garage;

    public GarageOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.open();
    }
}