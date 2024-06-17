package week9;

public class InheritanceContructor {
public static void main(String[] args) {
    TShirt ts1= new TShirt();
    ts1.nameDifference("New");
    TShirt ts2= new TShirt("My shirt");
    pant p1= new pant("wool","red");
    haftPant hp1 = new haftPant();
    hp1.changePant("blue");
}
}
    
class Shirt{
    String name="parent shirt";//super.name
    String type;
    Shirt(){
        System.out.println("Parent Constructor");
    }
    Shirt(String name){
        this.name= name;
        System.out.println("Parent Constructor with string params");
    }
}

class TShirt extends Shirt{
    String name="Class shirt";//this.name
    TShirt(){
        // default parent contructor is called automatically
        // super() or shirt()
        super("parent Name");
        System.out.println("chid Constructor");
    }
// Overloading
// Same name function with difference 
 TShirt(String name){
    this.name=name;
    System.out.println("Constructor with string params");
 }
 TShirt(int number){

 }
 TShirt(String name,int number){

 }

void nameDifference(String name){
    System.out.println("Param name"+name);
    System.out.println("Class name"+this.name);
    System.out.println("Parent Name"+super.name);
}
}

//Make a class pant
// make 2 attribute, texture and color
// Make a class haftPant that extends pant
// make 1 attribute color"
//make a Constructor of pant that take stexture and color
// parent parameterized Constructor,"wool" and "red"
// and function in haftpant called changePant
//take color as params, and set the current color of pant to halfpant
//and change the new color to haft

class pant{
    String texture;
    String color;
    pant(string texture, String color ){
        this.texture=texture;
        this.color= color;
        
    }
    
}

class haftPant extends pant{
    String color;
    haftPant(){
        super("wool","red");
    }
    void changePant(String color){
        super.color= this.color;
        this.color=color;
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




