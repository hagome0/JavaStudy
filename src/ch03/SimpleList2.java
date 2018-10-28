package ch03;

public class SimpleList2 {
    Node head, tail;
    public void addFirst(int i) {
        Node newNode = new Node(i);
        if (head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int i) {
        Node newNode = new Node(i);
        if (head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail =  newNode;
        }
    }

    public void removeFirst() {
        if (head==null){
            System.out.println("Empty");
            return;
        }
        else {
            Node p = head;
            head = head.next;
            head.prev = null;
            p.next = null;
        }
    }

    public void removeLast() {
        if (tail==null){
            System.out.println("Empty");
            return;
        }
        else {
            Node p = tail;
            tail = tail.prev;
            tail.next = null;
            p.prev = null;
        }
    }

    @Override
    public String toString() {
        String v = "";
        for (Node p = head; p != null; p = p.next) {
            if (v.length() > 0) v += "->";
            v += p.data;
        }
        return v;
    }
}
