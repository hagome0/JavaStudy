package ch01;

import java.util.Arrays;
import java.util.Random;

//21. 다음은 크기 백만의 정수 배열에 임의의 정수(0~99)를 저장한 후 배열 내 정수의 최대값을
//        찾아 출력하는 두 가지 방법의 소요 시간을 출력(밀리초)하는 코드이다. 첫 번째 방법에서는
//        최대값을 찾기 위해 백만개 정수 배열을 정렬하였으며, 두번째 방법에서는 배열을 순차 탐색
//        하는 과정을 통해 최대값을 결정하였다. 아래 두 코드의 시간복잡도를 비교해 보시오.
public class Test21 {
    public static void main(String[] args) {
        long start;
        int N=1000000, M=100;
        int n[]=new int[N];
        Random random=new Random();
        for (int i = 0; i < N; i++) n[i]=random.nextInt(M);
        start=System.currentTimeMillis();
        Arrays.sort(n); // 배열 정렬
        System.out.println("최대값:"+n[n.length-1]); // 최대값 출력
        System.out.println("소요시간:"+(System.currentTimeMillis()-start)+" ms"); // 소요 시간 출력
        for (int i = 0; i < N; i++) n[i]=random.nextInt(M);
        start=System.currentTimeMillis();
        int max=n[0];
        for (int i = 1; i < n.length; i++) {
            if(n[i]>max) max=n[i];
        }
        System.out.println("최대값:"+max); // 최대값 출력
        System.out.println("소요시간:"+(System.currentTimeMillis()-start)+" ms"); // 소요 시간 출력
    }
}