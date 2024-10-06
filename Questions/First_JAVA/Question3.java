
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package Assignments.First_Java;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Principal : ");
        float P = input.nextFloat();
        System.out.println("Enter the value of Time : ");
        int T = input.nextInt();
        System.out.println("Enter the value of Rate : ");
        float R = input.nextFloat();

        // Calculating Simple Interest

        float SI = (P*R*T)/100;
        System.out.println("Simple Interest is : " + SI);
        input.close();
    }
    
}
