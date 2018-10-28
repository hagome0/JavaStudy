package ch03;

//    2. (연결리스트 출력) 다음은 head->1->2->3의 연결리스트를 생성한 후 출력하는 코드이다. 아
//    래 코드를 입력하고 실행하면서 그 내용을 학습하시오.
public class Test02 {
    public static void main(String[] args) {
        Node head = null;
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        head = n1;
        n1.next = n2;
        n2.next = n3;
        for (Node p = head; p != null; p = p.next) System.out.print(p.data + "->");
    }
}
