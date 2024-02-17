package Design_Patterns.Structural_design_patterns.Decorator_pattern.Toppings;

import Design_Patterns.Structural_design_patterns.Decorator_pattern.BasePizza.BasePizza;
import Design_Patterns.Structural_design_patterns.Decorator_pattern.Toppings.Toppings;

public class ExtraCheese implements Toppings {
    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 10 ;
    }
}
