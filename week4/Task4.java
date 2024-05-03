package week4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//         1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.
       for(int i =0; i<=5;i++)
        System.out.println("Hello world");
// 2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):

// Miles    Kilometers

// 1    1.609

// 2    3.218

// …    ….

// 9    14.481

// 10    16.090


// 3. Write a program that generates the following table: 

// Number    Square

// 10    100

// 9    81

// ..    ….2    4

// 1    1
        for(int i=10;i>=1;i--){
             int multiplication=i*i; 
             System.out.println(+i  + "="+multiplication);
        }
       

// 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:

// *****

// *****

// *****

// *****

// *****
for (int i=1;i<=4;i++){
    for(int j=1;j<=5;j++){
        System.out.print("*");
        
}
    System.out.println();
}

// 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:

// Sample Run:

// Enter a positive non-zero integer 4

// Sum of 1 to 4 is 10

// Do you want to continue? Enter ‘y’ for yes or any other character for no.

// y

// Enter a positive non-zero integer 3

// Sum of 1 to 3 is 6

// Do you want to continue? Enter ‘y’ for yes and any other character for no.

// n.

     Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a positive non-zero integer: ");
            int n = input.nextInt();
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum of 1 to " + n + " is " + sum);
            System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        

// 6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:

// *

// **

// ***

// ****

// *****

// Use a nested for loop to generate the above pattern.

for (int i = 1; i <= 5; i++) {
    // Inner loop for asterisks in each row
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    // Move to the next line after each row
    System.out.println();
}


// 7. Write a program to calculate the HCF of Two given numbers.

System.out.print("Enter the first number: ");
int num1 = input.nextInt();

System.out.print("Enter the second number: ");
int num2 = input.nextInt();

int hcf = calculateHCF(num1, num2);
System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);


}

public static int calculateHCF(int a, int b) {
if (b == 0) {
    return a;
} else {
    return calculateHCF(b, a % b);
}
// 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.


System.out.print("Enter an integer: ");
int number = input.nextInt();

int reversedNumber = reverseDigits(number);

System.out.println("Reversed number: " + reversedNumber);


}


// 9. 
        System.out.print("Enter an integer: ");
        int number1 = input.nextInt();

        int reversedNumber1= reverseDigits(number1);

        System.out.println("Reversed number: " + reversedNumber);
   
// 10. Write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum of all the integers from 1 up to the number entered. For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50.
    System.out.print("Enter a positive non-zero integer: ");
        int number2 = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= number2; i++) {
            sum += i;
        }

        System.out.println("Sum of 1 to " + number2 + " is " + sum);

        input.close();
    }  
    public static int reverseDigits(int number) {
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return reversedNumber;
    }

   public static int reverseDigits1(int number1) {
     int reversedNumber1 = 0;

        while (number1 != 0) {
            int digit = number1 % 10;
            reversedNumber1 = reversedNumber1 * 10 + digit;
            number1 /= 10;
        }
            return reversedNumber1;
   }

