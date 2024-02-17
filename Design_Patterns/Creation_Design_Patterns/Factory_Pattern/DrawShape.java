package Design_Patterns.Creation_Design_Patterns.Factory_Pattern;

import Design_Patterns.Creation_Design_Patterns.Factory_Pattern.Shape.Shape;

public class DrawShape {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");

        circle.draw();
    }
}
