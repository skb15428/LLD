package SOLID_principles.Liskov_substitution_principle.GOOD;

public class Bicycle implements Vehical {

    @Override
    public int noOfWheels() {
        return 2;
    }

}
