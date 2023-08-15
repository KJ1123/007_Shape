public class Shape{
    //private data fields
    private String color; //color of the shape
    private String name; //name of the shape
    private static int numShapes = 0; //to hold the number of shpaes objects created

    //default constructor
    public Shape(){
        color = "n/a";
        name = "n/a";
        numShapes++;
    } 

    //one arg overloaded constructor
    public Shape(String name){
        this.name = name;
        color = "red";
        numShapes++;
    }

    //two arg overloaded constructor
    public Shape(String color, String name){
        this.color = color;
        this.name = name;
        numShapes++;
    }

    //getter methods
    //get color
    public String getColor(){
        return color;
    }

    //get name
    public String getName(){
        return name;
    }

    //get numShapes
    public int getNumShapes(){
        return numShapes;
    }

    //setter methods
    //set name
    public void setName(String name){
        this.name = name;
    }

    //set color
    public void setColor(String color){
        this.color = color;
    }

    //compute area - will be overidden by subclasses 
    public double computeArea(){
        return 0.0;
    }

    //compute perimeter -overidden by subclasses
    public double computePerimeter(){
        return 0.0;
    }

    //overriden methods: override toString(from the object class) to return the shape name and color??
    public String toString(){
        return "Name: " + this.name + " Color: " + this.color;
    }

}