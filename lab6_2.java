import java.util.Scanner;

public class lab6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // i) Change the case of the string
        System.out.print("Input: Enter a String to apply change case and revese operation: ");
        String inputString = scanner.nextLine();
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Output: The string after changing the case is: " + upperCaseString);

        // ii) Reverse the string
        StringBuilder reversedString = new StringBuilder(inputString).reverse();
        System.out.println("The string after reversing is: " + reversedString);

        // iii) Compare two strings
        System.out.print("Input: Enter the second string for comparison with the first entered string: ");
        String secondString = scanner.nextLine();
        int difference = inputString.compareTo(secondString);
        System.out.println("Output: The difference between ASCII value is: " + difference);

        // iv) Insert one string into another string
        System.out.print("Input: Enter the string to be inserted into the first string: ");
        String insertionString = scanner.nextLine();
        String insertedString = inputString + " " + insertionString;
        System.out.println("Output: The string after insertion is: " + insertedString);

        // v) Convert the string to upper case and lower case
        System.out.print("Input: Enter a String to convert into UPPER and lower case: ");
        inputString = scanner.nextLine();
        System.out.println("Output: Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());

        // vi) Check whether the character is present in the string and at which position
        System.out.print("Input: Enter a String to check whether the character is present in the string and at which position: ");
        inputString = scanner.nextLine();
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int position = inputString.indexOf(character);
        if (position != -1) {
            System.out.println("Output: Position of entered character: " + (position + 1));
        } else {
            System.out.println("Output: Entered character is not present");
        }

        // vii) Check whether the string is palindrome or not
        System.out.print("Input: Enter a String to check Palindrome: ");
        inputString = scanner.next();
        String reversedInput = new StringBuilder(inputString).reverse().toString();
        if (inputString.equalsIgnoreCase(reversedInput)) {
            System.out.println("Output: Entered string is palindrome");
        } else {
            System.out.println("Output: Entered string is not a palindrome");
        }

        // viii) Check the number of words, vowels, and consonants in the string
        System.out.print("Input: Enter a String to check the number of words, vowels, and consonants in the string: ");
        scanner.nextLine(); // Consume newline
        inputString = scanner.nextLine();
        int wordCount = inputString.split("\\s+").length;
        int vowelCount = inputString.replaceAll("[^aeiouAEIOU]", "").length();
        int consonantCount = inputString.replaceAll("[aeiouAEIOU\\s]", "").length();
        System.out.println("Output: No. of words: " + wordCount);
        System.out.println("No. of vowels: " + vowelCount);
        System.out.println("No. of consonants: " + consonantCount);

        scanner.close();
    }
}
