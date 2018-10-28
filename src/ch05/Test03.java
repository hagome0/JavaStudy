package ch05;

import java.util.LinkedList;

//3. (실습: 원형 리스트) 다음은 1~7까지 수들이 원형으로 연결되었다고 가정하고 curPos 위치부
//        터 k번째 노드 값을 출력하는 코드이다. curPos가 0인 경우 k번째 노드 값은 4가 출력되며,
//        curPos가 5인 경우 2가 출력되어야 한다. 아래 코드의 오류를 수정하시오.
//        - 실행 결과:
//        4
//        2
public class Test03 {
    public static void main(String[] args) {
        int n=7, k=4;
        LinkedList<Integer> queue=new LinkedList<>();
        for (int i=1; i <=n; i++) queue.add(i); // 1 2 3 4 5 6 7
        int curPos=0;
        System.out.println(queue.get(curPos+k-1)); // curPos부터 k번째 노드 값 => 4
        curPos=5;
        System.out.println(queue.get((curPos+k-1)%n)); // curPos부터 k번째 노드 값 => 2
    }
}