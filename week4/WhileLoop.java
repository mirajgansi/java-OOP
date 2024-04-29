package week4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int count=0;
        /* while takse boolean expression inside()
        the loop wll run repeatatively when the boolean is true
        if the boolean is false the lop wil end */
        while(count<5){
            System.out.println("while loop"  +count);
            ++count;
        }
        /* In while loop the coundition is checked at he begining
         * if the condition is false in initail check the loop will not run
         */
        System.out.println(" Please type the value between 0-100");
        Scanner scan= new Scanner(System.in);
        int inptValue= scan.nextInt();
        while(inptValue<0 && inptValue>100){
            System.out.println(" Please input between 0-100");
            inptValue=scan.nextInt();
        }
        System.out.println("End loop");
        scan.close();
    }
}
