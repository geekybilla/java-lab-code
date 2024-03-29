import java.util.Scanner;
public class lab8c {
public static boolean isPalindrome(String str) {
if (str == null || str.length() == 0 || str.length() == 1)
            return true;
if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;
       return isPalindrome(str.substring(1, str.length() - 1));
       }
   public static void main(String[] args) {
	   System.out.print("Enter a String to check Palindrome: ");
	   Scanner s=new Scanner(System.in);
       String input = s.nextLine();
       if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
      }
}