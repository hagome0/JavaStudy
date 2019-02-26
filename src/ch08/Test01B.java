package ch08;

import java.util.Random;

//        - 실습 #2: 실습 #1의 구현은 각 i에 대해 i 값의 범위 검사를 수행하므로 각 i에 대해 2회
//        비교(i의 범위 검사 및 탐색키와 v[i]의 일치 검사)를 요구한다. v[v.length] 위치가 사용가능하다고
//        가정하면 v[v.length]에 탐색키를 저장해 둔 다음, i에 대한 범위 검사 없이 순차탐색을 구현할
//        수 있다. 즉 탐색키가 발견된 경우 i의 값이 v.length이면 탐색키가 존재하지 않는 것이므로 -
//        1을 반환하고, 그렇지 않다면 i를 반환하면 된다. 그러나 자바에서 v[v.length] 위치는 접근
//        불가이므로 이러한 구현에 약간의 변형 처리가 추가되어야 한다. 이를 구현하시오. (Reference:
//        https://en.wikipedia.org/wiki/Linear_search, CC-BY-SA)
public class Test01B {
    public static void main(String[] args) {
        int v[] = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < v.length; i++) v[i] = random.nextInt(1000000);
        int key = 1234;
        System.out.println(search(v, key));
    }

    private static int search(int[] v, int key) {
        int i = -1;
        int s = v[v.length-1];
        v[v.length-1] = key;
        while (++v[i]!=key);
        if (s==v[i])return i;
        if (i == v.length-1)return -1;
        return i;
    }
}