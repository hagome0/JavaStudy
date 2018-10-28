package ch03;

//15. (이중연결리스트) 다음은 이중연결리스트 head->77<->99<-tail을 생성하는 코드이다. next,
//prev 링크는 각각 순방향, 역방향 연결을 구성한다. 아래 코드를 입력하고 실행하면서 그 내
//용을 학습하시오.
public class Test15 {
    public static void main(String[] args) {
        class Node {
            int data;
            Node prev, next;
            public Node(int data) {
                this.data=data;
            }
        }
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node head=n1;
        Node tail=n2;
        n1.next=n2;
        n2.prev=n1;
        System.out.print("head");
        for (Node p=head; p != null; p=p.next) System.out.print("->"+p.data);
        System.out.print("\ntail");
        for (Node p=tail; p != null; p=p.prev) System.out.print("->"+p.data);
    }
}