package ch06;

import java.util.Arrays;

//23. (실습) 다음은 3비트 이진수의 모든 가능한 숫자열을 생성하는 코드이다. 아래 코드를 입력
//        하고 실행하면서 비트열 생성 코드 구현법을 익히시오. (참고: 다양한 예제로 학습하는 데이터
//        구조와 알고리즘 문제 해결법부터 개선법까지. 나라심하 카루만치 저. 전계도 역. 인사이트
//        (insight). 2014.)
//        - 실습 #6: {0,1,2}의 모든 부분집합 {},{1},{2},{0,1},{0,2},{1,2},{0,1,2}을 출력하는 코드를 작성하시오.
import java.util.Arrays;

public class Test23F {

    public static void main(String[] args) {
        int v[] = new int[3];
        bitString(v, 0);

    }

    private static void bitString(int[] v, int i) {
        if (i == v.length) {
//             System.out.println(Arrays.toString(v));

            System.out.print("{");
            for (int j = 0; j < v.length ; j++)if (v[j]==1) System.out.print(j);
            System.out.print("}");
            System.out.println();

            return;
        }
        v[i] = 0;
        bitString(v, i + 1);
        v[i] = 1;
        bitString(v, i + 1);

    }
}
