package ch03;

public class SimpleList {
    Node head;
    Node tail;
    int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }


    public void removeFirst() {
        if(head==null){
            System.out.println("Empty!");
        }
        else{
            Node p = head;
            head = head.next;
            p.next = null;
        }
    }

    public int size() {
        return size;
    }
    public String get(int i) {
        Node get = head;
        if (size < i){
            return "size is small";
        }
        else{
            for (int j = 0; j < i; j++) {
                get = get.next;
            }
            return String.valueOf(get.data);
        }
    }

    public void addLast(int i) {
        Node newNode = new Node(i);
        Node p = head;

        if (head==null){
            head = newNode;
        }
        else{
            while (p.next!=null)p=p.next;
            p.next = newNode;
        }

    }

    public void addLast2(int i) {
        Node newNode = new Node(i);

        if (head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void removeLast() {
        if (head==null){
            System.out.println("Empty!");
        }
        else {
            Node p = head;
            Node prev = null;

            while (p.next!=null){
                prev = p;
                p = p.next;
            }

            prev.next=null;
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