package linkedList;

public class LastToFront {

    static Node moveToFront(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node secLast = null;
        Node last = head;
        while (last.next != null) {
            secLast = last;
            last = last.next;
        }
        secLast.next = null;
        last.next = head;
        head = last;
        return head;
    }


    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Linked list before: ");
        printList(head);

        head = moveToFront(head);

        System.out.println("Linked list after: ");
        printList(head);
    }
}
