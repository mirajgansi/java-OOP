package week4;

import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        int num1= 0;
        while (num1<0) {
            System.out.println("while checks condtion first");
        }
        /* do while checks condition after first interation */
        do{
            System.out.println("Do while  checks condition after");
        }while(num1>0);
        /*This means do while loop runs atleast once */
        /*task
         use a while loop to 
         * ask user for an int value
         * promt user to iput negative value
         * loop until the user input negaive int vale
         */
         System.out.println("Enter an value");
         Scanner  scan= new Scanner(System.in);
         int inptValue= scan.nextInt();
         while(inptValue>0)      
         {
            System.out.println("add negative value");
            inptValue=scan.nextInt();
         }
         System.out.println("loop end");
         scan.close();
    }
    
}
