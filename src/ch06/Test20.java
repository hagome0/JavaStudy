package ch06;

import java.util.Arrays;

//20. (순열) 집합 {0,1,2}에 대한 순열의 모든 결과는 012, 021, 102, 120, 210, 201이다. 다음은 순열
//        생성 코드이다. 아래 코드를 입력하고 실행하면서 순열 생성 코드 구현법을 익히시오.
public class Test20 {
    public static void main(String[] args) {
        int n[]=new int[3];
        for (int i = 0; i < n.length; i++) n[i]=i;
        perm(n, 0);
    }
    private static void perm(int[] n, int i) {
        if(i==n.length){
            System.out.println(Arrays.toString(n));
            return;
        }
        for (int j = i; j < n.length; j++) {
            int temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
            perm(n, i+1);
            temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
        }
    }
}