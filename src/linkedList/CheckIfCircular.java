package linkedList;

public class CheckIfCircular {

    public static boolean isCircular(Node head){
        if (head == null) return false;

        Node temp = head.next;
        while (temp != null && temp != head) {
            temp = temp.next;
        }

        return temp == head;
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

        boolean result = isCircular(head);
        System.out.println("Is Linked List Circular? " + result);

    }
}
