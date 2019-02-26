package ch06;

import java.util.Arrays;

//19. (실습: 자바 swap) 다음은 swap 함수를 통해 배열 내 두 정수를 교환하는 예시 코드이다. 교
//        환이 정상적으로 수행되도록 아래 코드의 swap 함수 정의문 및 호출문을 수정하시오.
public class Test19 {
    public static void main(String[] args) {
        int n[]={3,4};
        System.out.println(Arrays.toString(n));
        swap(n, 0,1);
        System.out.println(Arrays.toString(n));
    }
    private static void swap(int[] n, int i, int j) {
        int temp=n[i];
        n[i]=n[j];
        n[j]=temp;
    }
}