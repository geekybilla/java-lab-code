public class lab8b {

    public static void main(String[] args) {
        String originalString = "Hello, World!, Hello Java!";
        String substringToReplace = "Hello";
        String replacementString = "His";

        String modifiedString = originalString.replace(substringToReplace, replacementString);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}