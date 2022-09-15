package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = CreateFactory.getFactory("SHAPE");
        AbstractFactory colorFactory = CreateFactory.getFactory("COLOR");

        Shape cir = shapeFactory.getShape("CIRCLE");
        cir.draw();

        Color col = colorFactory.getColor("BLUE");
        col.fill();
    }
}