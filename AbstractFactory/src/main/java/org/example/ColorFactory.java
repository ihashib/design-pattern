package org.example;

public class ColorFactory extends AbstractFactory{
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if(color.equals("BLUE")){
            return new Blue();
        }
        else if(color.equals("GREEN")){
            return new Green();
        }
        return null;
    }
}
