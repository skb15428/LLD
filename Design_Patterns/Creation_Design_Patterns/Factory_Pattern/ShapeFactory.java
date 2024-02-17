package Design_Patterns.Creation_Design_Patterns.Factory_Pattern;

import Design_Patterns.Creation_Design_Patterns.Factory_Pattern.Shape.Circle;
import Design_Patterns.Creation_Design_Patterns.Factory_Pattern.Shape.Rectangle;
import Design_Patterns.Creation_Design_Patterns.Factory_Pattern.Shape.Shape;
import Design_Patterns.Creation_Design_Patterns.Factory_Pattern.Shape.Square;

public class ShapeFactory {

    Shape getShape(String type){
        switch (type){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
