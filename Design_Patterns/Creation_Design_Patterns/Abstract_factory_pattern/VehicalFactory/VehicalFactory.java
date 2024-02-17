package Design_Patterns.Creation_Design_Patterns.Abstract_factory_pattern.VehicalFactory;

public class VehicalFactory {
    public VehicalFactory getVehicalFactory(String type){
        switch (type){
            case "Luxary":
                return new LuxuaryVehicalFactory();
            case "Ordinary":
                return new OrdinaryVehicalFactory();
            default:
                return null;
        }
    }
}
