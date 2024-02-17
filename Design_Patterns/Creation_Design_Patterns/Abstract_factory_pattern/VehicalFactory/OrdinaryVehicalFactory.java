package Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.VehicalFactory;

import Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.Vehicle.Maruti;
import Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.Vehicle.Swift;
import Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.Vehicle.Vehicle;

public class OrdinaryVehicalFactory extends VehicalFactory{

    public Vehicle getOrdinaryVehical(String type){
        switch (type){
            case "Maruti":
                return new Maruti();
            case "Swift":
                return new Swift();
            default:
                return null;
        }
    }
}
