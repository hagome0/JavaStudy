package ch03;

//16. (실습) 다음과 같이 동작하는 SimpleList를 이중연결리스트로 구현하시오.
//- 실행결과:
//2->1->9->8
//1->9
public class Test16 {
    public static void main(String[] args) {
        SimpleList2 list=new SimpleList2();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(9);
        list.addLast(8);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}