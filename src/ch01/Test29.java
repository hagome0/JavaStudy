package ch01;

import java.util.Arrays;
import java.util.Scanner;

//29. (실습) 크기 N(예:5)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값들을 오른
//쪽으로 K회 회전시킨 결과를 출력하는 코드를 작성하시오. 다음은 동작 예시이다.
public class Test29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] arr = new int[N];
        for (
                int i = 0;
                i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();


        arrShift(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void arrShift(int[] arr, int k) {
        for (int j = 0; j < k; j++) {
            int first = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            arr[0] = first;
        }

    }
}
