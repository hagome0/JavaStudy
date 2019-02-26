package ch07;

//2. (실습: 선택정렬, selection sort) 다음은 정수 배열을 선택정렬하는 코드 예이다. 아래 코드를
//        입력하고 실행하면서 선택정렬 구현법을 익히시오. (Reference:
//        https://en.wikipedia.org/wiki/Selection_sort, CC-BY-SA)
//        - 선택정렬은 정렬되지 않은 리스트 L 내 최소값 위치를 찾아 L의 첫 위치 자료와 교환한 후
//        L의 첫 위치를 오른쪽으로 하나 이동하는 작업을 반복함으로써 정렬을 수행한다.
//        - 실습 #1: 선택정렬에서 첫 위치 자료가 최소값인 경우에는 교환이 불필요하다. 아래
//        selectionSort 함수에 이를 반영하시오.

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int v[]=new int[]{5,8,1,9,3,5,1,5};
        selectionSort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void selectionSort(int[] v) {
        for (int i = 0; i < v.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < v.length; j++) {
                if (v[minPos]>v[j])minPos=j;
            }
            int x=v[i]; v[i]=v[minPos]; v[minPos]=x;
        }
    }
}