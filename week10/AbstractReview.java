package week10;

import javax.print.attribute.standard.Sides;

/* You are building a shape hierarchy for a drawing application. Design an abstract class named "Shape" with the following abstract methods: 
calculateArea():
 This method should calculate and return the area of the shape.
  calculatePerimeter(): 
  This method should calculate and return the perimeter of the shape.
   Implement the abstract class and provide concrete implementations for the abstract methods. Create subclasses for
  different shapes such as "Circle," "Rectangle," and "Triangle." Each subclass should provide specific implementations for calculating the area 
  and perimeter of that shape. Create instances of each shape class and demonstrate how you can calculate their respective areas and perimeters. */
  public class AbstractReview{
  public static void main(String[] args ){

  }
}

abstract class Shape{
    abstract double calculatePerimeter();
    abstract double calculateArea();
}
class Circle extends Shape{
    double radius=10;
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double calculateArea() {
       return 2 * Math.PI * radius;
    }
  
}
class Rectangle extends Shape{
double l=10;
double b=10;
    @Override
    double calculatePerimeter() {
        return l*b;
    }

    @Override
    double calculateArea() {
       return  2*(l*b);
    }

}

class Triangle extends Shape{
double  lenght=1;
double breath=2;
double height=1;
double sidea=2;
double sideb=3;
double sidec=4;
    @Override
    double calculatePerimeter() {
      return  sidea+sideb+sidec;
    }

    @Override
    double calculateArea() {
      return 1/2*(breath*height);
    }
    
}