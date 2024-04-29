// Task To Do

import java.util.Scanner;

public class Task{
    public static void main(String[] args) {
        // 1. Write a JAVA program to find the maximum between three numbers.
        int a=0;
        int b= 4;
        int c=10;
        if(a>b && a>b){
            System.out.println("a is maximum number");
        }else if (b>c &&b>a){
                System.out.println("b is maximum number");
        }else{
            System.out.println("c is maximum number");
        }
    // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
    if(a==0){
        System.out.println("zero");
    }else if (a<0){
            System.out.println("negative");
    }else{
        System.out.println("positive");
    }
    // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
    if(b%5==0 && b%11==0){
        System.out.println("is divisible by 5 and 11");
    }else{
        System.out.println("not");
    }
    // 4. Write a JAVA program to check whether a number is even or odd.
    if(b%2==0){
        System.out.println("even");
    }else{
        System.out.println("odd");
    }
    // 5. Write a JAVA program to check whether a year is a leap year or not. 
// Hint: if year%4==0; if year%100!==0 ; year%400==0; 
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a year: ");
int year = scanner.nextInt();


if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    System.out.println(year + " is a leap year.");
} else {
    System.out.println(year + " is not a leap year.");
}
// 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
   
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }   
}
}
