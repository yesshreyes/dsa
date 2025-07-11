package linkedList;

public class PalindromeSlowFast {
    /* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

    class Solution {
        static boolean isPalindrome(Node head) {
            if (head == null || head.next == null) return true;

            Node middle = findMiddle(head);
            Node secondHalf = reverse(middle);
            Node firstHalf = head;

            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

        public static Node findMiddle(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public static Node reverse(Node head){
            Node prev = null;
            Node curr = head;
            while (curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }
}
