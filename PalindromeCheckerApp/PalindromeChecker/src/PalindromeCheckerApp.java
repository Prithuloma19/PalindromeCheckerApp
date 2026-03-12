import java.util.Scanner;
import java.util.Stack;

public class PalindromeStackCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String original = input;

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        if (original.equals(reversed)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is NOT a Palindrome");
        }

        sc.close();
    }
}