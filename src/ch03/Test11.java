package ch03;

//11. (실습: removeFirst()) 아래 SimpleList의 removeFirst()는 연결리스트의 0번째 자료를 삭제하는
//    메소드이다. 아래 코드가 정상 실행되도록 removeFirst()를 완성하시오.
//            - removeFirst 실행 전 연결리스트: 4->3->2->1->0
//            - removeFirst 실행 후 연결리스트: 3->2->1->0
//    public class SimpleList {
//        Node head;
//        public void addFirst(int data) {
//            Node newNode=new Node(data);
//            newNode.next=head;
//            head=newNode;
//        }
//        public void removeFirst() {
//        }
//        @Override
//        public String toString() { … } // 이전과 동일
//    }

public class Test11 {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        for (int i = 1; i <= 5; i++) list.addFirst(i);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}