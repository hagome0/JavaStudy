package ch03;

//7. (연결리스트 끝 위치 자료 삭제) 다음은 연결리스트 내 끝 위치 자료를 삭제하는 코드이다. 아
//        래 코드를 입력하고 실행하면서 그 내용을 학습하시오.
//        - 삭제 전: head->1->2->3
//        - 삭제 후: head->1->2
public class Test07 {
    public static void main(String[] args) {
        Node head=null;
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        printList(head);
        if(head!=null){
            Node p=head, prev=null;
            while(p.next!=null){ prev=p; p=p.next; } // p를 마지막 노드로, prev를 마지막 직전노드로 이동
            if(prev!=null) prev.next=null; // 리스트 크기가 2개 이상인 경우
            else head=null; // 리스트 크기가 1인 경우
        }
        printList(head);
    }
    private static void printList(Node head) {
        for (Node p=head; p != null; p=p.next) System.out.print(p.data+"->");
        System.out.println();
    }
}