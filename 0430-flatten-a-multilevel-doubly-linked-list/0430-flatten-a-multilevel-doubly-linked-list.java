/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {

    public Node flatten(Node head) {
        Node temp = head;
        int size = 0, index = 0;
        while (temp != null) {
            if (temp.child != null) {
                size++;
                temp = temp.child;
            } else {
                temp = temp.next;
            }
        }
        temp = head;
        if (size == 0) {
            return head;
        }

        Node contain[] = new Node[size];
        Node last = null;
        while (temp != null) {
            if (temp.child != null) {

                Node str = temp.next;
                if (str != null) {

                    str.prev = null;
                    contain[index++] = str;
                }

                str = temp.child;
                temp.next = str;
                str.prev = temp;
                temp.child = null;

            }
            last = temp;
            temp = temp.next;
        }

        for (int i = size - 1; i >= 0; i--) {
            Node conn = contain[i];
            if (conn != null) {

                last.next = conn;
                conn.prev = last;
                while (last.next != null) {
                    last = last.next;
                }
            }
        }

        return head;
    }
}