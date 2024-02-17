package SOLID_principles.Liskov_substitution_principle.GOOD;

public class Motorcycle implements EngineVehical {

    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public String typeOfEngine() {
        return "2 stroke";
    }

}
