package ch01;

import java.util.Arrays;
import java.util.Scanner;

//25. (실습) 크기 N(예: 9 혹은 8)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값
//의 중앙값(median)을 출력하는 코드를 작성하시오. 배열의 크기 N이 홀수, 짝수인 경우 모두
//동작하도록 하시오. 다음은 동작 예시이다. (참조: https://ko.wikipedia.org/wiki/중앙값)
//- 입력: 4 5 1 6 1 3 4 5 1
//- 출력: 4
//- 입력: 5 1 6 1 3 4 5 1
//- 출력: 3.5
public class Test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 8;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (N%2==0){
            System.out.println( ((double)arr[N/2-1]+arr[N/2])/2 );
        }
        else {
            System.out.println(arr[N/2]);
        }
    }
}