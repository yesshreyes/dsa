package linkedList;

public class KthNodeFromEnd {

    public static int getKthFromLast(Node head, int k) {
        int length = 0;
        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (k > length) return -1;

        temp = head;
        for (int i = 0; i < length - k; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Linked List:");
        printList(head);

        int k = 2;
        int result = getKthFromLast(head, k);
        System.out.println("Kth node from end (" + k + "): " + result);
    }
}
