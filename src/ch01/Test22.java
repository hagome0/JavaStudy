package ch01;

import java.util.Scanner;

//22. (실습) 크기 N(예:9)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값 중 두 번
//        째 큰 값을 출력하는 코드를 작성하시오. 순위 부여 시 중복된 값에 대해서는 동일 순위를 부
//        여하시오. 예를 들어 배열 값들의 내림차순 나열이 9,9,9,7,...인 경우 두 번째 큰 값은 7이 되
//        도록 하시오. 정렬을 적용하면 쉽게 두 번째 큰 값을 얻을 수 있으나, 정렬의 경우 O(nlogn)
//        의 시간복잡도가 소요된다. O(n)의 복잡도로 동작하는 코드를 작성해 보시오. 다음은 동작 예
//        시이다.
//        - 입력: 4 5 1 5 1 3 4 5 1
//        - 출력: 4
public class Test22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 9;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i]>max){
                secondMax = max;
                max=arr[i];
            }
            else{
                if (arr[i] > secondMax && arr[i]!=max)
                    secondMax=arr[i];
            }
        }

        System.out.println(secondMax);
    }
}