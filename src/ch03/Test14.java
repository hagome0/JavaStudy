package ch03;

//14. (실습: removeLast()) SimpleList의 removeLast는 연결리스트의 끝 위치 자료를 삭제하는 메소
//        드이다. 아래 코드가 정상 동작하도록 SimpleList에 removeLast를 구현하시오. 지금까지 구현
//        한 SimpleList와 같은 단일연결리스트에서 구현된 removeLast는 어떤 단점이 있는가?

public class Test14 {
    public static void main(String[] args) {
        SimpleList list=new SimpleList();
        for (int i = 0; i < 5; i++) list.addLast(i);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}