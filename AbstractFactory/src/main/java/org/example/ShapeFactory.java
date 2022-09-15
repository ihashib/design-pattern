package org.example;

public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shape) {
        if(shape.equals("CIRCLE")){
            return new Circle();
        }
        else if(shape.equals("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
