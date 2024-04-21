public class Varialbe {

    /*Instance variable 
    *Will eed object to acess this variable
    *Not shared between the object
    */

    int instanceVarialbe= 100;

    /*  Static/Class variable
    *no nee of object can be called from class
    * Shared between the object */

    static int staticVariable=20;
    public static void main(String[] args) {

        /* Primitive data type */ 
       
        byte byteValue;
        // Initailize
        byteValue=100;

        // Declearation and Intialization
        short shortVariable=200;

        // Multiple decleration 
        int intValue1, intValue2;
        intValue1=10000;
        intValue2=2000;
    
        //multiple declearation and initializing 
        long longVal1= -9000, longVal2=9000;
        float floatVal=90.90f; // the letter 'f' is needed
        double doubleVAL=100.1897d; // the letter 'd' is optional 
        char charVale='c'; // must use single quote ''
        boolean booleanValue=false; 

        // Illegal action below
        //byte byteValue= 100; // we can redecalare the varable
        // bytValue=200; // instead use reassignment
        //boolean boolVal2='fale'; // cannot use diferent type
        // byte byteValue2=10000000; // cannot excceed min and max

        /* NON PRIMITIVE DATA TYPE */

        String stringValue="Thi is a String vaue";
        // use class
        String stringValue2= new String(original: " This string uses class");
        System.out.println(stringValue2);
        // Obect, for this we can use the same public class made
        Varialbe varialbeObject= new Varialbe();

        // user object from above to acess instace variable

        System.out.println(varialbeObject.instanceVarialbe);
        // use class to use static variable

        System.out.println(Varialbe.staticVariable);

        // type casting 
        int intValuetype= 100;
        double intValueConverteToDouble= intValuetype;
        // Automatically cast from low datatype to high datatype

        // Explicit Casting
        double doubleValueType= 190.8109;
        int doubleValueCounverteToInt=(int) doubleValueType;
        // Manually specific data type for eg(int)
        // Note this type cast can only be done in primitive data type
        /*Task
         * Make one double variabe called doubleVar1=1000.12
         * explicityly cast the vaiable int0 float, floatVar1
         * explicitly cast the floatVar1 into int, intVar1
         * make a String variable with "THe interger is"
         * Print the String variable and print the innt variabe in another
         */

        double doubleVar1= 1000.12;
        float floatVar1 =(float) doubleVar1;
        int intVar1=(int) floatVar1;
        String info="The inter is";
        System.out.println(info);
        System.out.println(intVar1);

    }
    
}
