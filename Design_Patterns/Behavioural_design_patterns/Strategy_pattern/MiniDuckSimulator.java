package Design_Patterns.Behavioural_design_patterns.Strategy_pattern;

import Design_Patterns.Behavioural_design_patterns.Strategy_pattern.Duck.Duck;
import Design_Patterns.Behavioural_design_patterns.Strategy_pattern.Duck.MallardDuck;
import Design_Patterns.Behavioural_design_patterns.Strategy_pattern.Duck.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String args[]){
        Duck mallard = new MallardDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("-------------------------------------------------------");

        Duck rubber = new RubberDuck();

        rubber.display();
        rubber.performFly();
        rubber.performQuack();
    }
}
