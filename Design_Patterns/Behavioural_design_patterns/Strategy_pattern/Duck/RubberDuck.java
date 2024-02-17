package Design_Patterns.Behavioural_design_patterns.Strategy_pattern.Duck;

import Design_Patterns.Behavioural_design_patterns.Strategy_pattern.FlyStrategy.FlyNoWay;
import Design_Patterns.Behavioural_design_patterns.Strategy_pattern.QuackStrategy.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck(){
        super(new FlyNoWay(), new Squeak());
    }
    @Override
    public void display() {
        System.out.println("This is rubber duck");
    }
}
