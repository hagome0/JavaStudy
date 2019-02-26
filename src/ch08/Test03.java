package ch08;

import java.util.Arrays;

//3. (실습: 정렬된 배열에 대한 이진탐색: 이진탐색함수 구현) 다음은 배열 내 자료를 정렬한 후
//        배열 내 임의 자료를 이진탐색하는 코드의 예로, 이진탐색을 위해 직접 구현된 binarySearch
//        메소드를 호출하고 있다. (참조: https://en.wikipedia.org/wiki/Binary_search_algorithm, CC-BYSA)
//        - 실습 #1: 아래 binarySearch 함수에서 int m=(left+right)/2; 문장은 left+right가 int형 정수의 최대값을
//        초과할 경우 문제가 발생한다. 이를 해결하시오.
//        - 실습 #2: 아래 binarySearch 함수를 재귀적 방법으로 구현하시오.
public class Test03 {
    public static void main(String[] args) {
        int v[] = {2, 3, 6, 8, 9};
        Arrays.sort(v); // 배열 정렬
        int key = 8;
        int index = binarySearch(v, key); // 정렬된 배열 내 자료 위치 이진 탐색
        if (index < 0) System.out.println("배열 내 자료 없음");
        else System.out.println("자료 발견 위치(배열 내 index): " + index);
    }

    private static int binarySearch(int[] v, int key) {
        int left = 0, right = v.length - 1;
        while (left <= right) {
            int m = left + (right-left)/2;
            if (key == v[m]) return m;
            if (key < v[m]) right = m - 1;
            else left = m + 1;
        }
        return -1;
    }
}