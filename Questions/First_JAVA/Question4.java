
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package Assignments.First_Java;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float num1 = input.nextFloat();
        System.out.println("Enter the second number : ");
        float num2 = input.nextFloat();
        input.nextLine();
        System.out.println("Enter the opreator  (+, -, *, /) : ");
        String operator = input.nextLine();

        float result = 0;

        if ( operator.equals("+" )) {

            result = num1 + num2;
            System.out.println("Result is : " + result);
    
        }
        else if ( operator.equals("-")) {
            result = num1 - num2;
            System.out.println("Result is : " + result);
            
        }
        else if ( operator.equals("*")) {

            result = num1 * num2;
            System.out.println("Result is : " + result);
        }
        else if ( operator.equals("/")) {
            if ( num2  != 0 ) {

            result = num1 / num2;
            System.out.println("Result is : " + result);
            }

            else {
                System.out.println("Divison is not allowed");
            }
        }
        else{
            System.out.println("Invalid operator");
        }

        input.close();

    }
    
}

