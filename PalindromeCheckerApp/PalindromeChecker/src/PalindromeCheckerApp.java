import java.util.Scanner;

public class PalindromeStrategyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine().toLowerCase();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        if (strategy.checkPalindrome(input)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is not a Palindrome");
        }

        sc.close();
    }
}