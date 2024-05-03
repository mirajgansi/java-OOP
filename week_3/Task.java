package week_3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
    
//     Task To Do

// 1. Write a JAVA program to find the maximum between three numbers.
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the maximum number
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Print the maximum number
        System.out.println("The maximum number is: " + max);

    // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
    System.out.print("Enter a number: ");
    int number3 = scanner.nextInt();

    // Check if the number is negative, positive, or zero
    if (number3 < 0) {
        System.out.println("The number is negative.");
    } else if (number3 > 0) {
        System.out.println("The number is positive.");
    } else {
        System.out.println("The number is zero.");
    }
// 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
System.out.print("Enter a number: ");
int number4 = scanner.nextInt();

// Check if the number is divisible by 5 and 11
if (number4 % 5 == 0 && number4 % 11 == 0) {
    System.out.println("The number is divisible by both 5 and 11.");
} else {
    System.out.println("The number is not divisible by both 5 and 11.");
}
// 4. Write a JAVA program to check whether a number is even or odd.
System.out.print("Enter a number: ");
        int number5 = scanner.nextInt();

        // Check if the number is even or odd
        if (number5% 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }


// 5. Write a JAVA program to check whether a year is a leap year or not.

// Hint: if year%4==0; if year%100!==0 ; year%400==0; 
System.out.print("Enter a year: ");
int year = scanner.nextInt();

// Check if the year is a leap year
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    System.out.println(year + " is a leap year.");
} else {
    System.out.println(year + " is not a leap year.");
}

// 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.

System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        // Check if the input is a vowel or a consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }


// Some Switch case Statements Questions:

// 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.
System.out.print("Enter the student's grade (A, B, C, D, or F): ");
char grade = scanner.next().charAt(0);

// Convert grade to GPA using switch case
double gpa;
switch (grade) {
    case 'A':
    case 'a':
        gpa = 4.0;
        break;
    case 'B':
    case 'b':
        gpa = 3.0;
        break;
    case 'C':
    case 'c':
        gpa = 2.0;
        break;
    case 'D':
    case 'd':
        gpa = 1.0;
        break;
    case 'F':
    case 'f':
        gpa = 0.0;
        break;
    default:
        System.out.println("Invalid grade entered.");
        return;
}

// Print the GPA value
System.out.println("The GPA value for grade " + grade + " is: " + gpa);

// 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.
System.out.print("Enter first number: ");
double numOne= scanner.nextDouble();
System.out.print("Enter second number: ");
double numSecond= scanner.nextDouble();

// Input the operator
System.out.print("Enter an operator (+, -, *, /): ");
char operator = scanner.next().charAt(0);

double result;

// Perform the arithmetic operation based on the operator
switch (operator) {
    case '+':
        result = numOne+ numSecond;
        break;
    case '-':
        result = numOne - numSecond;
        break;
    case '*':
        result = numOne * numSecond;
        break;
    case '/':
        if (numSecond != 0) {
            result = numOne/ numSecond;
        } else {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        break;
    default:
        System.out.println("Invalid operator entered.");
        return;
}

// Print the result
System.out.println("Result: " + result);
// 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
System.out.print("Enter a month (1 to 12): ");
int month = scanner.nextInt();

// Determine the season based on the month using switch case
String season;
switch (month) {
    case 1:
    case 2:
    case 3:
        season = "Winter";
        break;
    case 4:
    case 5:
    case 6:
        season = "Spring";
        break;
    case 7:
    case 8:
    case 9:
        season = "Summer";
        break;
    case 10:
    case 11:
    case 12:
        season = "Fall";
        break;
    default:
        season = "Invalid month";
        break;
}

// Print the season
System.out.println("The season for month " + month + " is " + season);

// 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.
System.out.println("Calculate Area of Shapes");
System.out.println("1. Circle");
System.out.println("2. Rectangle");
System.out.println("3. Square");
System.out.println("4. Triangle");
System.out.print("Enter your choice (1-4): ");
int choice = scanner.nextInt();

// Variables for storing dimensions
double radius, length, width, side, base, height, area;

// Calculate area based on choice
switch (choice) {
    case 1:
        // Calculate area of circle
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        break;
    case 2:
        // Calculate area of rectangle
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
        area = length * width;
        System.out.println("Area of the rectangle: " + area);
        break;
    case 3:
        // Calculate area of square
        System.out.print("Enter the side length of the square: ");
        side = scanner.nextDouble();
        area = side * side;
        System.out.println("Area of the square: " + area);
        break;
    case 4:
        // Calculate area of triangle
        System.out.print("Enter the base length of the triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
        area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
        break;
    default:
        System.out.println("Invalid choice.");
}

scanner.close();
}
    }

