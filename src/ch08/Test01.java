package ch08;

import java.util.Random;

//1. (실습: 순차탐색) 다음 코드의 search 함수는 배열 v 내에 key 값의 존재하는 경우 그 위치 번
//        호를, 그렇지 않은 경우 -1을 반환한다고 한다. 순차탐색 방식으로 search 함수를 완성하시오.
//        search 함수의 시간복잡도는 얼마인가?
//        - 실습 #1: 배열 v에 대한 순차탐색의 간단한 구현은 0부터 v.length-1까지 범위의 각 i에 대해
//        v[i]를 탐색키와 비교하는 작업을, v[i]가 탐색키와 일치할 때까지, 반복하는 방식을 사용한다.
//        (Reference: https://en.wikipedia.org/wiki/Linear_search, CC-BY-SA)

public class Test01 {
    public static void main(String[] args) {
        int v[]=new int[1000000];
        Random random=new Random();
        for (int i = 0; i < v.length; i++) v[i]=random.nextInt(1000000);
        int key=1234;
        System.out.println(search(v, key));
    }
    private static int search(int[] v, int key) {
        for (int i = 0; i < v.length; i++) {
            if (v[i]==key)return i;
        }
        return -1;
    }
}