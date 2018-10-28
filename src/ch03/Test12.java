package ch03;

//12. (실습: size(), get()) 아래 SimpleList의 size()는 연결리스트에 저장된 자료의 전체 개수를 반환
//        하는 메소드이다. 또한 SimpleList의 get(int index)는 연결리스트의 index번째 노드의 data 값
//        을 반환하는 메소드이다. 아래 Test 클래스는 연결리스트 4->3->2->1->0를 생성한 후 get()
//        메소드를 통해 각 노드의 자료를 가져와 출력하는 코드이다. 아래 코드가 정상 동작하도록
//        SimpleList를 수정하시오.
//        - 아래 코드 실행결과: 4 3 2 1 0

public class Test12 {
    public static void main(String[] args) {
        SimpleList list=new SimpleList();
        for (int i = 0; i < 5; i++) list.addFirst(i);
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i)+" ");
    }
}