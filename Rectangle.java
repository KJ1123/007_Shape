public class Rectangle extends Shape{
    //data fields
    private double length; //length of rectangle
    private double width; //width of rectangle 
    private static int numRects = 0; //to hold the number of rectangle objects created

    //default constructor
    public Rectangle(){
        super("Rectangle");
        numRects++;
    }

    //one arg constructor - double 
    public Rectangle(double length){
        super("Rectangle");
        this.length = length;
        numRects++;
    }

    //3 arg constructor 
    public Rectangle(String color, double length, double width){
        super(color, "Rectangle");
        this.length = length;
        this.width = width;
        numRects++;
    }

    //one arg constructor - string 
    public Rectangle(String color){
        super(color, "Rectangle");
        numRects++;
    }

    //getter methods
    //get length
    public double getLength(){
        return length;
    }
    
    //get width
    public double getWidth(){
        return width;
    }

    //get numRects
    public int getNumRects(){
        return numRects;
    }

    //setter methods
    //set length
    public void setLength(double length){
        this.length = length;
    }

    //set width
    public void setWidth(double width){
        this.width = width;
    }

    @Override
    //overide computeArea() from parent Class
    //compute area of a rectangle 
    public double computeArea(){
        double area = length * width;
        return area;
    }

    @Override
    //override computePerimeter() from parent class
    //compute perimeter of a rectangle
    public double computePerimeter(){
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    @Override
    //overide toString() from parent class 
    //returns information about the shape 
    public String toString(){
        return super.toString() + " Length: " + length + " Width: " + width + " Area: " + computeArea() + " Perimeter: " + computePerimeter();
    }

}