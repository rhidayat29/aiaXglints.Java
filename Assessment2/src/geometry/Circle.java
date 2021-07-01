package geometry;

public class Circle extends Shape {
    private double radius;
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
        // TODO Auto-generated constructor stub
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        double area = radius * radius * Math.PI;
        return area;
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        double perimeter =  2 * Math.PI * radius;
        return perimeter;
    }
    
    @Override
    public String toString() {
        return  "Circle [ Shape color = "+ color + ", filled = " + filled + ", Radius = " + radius + "]\n"
                + "Area = " + getArea() + "\n"
                + "Perimeter = " + getPerimeter()+ "\n";
        
    }

}