package week5;
public class FunctionClass {
 /*write a fucntion inside a class */
 void printSomthing(){
    System.out.println("This is funciton parts");

}
/* In ths function  void  means nothing/null */
int returnInteger(){
    int returnThis=1;
    return returnThis;
}
    /*with retn  and params */
    boolean returnString(int num1,int num2){
        boolean check= num1==num2;
        return check;
    }

    public static void main(String[] args) {
        /*To se a fucntion you need to mae object
         * note: just rememeber the syntax for now
         */
        FunctionClass fc= new FunctionClass();
        fc.printSomthing();
        /*You can call this function in need */
        fc.printSomthing();
        /* if a function has a reutn type other than vod we can save it */
        int callIntFunction= fc.returnInteger();
        System.out.println("Funciton withe return int"+ callIntFunction);
        /*if a function has a return tyoe itger than void we can saave it */
        callIntFunction=fc.returnInteger();
        boolean callReturnSting=fc.returnString(10,20);
        System.out.println("function with return int"+callIntFunction);
    }
}
