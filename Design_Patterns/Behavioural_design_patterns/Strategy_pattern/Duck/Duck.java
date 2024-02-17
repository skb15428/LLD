package Design_Patterns.Behavioural_design_patterns.Strategy_pattern.Duck;

import Design_Patterns.Behavioural_design_patterns.Strategy_pattern.FlyStrategy.FlyStrategy;
import Design_Patterns.Behavioural_design_patterns.Strategy_pattern.QuackStrategy.QuackStrategy;

public abstract class Duck {
    FlyStrategy flyStrategy;
    QuackStrategy quackStrategy;

    public Duck(FlyStrategy flyStrategy, QuackStrategy quackStrategy){
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
    }

    public abstract void display();

    public void performFly(){
        flyStrategy.fly();
    }

    public void performQuack(){
        quackStrategy.quack();
    }

    public void swim(){
        System.out.println("I am Swimming");
    }
}
