package main;

import geometry.*;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Circle circle1 = new Circle("Blue", true);
        circle1.setRadius(30.5);
        System.out.println(circle1.toString());
        
        Rectangle rectangle1 = new Rectangle("Red", true);
        rectangle1.setLength(20.0);
        rectangle1.setWidth(10.0);
        System.out.println(rectangle1.toString());
        
        Square square1 = new Square("Green", true);
        square1.setLength(10.0);
        square1.setWidth(10.0);
        System.out.println(square1.toString());
        
        
    }

}
