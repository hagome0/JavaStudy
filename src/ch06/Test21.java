package ch06;

import java.util.Arrays;

//21. (실습) {서울, 대구, 부산}의 모든 순열을 출력하는 아래 코드를 완성하시오.
//        - 실행결과:
//        서울 대구 부산
//        서울 부산 대구
//        대구 서울 부산
//        대구 부산 서울
//        부산 대구 서울
//        부산 서울 대구
public class Test21 {
    public static void main(String[] args) {
        String s[]={"서울", "대구", "부산"};
        perm(s, 0);
    }
    private static void perm(String[] n, int i) {
        if(i==n.length){
            System.out.println(Arrays.toString(n));
            return;
        }
        for (int j = i; j < n.length; j++) {
            String temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
            perm(n, i+1);
            temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
        }
    }

}