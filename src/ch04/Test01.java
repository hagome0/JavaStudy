package ch04;

import java.util.LinkedList;

//1. (실습) 스택은 자료의 삽입(push)과 삭제(pop)가 한쪽 끝(top)에서만 발생한다. 다음은
//        LinkedList 클래스의 addFirst, removeFirst, getFirst 메소드를 스택의 push, pop, peek으로 사용
//        한 예시 코드이다. 스택이 비어 있는지 검사하기 위해 LinkedList의 isEmpty 메소드를 사용하
//        였으며, 스택 크기 확인을 위해 LinkedList의 size 메소드를 사용하였다. 아래 코드를 입력하고
//        실행하면서 스택 및 LinkedList의 사용을 익히시오.
//        - 실습: LinkedList의 addFirst, removeFirst, getFirst 대신 addLast, removeLast, getLast 메소드를 사용하여
//        아래 코드를 재실행해 보고 어떤 차이가 있는지 확인하시오.
public class Test01 {
    public static void main(String[] args) {
        LinkedList<Integer> stack=new LinkedList<>(); // 이중연결리스트 구현
        stack.addFirst(1); // list.push(1)
        stack.addFirst(2); // list.push(2)
        stack.addFirst(3); // list.push(3)
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택 크기="+stack.size());
        System.out.println("스택이 비어 있는가? "+stack.isEmpty());
        int v;
        v=stack.getFirst();
        System.out.println("스택 top 위치 자료 확인="+v);
        v=stack.removeFirst(); // list.pop()
        System.out.println("스택 top 위치 자료 제거="+v);
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택 top 위치 자료 제거="+stack.pop());
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택 top 위치 자료 제거="+stack.pop());
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택이 비어 있는가? "+stack.isEmpty());
    }
}