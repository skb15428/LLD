package Design_Patterns.Behavioural_design_patterns.Strategy_pattern.FlyStrategy;

public class FlyNoWay implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
