package org.example;

public class ShapeFactory {
    public shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        else if(shapeType.equals("CIRCLE")){
            return new circle();
        }
        else if(shapeType.equals("SQUARE")){
            return new square();
        }
        return null;
    }
}
