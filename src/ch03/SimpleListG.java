package ch03;

public class SimpleListG<T> {
    NodeG<T> head;

    public void addFirst(T data) {
        NodeG<T> newNode = new NodeG<>(data);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public String toString() {
        String v = "";
        for (NodeG<T> p = head; p != null; p = p.next) {
            if (v.length() > 0)
                v += "->";
            v += p.data;
        }
        return v;
    }
}