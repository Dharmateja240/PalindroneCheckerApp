public class PalindromeCheckerApp

{
    static void main() {
        String input = "madam";

        System.out.println("Welcome to Palindrone Checker App Management System");
        System.out.println("Modify this Logic to usecase 2");

        boolean isPalindrone = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrone = false;
                break;

            }
        }
        if (isPalindrone) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("not a plaindrome");
        }
    }
}
