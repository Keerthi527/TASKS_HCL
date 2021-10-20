public abstract class Shape {
public abstract double calculatePerimeter();
}
----------------------------------------
circle

public class Circle extends Shape {

    private static float radius;

//Constructors
public Circle(float radius) {
super();
this.radius = radius;
}


public float getRadius() {
return radius;
}
public void setRadius(float radius) {
this.radius = radius;
}



public double calculatePerimeter() {
// TODO Auto-generated method stub
return 2*3.14*radius;
}

//Getters and Setters





}
-----------------------------------------------------
square

public class Square extends Shape  {
    float side;

//constructors
public Square(float side) {
super();
this.side = side;
}
//getters and setters
public float getSide() {
return side;
}

public void setSide(float side) {
this.side = side;
}
@Override
public double calculatePerimeter() {
// TODO Auto-generated method stub
return 4*side;
}



}
------------------------------------
Main
import java.util.Scanner;

public class Abstract1{
    public static void main(String args[]) throws Exception {

             Scanner scanner = new Scanner(System.in);

        System.out.println("List of Shapes:");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.println("Enter your choice:");
        int shapeType = Integer.parseInt(scanner.nextLine());

        switch (shapeType) {
            case 1:
                System.out.println("Enter the radius of the Circle:");

                float radius = Float.parseFloat(scanner.nextLine());

                Shape circle = new Circle(radius);

                System.out.printf("The perimeter is %.2f%n",circle.calculatePerimeter());
                break;
            case 2:

                System.out.println("Enter the length of the Rectangle:");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the Rectangle:");
                float breadth = Float.parseFloat(scanner.nextLine());
                Shape rectangle = new Rectangle(length,breadth);
                System.out.printf("The perimeter is %.2f%n",rectangle.calculatePerimeter());
                break;
            case 3:
                System.out.println("Enter the side of the Square:");
                float side = Float.parseFloat(scanner.nextLine());
                Shape square = new Square(side);
                System.out.printf("The perimeter is %.2f%n",square.calculatePerimeter());
                break;
            default:
                break;
        }
       
}
}
-------------------------------------------
Rectangle
public  class Rectangle extends Shape {
    private float length;
private float breadth;

//constructors
public Rectangle(float length, float breadth) {
super();
this.length = length;
this.breadth = breadth;
}
//Getters and Setters
public float getLength() {
return length;
}
public void setLength(float length) {
this.length = length;
}

public float getBreadth() {
return breadth;
}
public void setBreadth(float breadth) {
this.breadth = breadth;
}
@Override
public double calculatePerimeter() {
// TODO Auto-generated method stub
return 2*(length+ breadth);
}



}
