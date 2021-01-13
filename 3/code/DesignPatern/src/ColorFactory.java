package com.company;

public class ColorFactory implements AbstractFactory {
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equals("RED")) {
            return new Red();
        } if (color.equals("BLUE")) {
            return new Blue();
        }
        return null;
    }


}
