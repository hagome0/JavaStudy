package ch01;

import java.util.Arrays;
import java.util.Scanner;

//26. (실습) 배열에는 중복된 값들이 존재할 수 있다. 크기 N(예:9)의 정수 배열에 임의의 정수(0~9)
//를 저장한 후 배열에 저장된 값들의 중복을 제거한 값들을 출력하는 코드를 추가하시오. 다음
//은 동작 예시이다.
//- 입력: 4 5 1 6 1 3 4 5 1
//- 출력: 1 3 4 5 6
public class Test26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 8;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int overlap = Integer.MIN_VALUE;
        for (int a: arr) {
            if (a > overlap){
                System.out.print(a + " ");
                overlap = a;
            }
        }
    }
}
