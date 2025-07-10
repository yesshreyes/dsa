package linkedList;

public class AddOne {

    public static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static Node addOne(Node head) {
        head = reverse(head);
        Node temp = head;
        int carry = 1;

        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;
            if (carry == 0) break;
            if (temp.next == null && carry > 0) {
                temp.next = new Node(carry);
                break;
            }
            temp = temp.next;
        }

        return reverse(head);
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);

        head = addOne(head);
        System.out.println("After adding one:");
        printList(head);
    }
}
