package ch06;

import java.util.Arrays;

//23. (실습) 다음은 3비트 이진수의 모든 가능한 숫자열을 생성하는 코드이다. 아래 코드를 입력
//        하고 실행하면서 비트열 생성 코드 구현법을 익히시오. (참고: 다양한 예제로 학습하는 데이터
//        구조와 알고리즘 문제 해결법부터 개선법까지. 나라심하 카루만치 저. 전계도 역. 인사이트
//        (insight). 2014.)
//        - 실습 #4: 2자리 3진수(0,1,2)의 모든 가능한 표현을 출력하는 코드를 작성하시오.
//        00,01,02,10,11,12,20,21,22
public class Test23D {
    public static void main(String[] args) {
        int v[]=new int[2];
        bitString(v, 0);
    }
    private static void bitString(int[] v, int i) {
        if(i==v.length){
            System.out.println(Arrays.toString(v));
            return;
        }
        v[i]=0;
        bitString(v, i+1);
        v[i]=1;
        bitString(v, i+1);
        v[i]=2;
        bitString(v, i+1);
    }
}