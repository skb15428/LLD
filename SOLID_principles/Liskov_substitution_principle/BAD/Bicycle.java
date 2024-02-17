package SOLID_principles.Liskov_substitution_principle.BAD;

public class Bicycle implements Vehical {

    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public String typeOfEngine() {
        throw new UnsupportedOperationException("Unimplemented method 'typeOfEngine'");
    }

}
