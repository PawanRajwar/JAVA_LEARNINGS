
//Take name as input and print a greeting message for that particular name.

package Assignments.First_Java;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        input.close();
        
    }
    
}
