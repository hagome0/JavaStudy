package ch06;

import java.util.Arrays;

//13. (실습: 재귀 기반 배열 reverse) 다음은 배열 n의 내용을 역순으로 변경하기 위해 재귀함수
//        reverse(n, 0)을 호출하고 있다. 아래 재귀함수 reverse를 완성하시오.
//        - 실행결과: [8, 7, 6, 4, 5, 3, 2, 1]
public class Test13 {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6,7,8};
        reverse(n, 0);
        System.out.println(Arrays.toString(n));
    }
    private static void reverse(int[] n, int i) {
        if(i==n.length/2)return;
        int temp = n[i];
        n[i] = n[n.length-1-i];
        n[n.length-1-i] = temp;

        reverse(n,i+1);
    }
}