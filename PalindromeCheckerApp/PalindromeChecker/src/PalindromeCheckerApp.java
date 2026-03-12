import java.util.Scanner;

public class LinkedListPalindromeChecker {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public static void insert(char ch) {
        Node newNode = new Node(ch);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf;

        if (fast != null) {
            secondHalf = reverse(slow.next);
        } else {
            secondHalf = reverse(slow);
        }

        Node firstHalf = head;
        Node tempSecond = secondHalf;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        head = null;

        for (int i = 0; i < input.length(); i++) {
            insert(input.charAt(i));
        }

        if (isPalindrome()) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is not a Palindrome");
        }

        sc.close();
    }
}