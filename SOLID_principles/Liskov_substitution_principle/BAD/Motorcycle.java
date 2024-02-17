package SOLID_principles.Liskov_substitution_principle.BAD;

public class Motorcycle implements Vehical {

    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public String typeOfEngine() {
        return "2 stroke";
    }

}
