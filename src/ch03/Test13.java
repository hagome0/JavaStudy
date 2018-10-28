package ch03;

//13. (실습: addLast()) 아래 코드가 연결리스트 1->2->3을 생성하도록 다음 두 가지 구현 방법 각
//        각에 대해 아래 SimpleList를 수정하시오. addLast(int data)는 연결리스트의 끝 위치에 새로운
//        자료 data를 추가하는 메소드이다. 두 구현 방법의 시간 복잡도는 각각 어떻게 되는가?
//        - 구현 방법 1: tail 필드를 추가하지 않고, head 필드만 사용하여 구현
//        - 구현 방법 2: tail 필드를 추가하고, tail 필드를 사용하여 구현

public class Test13 {
    public static void main(String[] args) {
        SimpleList list=new SimpleList();
        //구현 1 :tail 사용 x
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
        //구현 2 :tail 사용 o
        list.addLast2(1);
        list.addLast2(2);
        list.addLast2(3);

        System.out.println(list);
    }
}