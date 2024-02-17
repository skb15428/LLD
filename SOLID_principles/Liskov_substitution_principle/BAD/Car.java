package SOLID_principles.Liskov_substitution_principle.BAD;

public class Car implements Vehical {

    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public String typeOfEngine() {
        return "4 stroke";
    }

}
