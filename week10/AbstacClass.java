package week10;

public class AbstacClass {
    public static void main(String[] args) {
        
    }

}

// to make abstract class, use abstact keword before "class"
// if a class is abstract, it cannot be make object of

abstract class SmartPhone{
    // abstract function do not have a body
    // abstract class may ir may not contain abastract funtion
    abstract public void Call();
    abstract public void message();
    abstract public boolean text(String text);
}
// to use abstract class it has to be extended into sub/child class
class Samsung extends SmartPhone{
//When abstract class is extended
//all the abstarct fucntion must be overriden/implemented

    @Override
    public void Call() {
       System.out.println("Calling from Samsung phone");
    }

    @Override
    public void message() {
       System.out.println("Samsung Message");
    }

    @Override
    public boolean text(String text) {
    return true;
    }
}
// Task create a class Aplle that extends SmarTPHONE
// orride the funtion
// and call all the fntiosn
abstract class Apple {
    abstract public void calls();
    abstract public void messages();
    abstract public boolean texts(String text);
}

class Iphone extends Apple{

    @Override
    public void calls() {       
        System.out.println("Calling from Ihpone phone");


    }

    @Override
    public void messages() {
        System.out.println("message  from Iphone phone");

    }

    @Override
    public boolean texts(String text) {
        return true;
    }

}