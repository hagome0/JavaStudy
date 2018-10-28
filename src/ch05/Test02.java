package ch05;

import java.util.LinkedList;

//2. (리스트 노드 제거) 다음은 리스트 내 특정 위치 자료를 삭제하는 예시 코드이다. 아래 코드를
//        입력하고 실행하면서 리스트 내 자료 삭제를 학습하시오.
//        - 실행 결과:
//        [1, 2, 3, 4, 5]
//        - 제거된 값=3
//        [1, 2, 4, 5]
public class Test02 {
    public static void main(String[] args) {
        LinkedList<Integer> queue=new LinkedList<>();
        for (int i=1; i <=5; i++) queue.add(i); // 1 2 3 4 5
        System.out.println(queue);
        int v=queue.remove(2);
        System.out.println("제거된 값="+v);
        System.out.println(queue);
    }
}