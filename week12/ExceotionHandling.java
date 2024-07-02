package week12;

import java.lang.reflect.Array;

public class ExceotionHandling {
    public static void main(String[] args) {
        System.out.println("Program start");
    int num1=100;
    
    try{
        int num2=100/0;//exception -program ends here
        }catch (ArithmeticException e){//catch block
            System.out.println("Exception caught");
    }
    finally{
        System.out.println("I run with out exception");
    }
    int[] numArr= new int[5];
    numArr[0]=10;
    try{
        numArr[100]=20;
    }catch(ArrayIndexOutOfBoundsException ex){
        System.out.println("Array not long enough");

    }
    String data=null;
    // any class can be set to null
    try{
    System.out.println(data.length());//data.lenght()- number of charater
    }
    catch(NullPointerException ex){
        System.out.println("null value");
    }
    //multi-level try-catch
    try{
        int inD1=10;
        int inD2=10/0;
        String data2=null;
        System.out.println(data2.length());
        System.out.println("Try exit");
        }catch(ArithmeticException ex){//catch block
            System.out.println("Arithmetic Exception caught");
    }catch(NullPointerException ex){
        System.out.println("Null Exception caught");
    }
    finally{
        System.out.println("Program stops");
    }
    //student ko best exception
    try{
        int number1=10;
        int number2=20/0;
        String data3= null;
        System.out.println(data3.length());
        int [] intArr10= new int[10];
        intArr10[20]=200000;
    }catch(Exception ex){
        System.out.println("I catch any exception");
    }
    //throwExample(10);
    try{
    ensureException(); // to run this funciton, musr be inside try carch
    }
    catch(Exception ex){
        System.out.println("exception");
    }
    System.out.println("Program stops");
}
static void throwExample(int num){
    if(num<18){
        // manuallly throw an exception
        throw new ArithmeticException("Not Eligible");
    }
}
static void ensureException() throws Exception{
    System.out.println("To ru this must wrap in the catch");
}
}