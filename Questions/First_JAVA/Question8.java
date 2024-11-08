
// To find out whether the given String is Palindrome or not.

package Assignments.First_Java;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to check if it is palindrom or not : ");
        String str = input.nextLine();
        boolean result = isPalindrom(str);
        System.out.println("Is the string is Palindrom :  " + result);
        input.close();

    }

    public static boolean isPalindrom(String s) {

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
                }
                left++;
                right--;
                }
                return true;
       

        
    }
    
}
