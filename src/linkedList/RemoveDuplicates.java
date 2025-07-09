package linkedList;

public class RemoveDuplicates {

    public static Node removeDuplicates(Node head){
        Node current = head;
        while (current != null && current.next != null){
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
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
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Before:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("After:");
        printList(head);
    }
}
