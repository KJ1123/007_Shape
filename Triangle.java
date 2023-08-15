public class Triangle extends Shape{
    //data fields
    private double base; //size of base of triangle
    private double height; //size of height of triangle
    private double x; //first length of side of triangle
    private double y; //second length of other side of the triangle
    private static int numTris = 0; //to hold the number of triangle objects created
    
    //default constructor 
    public Triangle(){
        super("Triangle");
        numTris++;
    }

    //one arg constructor - double
    public Triangle(double base){
        super("Triangle");
        this.base = base;
        numTris++;
    }

    //3 arg constructor 
    public Triangle(String color, double base, double height){
        super(color, "Triangle");
        this.base = base;
        this.height = height;
        numTris++;
    }

    //one arg constructor - string 
    public Triangle(String color){
        super(color, "Triangle");
        numTris++;
    }

    //getter methods
    //get base
    public double getBase(){
        return base;
    }
    
    //get height
    public double getHeight(){
        return height;
    }

    //get numTris
    public int getNumTris(){
        return numTris;
    }

    //get x
    public double getX(){
        return x;
    }

    //get y
    public double getY(){
        return y;
    }

    //setter methods
    //set base
    public void setBase(double base){
        this.base = base;
    }

    //set height
    public void setHeight(double height){
        this.height = height;
    }

    //set x
    public void setX(double x){
        this.x = x;
    }

    //set y 
    public void setY(double y){
        this.y = y;
    }

    @Override
    //overide computeArea() from parent Class
    //compute area of a triangle 
    public double computeArea(){
        double area = 0.5 * base * height;
        return area;
    }

    @Override
    //override computePerimeter() from parent class
    //compute perimeter of a triangle
    public double computePerimeter(){
        double perimeter = x + y + base;
        return perimeter;
    }

    @Override
    //overide toString() from parent class 
    //returns information about the shape 
    public String toString(){
        return super.toString() + " Base: " + base + " Height: " + height + " Area: " + computeArea() + " Perimeter: " + computePerimeter();
    }

}