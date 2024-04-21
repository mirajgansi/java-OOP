import java.util.Scanner; 
/*OR USE 
import java.util.*;
 */
public class InputOutpur {
    public static void main(String[] args) {
        
        /* User Output */
        System.out.println("This sentence will jhave line break");
        /*System.out.print */   
        System.out.print("this will not have break");
        System.out.print("this line will continue. \n");
        /*String formatting using System.out.print
         * %s String. %d integer,%f float pint, %b boolean
         * This will also not break line
         */
        System.out.printf("Hello %s, good morning","world");
        System.out.printf("The number is %d", 10);
        /*can use multiple formatter */
        System.out.printf("\n The floating %f an boolean %b",3f,false);
        /*user Input
         * import java.util.Scanner; // copy this line at the top of the code 
         */
        // Scanner scan= new Scanner(System.in);

        // System.out.println("The following take whole sentence");
        // String wholeOUtput=scan.nextLine();
        // System.out.println("the input taken is"+ wholeOUtput);
        // System.out.println("the folowing  take integer");
        // int intInput= scan.nextInt();
        // System.out.println("the input taken is"+ intInput);
        // System.out.println("the followingtake double");
        // double doubleInput= scan.nextDouble();
        // System.out.println("The input yaken is "+ doubleInput);
        // System.out.println("the following takes boolean");
        // boolean booleanInput= scan.nextBoolean();
        // System.out.println("The inpt taken is "+ booleanInput);
        // scan.close(); // you must close the scanner once all input is done
        /* Task 
         * Make a new saner obec scanl
         * prompt the following and take inout
         * what is you name? save the input to scting--> name
         * are your over 18? sace the input to boolean--> status
         * how many siblings ? save the input in integer -->
         * print the follwoinf
         * hello name.
         * iver 19> status
         * you have sibling number of sibling
        */
        
        Scanner scanl= new Scanner(System.in);
        System.out.println(" what is your name?");
        String nameOutput=scanl.nextLine();
        System.out.println("hello"+nameOutput);
        System.out.println("are your over 18?");
        boolean ageOutput=scanl.nextBoolean();
        System.out.println("over 18?"+ageOutput);
        System.out.println("how many siblings?");
        int siblingOutput= scanl.nextInt();
        System.out.println("you have sibling number of sibling"+ siblingOutput +"sibling");
        scanl.close();



    }
}
