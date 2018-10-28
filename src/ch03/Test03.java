package ch03;

//3. (연결리스트 첫 위치 삽입) 다음은 연결리스트의 첫 위치에 7을 삽입하는 코드이다. 연결리스
//        트가 비어 있는 경우(head가 null인 경우)에도 동작한다. 아래 코드를 입력하고 실행하면서 그
//        내용을 학습하시오.
//        - 삽입 전: head->1->2->3
//        - 삽입 후: head->7->1->2->3
public class Test03 {
    public static void main(String[] args) {
        Node head=null;
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        printList(head);
        Node newNode=new Node(7);
        newNode.next=head;
        head=newNode;
        printList(head);
    }
    private static void printList(Node head) {
        for (Node p=head; p != null; p=p.next) System.out.print(p.data+"->");
        System.out.println();
    }
}
