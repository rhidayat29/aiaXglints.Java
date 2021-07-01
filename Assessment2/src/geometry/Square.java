package geometry;

public class Square  extends Rectangle{
    
    private double side;
    
    public Square(String color, boolean filled) {
        super(color, filled);
        // TODO Auto-generated constructor stub
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }
    
    @Override
    public void setLength(double side) {
        this.length = side;
    }
    
    @Override
    public String toString() {
        return  "Square [ Rectangle [ Shape [ color = "+ color + ", filled = " + filled + ", Width = " + width + ", Length = " + length + "]]]\n"
                + "Area = " + getArea() + "\n"
                + "Perimeter = " + getPerimeter()+ "\n";
        
    }
    
}
