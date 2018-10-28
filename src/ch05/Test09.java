package ch05;

//9. (배열 기반 큐 클래스 구현) 아래 코드는 배열로 구현된 큐 클래스의 동작을 간단 구현한 코
//        드이다.
//        - rear는 큐에 삽입된 가장 최근 자료의 위치이다. (초기값 -1)
//        - front는 큐에 삽입된 가장 오래된 자료 직전 위치이다. (초기값 -1)
//        - 큐에 자료 삽입(enqueue,add) 시 rear를 1 증가시킨 후 rear 위치에 자료를 저장한다.
//        - 큐에서 자료 추출(dequeue,remove) 시 front를 1 증가시킨 후 front 위치의 자료를 추출한다.
//        - 공백 큐 판단: rear와 front의 값이 같으면 큐가 비어 있는 상태이다.
//        - 포화 큐 판단: rear가 최대 큐 크기보다 1 적은 값이면 큐가 포화 상태이다.
//        - 아래 코드는 최초 설정된 큐의 크기를 초과하는 자료를 삽입하지 못하는 한계가 있다. 큐
//        포화 시 front가 -1을 초과하는 경우 여분의 공간 확보를 위해 배열 내 전체 자료를 왼쪽으로
//        이동시키고 front, rear 값을 재설정이 필요하다.
public class Test09 {
    public static void main(String[] args) {
        SimpleQueue queue=new SimpleQueue();
        System.out.println("크기 5 큐 초기 상태: "+queue);
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