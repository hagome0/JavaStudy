package ch07;

import java.util.Arrays;

//1. (실습: 거품정렬, bubble sort) 다음은 정수 배열을 거품정렬하는 코드 예이다. 아래 코드를 입
//        력하고 실행하면서 거품정렬 구현법을 익히시오. (Reference:
//        https://en.wikipedia.org/wiki/Bubble_sort, CC-BY-SA)
//        - 실습 #1: 아래 bubbleSort 함수의 시간 복잡도를 개선하시오. 힌트: 외부 for 루프는 각
//        반복마다 정렬되지 않은 자료 한 개의 정렬된 위치(입력 배열의 오른쪽 끝부터 시작하여 1씩
//        감소된 위치)를 결정하므로, 이전 반복을 통해 기정렬된 자료들은 이후 반복 시 재검사할
//        필요가 없다.
//        - 실습 #2: 아래 bubbleSort 함수의 시간 복잡도를 개선하시오. 힌트: 외부 for 루프의 특정 반복
//        시 교환이 전혀 발생하지 않았다면 자료는 이미 정렬된 상태이므로 더 이상의 반복은 필요
//        없다.
public class Test01B {
    public static void main(String[] args) {
        int v[]=new int[]{5,8,1,9,3,5,1,5};
        bubbleSort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void bubbleSort(int[] v) {
        int cnt = 0;
        for (int i = 0; i < v.length; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < v.length-i; j++) {
                cnt++;
                if(v[j-1]>v[j]) { // 인접 자료 간 순서 맞지 않으면 교환
                    int temp=v[j];
                    v[j]=v[j-1];
                    v[j-1]=temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)break;
        }
        System.out.println(cnt);
    }
}