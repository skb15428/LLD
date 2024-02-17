package SOLID_principles.Liskov_substitution_principle.GOOD;

public class Car implements EngineVehical {

    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public String typeOfEngine() {
        return "4 stroke";
    }

}
