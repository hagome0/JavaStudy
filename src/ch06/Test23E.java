package ch06;

import java.util.Arrays;

//23. (실습) 다음은 3비트 이진수의 모든 가능한 숫자열을 생성하는 코드이다. 아래 코드를 입력
//        하고 실행하면서 비트열 생성 코드 구현법을 익히시오. (참고: 다양한 예제로 학습하는 데이터
//        구조와 알고리즘 문제 해결법부터 개선법까지. 나라심하 카루만치 저. 전계도 역. 인사이트
//        (insight). 2014.)
//        - 실습 #5: 2자리 8진수(0,1,2,3,4,5,6,7)의 모든 가능한 표현을 출력하는 코드를 작성하시오.
//        00,01,02,03,04,05,06,07,10,11,12,13,14,15,16,17,20,21,22,23,24,25,26,27,30,31,32,33,34,35,36,37,40,41,42,43,
//        44,45,46,47,50,51,52,53,54,55,56,57,60,61,62,63,64,65,66,67,70,71,72,73,74,75,76,77
public class Test23E {
    public static void main(String[] args) {
        int v[] = new int[2];
        bitString(v, 0);
    }

    private static void bitString(int[] v, int i) {
        if (i == v.length) {
            System.out.println(Arrays.toString(v));
            return;
        }
        for (int j = 0; j < 8; j++) {
            v[i] = j;
            bitString(v, i + 1);
        }
    }
}