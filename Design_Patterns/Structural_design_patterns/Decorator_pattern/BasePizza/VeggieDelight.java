package Design_Patterns.Structural_design_patterns.Decorator_pattern.BasePizza;

import Design_Patterns.Structural_design_patterns.Decorator_pattern.BasePizza.BasePizza;

public class VeggieDelight implements BasePizza {
    @Override
    public int cost() {
        return 120;
    }
}
