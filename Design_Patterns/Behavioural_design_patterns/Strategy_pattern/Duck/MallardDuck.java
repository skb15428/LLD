package Design_Patterns.Behavioural_design_patterns.Strategy_pattern.Duck;

import Design_Patterns.Behavioural_design_patterns.Strategy_pattern.FlyStrategy.FlyWithWings;
import Design_Patterns.Behavioural_design_patterns.Strategy_pattern.QuackStrategy.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }
    @Override
    public void display() {
        System.out.println("This is Mallard duck");
    }
}
