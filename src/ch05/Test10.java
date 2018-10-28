package ch05;

//10. (실습) 위 코드를 수정하여, 아래 실행 예와 같이 포화 큐에 새로운 자료 삽입 시 큐의 크기를
//        두 배 확장한 후 배열 내 전체 자료를 왼쪽으로 이동시키고 새로운 자료를 삽입하도록 하시
//        오.
//        크기 1 큐 초기 상태: front=-1, rear=-1, [ ]
//        자료 A 삽입 후: front=-1, rear=0, [A]
//        자료 B 삽입 후: front=-1, rear=1, [A, B]
//        자료 C 삽입 후: front=-1, rear=2, [A, B, C, ]
//        큐에서 자료 추출: A
//        큐에서 자료 추출: B
//        큐에서 자료 추출: C
//        자료 D 삽입 후: front=2, rear=3, [A, B, C, D]
//        자료 E 삽입 후: front=-1, rear=1, [D, E, C, D, , , , ]
public class Test10 {
    public static void main(String[] args) {
        SimpleQueueD queue=new SimpleQueueD();
        System.out.println("크기 1 큐 초기 상태: "+queue);
        queue.add('A'); System.out.println("자료 A 삽입 후: "+queue);
        queue.add('B'); System.out.println("자료 B 삽입 후: "+queue);
        queue.add('C'); System.out.println("자료 C 삽입 후: "+queue);
        System.out.println("큐에서 자료 추출: "+(char)queue.remove());
        System.out.println("큐에서 자료 추출: "+(char)queue.remove());
        System.out.println("큐에서 자료 추출: "+(char)queue.remove());
        queue.add('D'); System.out.println("자료 D 삽입 후: "+queue);
        queue.add('E'); System.out.println("자료 E 삽입 후: "+queue);
    }
}