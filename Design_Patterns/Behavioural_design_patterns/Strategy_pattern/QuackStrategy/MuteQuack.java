package Design_Patterns.Behavioural_design_patterns.Strategy_pattern.QuackStrategy;

public class MuteQuack implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
