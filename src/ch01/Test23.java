package ch01;

import java.util.Scanner;

//23. (실습) 크기 N(예:9)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값 중 두 번
//        째 큰 값을 출력하는 코드를 작성하시오. 최대값이 중복되는 경우에도 서로 다른 순위를 부여
//        하시오. 정렬을 적용하면 쉽게 두 번째 큰 값을 얻을 수 있으나, 정렬의 경우 O(nlogn)의 시
//        간복잡도가 소요된다. O(n)의 복잡도로 동작하는 코드를 작성해 보시오. 다음은 동작 예시이다.
//        > 입력: 4 4 1 5 1 3 4 5 1
//        > 출력: 5
public class Test23 {
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
                if (arr[i] > secondMax)
                    secondMax = arr[i];
            }
        }
        System.out.println(secondMax);

//        System.out.println((secondMax==Integer.MIN_VALUE)?"None":secondMax);
    }
}
