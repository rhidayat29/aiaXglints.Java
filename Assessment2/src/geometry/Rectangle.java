package geometry;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(String color, boolean filled) {
        super(color, filled);
        // TODO Auto-generated constructor stub
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        double area = length * width;
        return area;
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        double perimeter = 2 * (length + width);
        return perimeter;
    }
    
    @Override
    public String toString() {
        return  "Rectangle [ Shape color = "+ color + ", filled = " + filled + ", Width = " + width + ", Length = " + length + "]\n"
                + "Area = " + getArea() + "\n"
                + "Perimeter = " + getPerimeter()+ "\n";
        
    }


}
