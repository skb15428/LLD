package Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.VehicalFactory;

import Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.Vehicle.*;

public class LuxuaryVehicalFactory extends VehicalFactory{
    public Vehicle getLuxaryVehical(String type){
        switch (type){
            case "Mercedes":
                return new Mercedes();
            case "Bmw":
                return new Bmw();
            default:
                return null;
        }
    }
}
