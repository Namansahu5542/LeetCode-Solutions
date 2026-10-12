/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node Newhead = new Node(head.val);
        Node header = Newhead;
        Node temp = head.next;
        while (temp != null) {
            Node link = new Node(temp.val);
            Newhead.next = link;
            Newhead = link;
            temp=temp.next;
        }
        Newhead.next = null;
        temp = head;

        Node conn = header;
        while (temp != null) {
            Newhead = header;
            Node traverse = head;
            Node pointer = temp.random;
            while (traverse != pointer) {
                traverse = traverse.next;
                Newhead = Newhead.next;

            }
            conn.random = Newhead;
            conn = conn.next;
            temp = temp.next;
        }
        return header;
    }
}