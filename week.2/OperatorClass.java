public class OperatorClass {
    public static void main(String[] args) {
        //Arithmetic Operator
        int a= 10, b=10;
        int sum= a+b; // here the "+" is arithmetic operator
        System.out.println("Addition fo a+b is"+ sum);
        System.out.println("Difference for a-b is:"+(a-b));
        System.out.println("MUltiplication fo a*b: "+(a*b));
        System.out.println("Division of a/b:"+(a/b));
        System.out.println("modulo for a and b:"+(a%2));

        // Assigment Operator
        int aNumber1;
        aNumber1 =10;
        // or declare  and assign
        int aNumber2=20;
        // assigne with anther variable
        int aNumber3=aNumber1;
        System.out.println("Assigment wiht +=" +(aNumber1+=10));
        aNumber2 -=30; // same as aNumber2= aNumber2 -30;
        System.out.println("Assigment with -="+aNumber2);

        // Relation operator
        int rNumber1=10, rNumber2=20;
        System.out.println("rNumber1 equals to rNUmber 2?"+(rNumber1==rNumber2));
        System.out.println("rNumber1 greater then rNumerb2?" +(rNumber1 >rNumber2));
        System.out.println("rNumber less then or equals ot rNumber2?"+(rNumber1<=rNumber2));
        System.out.println("rNumber not equals to rNumber2"+(rNumber1!=rNumber2));

        //Logical operator
        int lNumber1= 10,lNumber2=12;
        boolean lexpression1=lNumber1 == lNumber2;
        boolean lexpression2= lNumber1<=lNumber2;
        System.out.println("And operator uses &&"+(lexpression1 && lexpression2));
        System.out.println("or operator uses ||"+(lexpression1 || lexpression2));
        System.out.println("not oprator uses !"+ ! lexpression2);

        //urinary Operator
        int uNumber1= 10;
        uNumber1++;//meaning uNumber1=uNumber1+1;

        System.out.println("Urinary for increament is +++"+uNumber1);
        uNumber1--;
        //Ternary operator
        int tNumber1=10, tNumber2=10;
        boolean tExpression =tNumber1 == tNumber2;

        /*one line if else, see the given eample in if else
         * string output
         * if(tExpression==true){
         * output="true statement";
         * }esle{
         * output="flase statement";
         * }
         */
        String output=tExpression ?"true statment":"fasle statment";
        /*here we can assign a strin out with one expression
         * is expression is true it will return the calue afther the "?"
         * if the exression is false it will reutn the value afyher the";"
         */
        int numberOutput=tNumber1<tNumber2 ?10:20;
        System.out.println(output);
        System.out.println(numberOutput);
        /*task 1
         * write  program to print wheater a variable is greater or equal to 18
         */
        int gNumber1=10,gNumber2=18;
        boolean numberOutput1= gNumber1<=gNumber2;
        System.out.println(numberOutput1);
            /*task 2
             * WAP a program to print simple interst from variable
             * make 3 variable for amout, time and rate and save calculation into a vairable
             * formul:
             * sl:a*t*r/100
             */

        int sAmout=10, sTime=1, sRate=100;
        System.out.println("simple intrest is:"+((sAmout+sTime+sRate)/100));
        /* task 3
         * WAP to print the area and periment of rectangle
         * a=l*b
         * p=2(l+b)
         */
        int alenght=10,aBreath=20;
        System.out.println("area of rectangle is:"+(alenght*aBreath));
        System.out.println("perimenter of rectangle is:"+(2*(alenght+aBreath)));
        /*task 4
         * complete the task 1 using ternary
         */
        int tNUmber=tNumber1<=tNumber2 ?10:18;
        System.out.println(tNUmber);
        
    }

}
