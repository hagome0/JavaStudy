package ch03;

//9. (클래스 기반 연결리스트 구현) 다음은 연결리스트 클래스 SimpleList를 구현한 코드이다.
//        SimpleList의 addFirst(int data) 메소드는 연결리스트의 첫 위치에 새로운 자료를 삽입하는 메
//        소드이다. 아래 코드를 입력하고 실행하면서 그 내용을 학습하시오.

public class Test09 {
    public static void main(String[] args) {
        SimpleList list=new SimpleList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        System.out.println(list);
    }
}