package week9;

public class Task {
    public static void main(String[] args) {
        Dog GermanShepard= new Dog();
        GermanShepard.legs=4;
        GermanShepard.diet="meat";
        GermanShepard.lifespan=12;
        GermanShepard.speak();
        GermanShepard.barks();
        GermanShepard.fur();
    }
}

class animal{
    int lifespan;
    void speak(){
        System.out.println("lifespan"+lifespan);
    }
}

class mammal extends animal{
    int legs;
    void fur(){
        System.out.println("legs"+legs);
    }
}

class Dog extends mammal{
    String diet;
    void barks(){
        System.out.println("diet"+diet);
    }
}
class GermanShepard extends Dog{
    
}
class labraDog extends Dog{
    
}

class Reptile extends animal{
    int egg;
    void shed(){
        System.out.println("egg"+egg);
    }
    
}

