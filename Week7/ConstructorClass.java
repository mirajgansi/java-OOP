package Week7;

public class ConstructorClass {
    public static void main(String[] args) {
        ConExample con1= new ConExample();
        System.out.println("After object creation");
        ParameterizedConstructor pc1= new ParameterizedConstructor(10);
        System.out.println("from object:" +pc1.lenght);

        FruitBasket fb= new FruitBasket(1, 20, 30);
        int TotalFruit=  fb.totalFruit();
        System.out.println(fb.totalFruit());
    }
}

class ConExample{
    ConExample(){
        System.out.println("This is non parameterized contrusctor");

    }
}

class ParameterizedConstructor{
    int lenght;
    ParameterizedConstructor(int lenght){
        this.lenght=lenght;
        System.out.println(this.lenght);
    }
}
//task
/*Make a class FruitBasket
 make private attribute ,appleCount, cheeryCount, grapecount
 make Contrustor and set all attribute
 make a function that returns total cont of fruits
 make 2 objectss
  print the total counts of all object
  */ 

class FruitBasket{
    int appleCount;
     int cheeryCount;
     int grapecount;
    FruitBasket(int appleCount, int cheeryCount, int grapecount){
        this.appleCount=appleCount;
        this.cheeryCount= cheeryCount;
        this.grapecount= grapecount;
        // System.out.println(this.appleCount);
        // System.out.println(this.cheeryCount);
        // System.out.println(this.grapecount);
    }

    int totalFruit(){
        return this.appleCount+this.cheeryCount+this.grapecount;
    }
}