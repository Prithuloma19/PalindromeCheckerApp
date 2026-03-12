import java.util.*;

public class PalindromePerformance {

    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static boolean twoPointerPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        long start, end;

        start = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        end = System.nanoTime();
        System.out.println("Stack Method Result: " + stackResult);
        System.out.println("Stack Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        end = System.nanoTime();
        System.out.println("Deque Method Result: " + dequeResult);
        System.out.println("Deque Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean pointerResult = twoPointerPalindrome(input);
        end = System.nanoTime();
        System.out.println("Two Pointer Result: " + pointerResult);
        System.out.println("Two Pointer Time: " + (end - start) + " ns");

        sc.close();
    }
}