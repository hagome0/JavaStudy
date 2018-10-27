package ch01;

import java.util.Arrays;
import java.util.Random;

//19. 다음은 크기 N의 배열에 0~M-1 범위의 임의의 정수를 저장한 후 배열 정렬 전후의 내용을
//        각각 출력하는 코드이다. 아래 코드를 입력하고 실행해 보시오.
public class Test19 {
    public static void main(String[] args) {
        int N=20, M=10;
        int n[]=new int[N];
        Random random=new Random();
        for (int i = 0; i < N; i++) n[i]=random.nextInt(M);
        System.out.println(Arrays.toString(n));
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
    }
}