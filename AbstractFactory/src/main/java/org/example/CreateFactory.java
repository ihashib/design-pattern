package org.example;

public class CreateFactory{
    public static AbstractFactory getFactory(String property){
        if(property.equals("SHAPE"))
            return new ShapeFactory();
        else if(property.equals("COLOR"))
            return new ColorFactory();

        return null;
    }
}
