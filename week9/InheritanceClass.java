package week9;

public class InheritanceClass {
    public static void main(String[] args) {
        
    }

}

class ParentClass{
    String lastname;
    private int salary;
    protected String address;
    void info(){
        System.out.println("lastname"+lastname);
    }    
}

// extends keyboard used to create a child class
//single level, one parent has one child

class childClass extends ParentClass{
    String firstname;
    void greet(){
        System.out.println("Firstname:"+ firstname+"lastname:"+lastname);
    }
}