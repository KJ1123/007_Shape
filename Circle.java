import java.lang.Math;

public class Circle extends Shape{
    //data fields
    private double radius; //radius of the circle
    private static int numCircle = 0; //to hold the number of circle objects created

    //default constructor
    public Circle(){
        super("Circle");
        numCircle++;
    }

    //one arg constructor 
    public Circle(double radius){
        super("Circle");
        this.radius = radius;
        numCircle++;
    }

    //one arg constructor to parent class
    public Circle(String color){
        super(color, "Circle");
        radius = 4.5;
        numCircle++;
    }
     
    //two arg constructor with this and parent class
    public Circle(String color, double radius){
        super(color, "Circle");
        this.radius = radius;
        numCircle++;
    }

    //getter methods
    //get radius
    public double getRadius(){
        return radius;
    }

    //get numCircle
    public int getNumCircle(){
        return numCircle;
    }

    //setter methods
    //set radius 
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    //overide computeArea() from parent Class
    //compute area of a circle 
    public double computeArea(){
        double area = Math.PI * (radius*radius);
        return area;
    }

    @Override
    //override computePerimeter() from parent class
    //compute perimeter of a cirlce
    public double computePerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    //overide toString() from parent class 
    //returns information about the shape 
    public String toString(){
        return super.toString() + " Radius: " + radius + " Area: " + computeArea()+ " Perimeter: " + computePerimeter();
    }

}