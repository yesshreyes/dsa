package linkedList;

import java.util.Stack;

public class PalindromeStack {
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
            Stack<Integer> stack = new Stack<>();
            Node temp = head;
            while (temp != null){
                stack.push(temp.data);
                temp = temp.next;
            }
            temp = head;
            while (temp!=null){
                if(temp.data != stack.pop()){
                    return false;
                }
                temp = temp.next;
            }
            return true;
        }
    }
}
