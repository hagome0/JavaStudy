package ch05;

import java.util.LinkedList;

//1. (실습) 큐(queue)는 자료의 삽입(push)과 삭제(pop)가 서로 다른 양 끝(rear와 front)에서 발생
//        한다. 다음은 LinkedList 클래스의 addLast, removeFirst, getFirst 메소드를 큐의 enqueue,
//        dequeue, peek로 사용한 예시 코드이다. 큐가 비어 있는지 검사하기 위해 LinkedList의
//        isEmpty 메소드를 사용하였으며, 큐 크기 확인을 위해 LinkedList의 size 메소드를 사용하였다.
//        아래 코드를 입력하고 실행하면서 큐 및 LinkedList의 사용을 익히시오.
//        - 실습: LinkedList의 addLast, removeFirst, getFirst 대신 addFirst, removeLast, getLast 메소드를 사용하여
//        아래 코드를 재실행해 보시오.
public class Test01 {
    public static void main(String[] args) {
        LinkedList<String> queue=new LinkedList<>();
        queue.addLast("한국"); // 큐 rear에 자료 삽입, queue.add("한국");
        queue.addLast("미국"); // 큐 rear에 자료 삽입
        queue.addLast("독일"); // 큐 rear에 자료 삽입
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐 크기="+queue.size());
        System.out.println("큐가 비어 있는가? "+queue.isEmpty());
        String v=null;
        v=queue.getFirst();
        System.out.println("큐 front 자료 확인="+v);
        v=queue.removeFirst(); // String v=queue.remove();
        System.out.println("큐 front 추출 값="+v);
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐 front 추출 값="+queue.removeFirst());
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐 front 추출 값="+queue.removeFirst());
        System.out.println("큐 전체 내용: "+queue);
        System.out.println("큐가 비어 있는가? "+queue.isEmpty());
    }
}