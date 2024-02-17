package Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern;

import Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.VehicalFactory.LuxuaryVehicalFactory;
import Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.VehicalFactory.VehicalFactory;
import Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.Vehicle.Vehicle;

public class Main {
    public static void main(String args[]){
        VehicalFactory vehicalFactory = new VehicalFactory();

        LuxuaryVehicalFactory luxaryFactory = (LuxuaryVehicalFactory) vehicalFactory.getVehicalFactory("Luxary");

        Vehicle mercedes = luxaryFactory.getLuxaryVehical("Mercedes");

        System.out.println(mercedes.average());
    }
}
