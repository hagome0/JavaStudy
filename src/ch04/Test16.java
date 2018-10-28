package ch04;

import java.util.Arrays;

//16. (실습: 배열 크기 변경) 다음은 배열을 확장, 축소하는 코드이다. arrayCopy는 int 배열에 대해
//        이전 문제의 Arrays.copyOf() 함수와 같은 동작을 수행하는 함수이다. 아래 코드를 완성하시오.
//        - 실행결과:
//        [1, 2, 3, 4]
//        [1, 2, 3, 4, 0, 0, 0, 0]
//        [1, 2]
public class Test16 {
    public static void main(String[] args) {
        int n[]={1,2,3,4};
        System.out.println(Arrays.toString(n));
        int m[]=arrayCopy(n, n.length*2); // 2배 확장
        n=m;
        System.out.println(Arrays.toString(n));
        n=arrayCopy(n, (int) (n.length*0.25)); // 1/4로 축소
        System.out.println(Arrays.toString(n));
    }
    private static int[] arrayCopy(int[] n, int newSize) {
        int[] newArr = new int[newSize];
        for (int i = 0; i < Integer.min(n.length, newSize); i++) {
            newArr[i] = n[i];
        }
        return newArr;
    }
}