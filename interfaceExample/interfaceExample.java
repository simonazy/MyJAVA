// class implementing the interface
class Triangle implements Shape{

    private double base;
    private double height; 

    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }

    @Override
    public double calculateArea(){
        return 0.5*base*height; 
    } 
}

//Another class implementing the interface
class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }
    @Override
    public double calculateArea(){
        return length*width;
    }
}

public class interfaceExample{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3,4);
        Triangle tri = new Triangle(4, 5); 

        System.out.println(rec.calculateArea());
        System.out.println(tri.calculateArea()); 

        System.out.println(Shape.DEFAULT_COLOR);
    }
}