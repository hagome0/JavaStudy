package ch01;

import java.util.Random;

//20. (실습) 크기 N의 정수 배열에 임의의 정수(0~99)를 저장한 후 배열에 저장된 값들의 평균을
//소수점 둘째자리까지 출력하는 코드를 추가하시오. 이 코드의 시간복잡도는 얼마인가? (참고:
//System.out.printf(), %.2f)
public class Test20 {
    public static void main(String[] args) {
        Random rd = new Random();
        int N = 10;
        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += rd.nextInt(100);
        }

        System.out.printf("%.2f", + (float)sum/N);
    }
}

//bigO(N)