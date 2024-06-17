package week9;

import javax.sound.midi.Patch;

public class InheritanceClass {
    public static void main(String[] args) {
        childClass cc= new childClass();
        cc.lastname="test";
        cc.firstname="acv";
        cc.info();
        cc.greet();
        GrandChild gc= new GrandChild();
        gc.firstname="jhon";
        gc.middlename="foo";
        gc.lastname="Doe";
        gc.info();
        gc.call();
        uncleClass uc= new uncleClass();
        uc.job="foo";
        uc.lastname="Doe";
        uc.info();
        uc.detail();
    }

}

class ParentClass{
    String lastname;
    private int salary;
    protected String address;
    void info(){
        System.out.println("lastname: "+ lastname);
    }    
}

// extends keyboard used to create a child class
//single level, one parent has one child

class childClass extends ParentClass{
    String firstname;
    void greet(){
        System.out.println("Firstname: " + firstname +" lastname: " + lastname);
    }
}
//mutli level 
class GrandChild extends childClass{
    String middlename;
    void call(){
        System.out.println(firstname+""+middlename+""+lastname);
    }
}
//tree
class uncleClass extends ParentClass{
    String job;
    void detail(){
        System.out.println(job+""+lastname);
    }
}