package org.example;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        shape cir = shapeFactory.getShape("CIRCLE");
        cir.draw();

        shape sqr = shapeFactory.getShape("SQUARE");
        sqr.draw();
    }
}