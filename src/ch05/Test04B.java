package ch05;

//4. (실습: 요세푸스 문제) 요세푸스 문제는, 원형으로 둘러선 사람 n명에 대해 특정 위치부터 시
//        작하여 한 방향으로 k번째 사람을 원형에서 제외하는 작업을 반복한다고 할 때 마지막으로
//        제외되는 사람의 최초 위치를 알아내는 것이다. 아래 예시와 같이 n=7, k=3인 경우 요세푸스
//        문제의 해는 4이다. 구현 방법 #1, #2를 참조하여 요세푸스 문제를 해결하는 아래 코드를 완
//        성하시오. (참조: https://en.wikipedia.org/wiki/Josephus_problem)
//        B. 구현 방법 #2: 1~n까지 수들의 연결리스트를 원형 큐로 고려하여 "큐 크기가 2이상인 동
//        안, 직전 제거 위치부터 시작하여 k번째 위치 노드를 삭제하는 작업"을 반복 수행한다.
//        (참조: https://rosettacode.org/wiki/Josephus_problem)
//        1 2 3 4 5 6 7 (3 제거)
//        1 2 4 5 6 7 (6 제거)
//        1 2 4 5 7 (2 제거)
//        1 4 5 7 (7 제거)
//        1 4 5 (5 제거)
//        1 4 (1 제거)
//        4

import java.util.LinkedList;

public class Test04B {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7, 3));
    }

    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.addLast(i);
        }

        int next = 0;
        while (queue.size()>=2){
            next = (next + k-1) % queue.size();
            queue.remove(next);
        }

        return queue.removeFirst();
    }
}
