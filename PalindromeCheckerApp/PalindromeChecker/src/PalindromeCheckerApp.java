import java.util.Scanner;

public class PalindromeCharArray {

    public static boolean checkPalindrome(String text) {

        char[] characters = text.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {

            if (characters[start] != characters[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        boolean result = checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        }
        else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}