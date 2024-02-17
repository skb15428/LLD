package SOLID_principles.Liskov_substitution_principle.BAD;

public class VehicalService {
    private Vehical vehical;

    public VehicalService(Vehical vehical) {
        this.vehical = vehical;
    }

    public int getNoOfWheels() {
        return vehical.noOfWheels();
    }

    // This method will throw exception when bicycle object is sent in the
    // constructor
    public String getTypeOfEngine() {
        return vehical.typeOfEngine();
    }
}
