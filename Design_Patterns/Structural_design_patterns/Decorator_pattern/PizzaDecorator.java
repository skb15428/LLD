package Design_Patterns.Structural_design_patterns.Decorator_pattern;

import Design_Patterns.Structural_design_patterns.Decorator_pattern.BasePizza.BasePizza;
import Design_Patterns.Structural_design_patterns.Decorator_pattern.BasePizza.FarmHouse;
import Design_Patterns.Structural_design_patterns.Decorator_pattern.BasePizza.Margeratta;
import Design_Patterns.Structural_design_patterns.Decorator_pattern.BasePizza.VeggieDelight;
import Design_Patterns.Structural_design_patterns.Decorator_pattern.Toppings.ExtraCheese;
import Design_Patterns.Structural_design_patterns.Decorator_pattern.Toppings.Mushroom;
import Design_Patterns.Structural_design_patterns.Decorator_pattern.Toppings.Paneer;

public class PizzaDecorator {
    public static void main(String args[]){
        BasePizza paneerPizza = new ExtraCheese(new Paneer(new Margeratta()));

        System.out.println(paneerPizza.cost());

        BasePizza mushroomPizza = new ExtraCheese(new Mushroom(new VeggieDelight()));

        System.out.println(mushroomPizza.cost());
    }
}
