package linkedList;

import java.util.HashSet;

public class RemoveDuplicatesUnsorted {
    public static Node removeDuplicates(Node head) {
        if (head == null) return null;

        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next; // Remove duplicate
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);

        System.out.println("Before:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("After:");
        printList(head);
    }
}
