package ch01;

import java.util.Arrays;
import java.util.Scanner;

//27. (실습) 크기 N(예:9)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값들에 대해
//내림차순 정렬 결과 나열 및 그 순위 나열을 한 행씩 출력하는 코드를 추가하시오. 순위 부여
//시 중복된 값에 대해서는 동일 순위를 부여하시오. 다음은 동작 예시이다.

public class Test27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 9;
        int[] arr = new int[N];
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i < N/2; i++) {
            int temp = arr[i];
            arr[i] = arr[N-1-i];
            arr[N-1-i] = temp;
        }

        int overlap = Integer.MAX_VALUE;
        int rank = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] < overlap){
                rank++;
                overlap = arr[i];
            }
            result[i] = rank;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}
