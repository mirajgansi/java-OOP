public class task9 {
    public static void main(String[] args) {
        Vehicle Ve= new Vehicle();
        ve.name="Car";
        Car C1= new Car("BMW", "RED");
        c1.display();
        c1.details();
    }
}
/* 
1. Write a Java program to create a class called Vehicle with a method called drive(). 
Create a subclass called Car with method display() method to print details of the Car.


Let's examine the Java program given. 
It involves multiple classes that depict different book types, 
including Book, FictionBook, NonFictionBook, and TechnicalBook. 
The Book class features a constructor and a method called displayDetails(). 
This method is responsible for outputting the title and author of a book. 
The remaining classes inherit both the constructor 
and methods of the Book class as they extend it.
*/ 
class Vehicle{
    String name;
    String color;
    public car(String name, String color){
        String name;
        String color;
        void details(String name, String color){
            this.name=name;
            this.color=color;
        }
}

    void display(){
        System.out.println("name"+name);
        System.out.println("color"+color);
    }
}
