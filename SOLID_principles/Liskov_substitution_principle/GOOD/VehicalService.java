package SOLID_principles.Liskov_substitution_principle.GOOD;

public class VehicalService {
    public Vehical vehical;
    private EngineVehical engineVehical;

    public VehicalService(Vehical vehical) {
        this.vehical = vehical;
    }

    public VehicalService(EngineVehical engineVehical) {
        this.engineVehical = engineVehical;
    }

    public int getNoOfWheels() {
        return vehical.noOfWheels();
    }

    // Now this method will not thow exception as only engineVehicals are passed.
    public String getTypeOfEngine() {
        return engineVehical.typeOfEngine();
    }

}
