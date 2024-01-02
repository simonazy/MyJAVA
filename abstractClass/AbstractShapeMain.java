abstract class AbstractShape{
    private String color;

    //Constructor 
    public AbstractShape(String color) {
        this.color = color;
    }

    // Abstract method
    public abstract double CalculateArea();

    // A concret method
    public void displayColor() {
        System.out.println("Color: "+ this.color); } 

} 

class Circle extends AbstractShape{
    private double radius;

    //Constructor
    public Circle(String color, double radius){
        super(color); 
        this.radius = radius;
    }

    @Override
    public double CalculateArea(){
        return Math.PI * Math.pow(radius,2);
    }
} 

class Square extends AbstractShape{
    private double side;

    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    public double CalculateArea(){
        return Math.pow(side, 2);
    }
}

public class AbstractShapeMain {
    public static void main(String[] args){
       Circle circle =  new Circle("red", 5);
       Square square = new Square("blue", 5); 
       
       circle.displayColor(); 
       System.out.println("Circle area: " + circle.CalculateArea());

       square.displayColor();
       System.out.println("Square area: " + square.CalculateArea());
    }
}

