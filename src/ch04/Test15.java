package ch04;

import java.util.Arrays;

//15. (배열 크기 변경) 다음은 배열을 확장 및 축소하는 예시 코드이다. 아래 코드를 입력하고 실행
//        하면서 가변 배열 처리를 익히시오.
//        - 실행결과:
//        [1, 2, 3, 4]
//        [1, 2, 3, 4, 0, 0, 0, 0]
//        [1, 2]
public class Test15 {
    public static void main(String[] args) {
        int n[]={1,2,3,4};
        System.out.println(Arrays.toString(n));
        int m[]= Arrays.copyOf(n, n.length*2); // 2배 확장
        n=m;
        System.out.println(Arrays.toString(n));
        n=Arrays.copyOf(n, (int) (n.length*0.25)); // 1/4로 축소
        System.out.println(Arrays.toString(n));
    }
}