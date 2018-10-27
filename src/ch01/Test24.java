package ch01;

import java.util.Scanner;

//24. (실습) 크기 N(예:9)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값 중 두 번
//        째 큰 값을 출력하는 코드를 작성하시오. 순위 부여 시 중복된 값에 대해서는 동일 순위를 부
//        여하시오. 예를 들어 배열 값들의 내림차순 나열이 9,9,9,7,...인 경우 두 번째 큰 값은 7이 되
//        도록 하시오. 두 번째 큰 값이 존재하지 않는 경우 None을 출력하시오. 다음은 동작 예시이
//        다.
public class Test24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 9;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else {
                if (arr[i] > secondMax && arr[i] != max)
                    secondMax = arr[i];
            }
        }

        System.out.println((secondMax==Integer.MIN_VALUE)?"None":secondMax);
    }
}
