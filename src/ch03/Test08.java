package ch03;

//8. (연결리스트 내 특정 자료 삭제) 다음은 연결리스트 내 특정 자료를 삭제하는 코드이다. 삭제
//        할 자료 값에 해당하는 searchValue 값을 1,3,9 등으로 변경하면서 실행해 보시오. 연결리스트
//        가 비어 있는 경우나 삭제할 자료가 존재하지 않는 경우 "does not exist" 오류 메시지가 출력
//        된다. 아래 코드를 입력하고 실행하면서 그 내용을 학습하시오.
//        - 삭제 전: head->1->2->3
//        - 삭제 후: head->1->3
public class Test08 {
    public static void main(String[] args) {
        Node head=null;
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        printList(head);
        int searchValue=1; // 1,2,9 등으로 변경하면서 실행해 볼 것.
        Node p=head, prev=null;
        while(p!=null && p.data!=searchValue){ prev=p; p=p.next; }
        if(p==null) System.out.println(searchValue+" does not exist");
        else{
            if(prev!=null) prev.next=p.next;
            else head=p.next;
            p.next=null;
        }
        printList(head);
    }
    private static void printList(Node head) {
        for (Node p=head; p != null; p=p.next) System.out.print(p.data+"->");
        System.out.println();
    }
}