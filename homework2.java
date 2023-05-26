package a1;

public class LinkedList {
    public Node head;
    public class Node {
        public Node next;
        public int value;
    }
    public void reverse() {
        if (head != null && head.next != null ) {
            Node temp = head;
            reverse(head.next, head);
            temp.next = null;
        }
    }
    public void reverse(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            reverse(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }
}
