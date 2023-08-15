import java.util.Scanner;

public class ShapeTest{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        //an array of shapes that includes refrences to all types of shape objects
        Shape[] shapes = new Shape[4];
        
        //allows user to manually create a variety in the array
        fillShapes(shapes, scnr);

        //display array
        for(Shape values: shapes){
            System.out.println(values + " ");
        }
        
        Triangle tri = new Triangle(4.0);
        Rectangle rect = new Rectangle(3.5);
        Circle circle = new Circle("Blue");

        tri.setX(2.0);
        tri.setY(5.7);

        rect.setColor("Green");
        
        circle.setRadius(4.2);

        System.out.println(tri.toString());
        System.out.println(rect.toString());
        System.out.println(circle.toString());
        for(int i = 0; i < shapes.length; i++){
            shapes[i].toString();
        }
        //total perimeter 
        double perimeter = 0;
        for(int i = 0; i < shapes.length; i++){
            perimeter += shapes[i].computePerimeter();
            perimeter += tri.computePerimeter();
            perimeter += rect.computePerimeter();
            perimeter += circle.computePerimeter();
        }
        System.out.println("Total Perimeter: " + perimeter);

        //total area 
        double area = 0;
        for(int i = 0; i < shapes.length; i++){
            area += shapes[i].computeArea();
            area += tri.computeArea();
            area += rect.computeArea();
            area += circle.computeArea();
        }
        System.out.print("Total Area: " + area);
    }

    //user enters shapes
    public static void fillShapes(Shape[] array, Scanner scnr){
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a shape (Triangle, Rectangle, Circle):");
            String temp = scnr.next();

            if(temp.equals("Triangle")){ 
                array[i] = new Triangle("Red", 3.4, 2.1);
            }
            else if(temp.equals("Circle")){
                array[i] = new Circle("Purple", 4.5);

            }
            else if(temp.equals("Rectangle")){
                array[i] = new Rectangle("Pink", 3.2, 5.2);

            }
            else{
                System.out.println("Error. Invalid. Try Again.");
                String clear = temp;
            }
        }
    }
        
    

    //valid(Scanner scan) Method: Validate if user inputed positive double value
    public static double validDouble(Scanner scan){
        double value = 0.0;
        boolean loopControl = true;
        do{
            if(scan.hasNextDouble()){
                value = scan.nextDouble();
                scan.nextLine();
                if(value > 0.0){
                    loopControl = false;
                }
                else{
                    System.out.println("Has to be positive. Invalid.");
                }
            }
            else{
                System.out.println("Not a double. Invalid");
                scan.nextLine();
            }
        } while (loopControl);

        return value;
    }

}