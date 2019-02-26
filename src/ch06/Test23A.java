package ch06;

import java.util.Arrays;

//23. (실습) 다음은 3비트 이진수의 모든 가능한 숫자열을 생성하는 코드이다. 아래 코드를 입력
//        하고 실행하면서 비트열 생성 코드 구현법을 익히시오. (참고: 다양한 예제로 학습하는 데이터
//        구조와 알고리즘 문제 해결법부터 개선법까지. 나라심하 카루만치 저. 전계도 역. 인사이트
//        (insight). 2014.)
//        - 실행결과: 000,001,010,011,100,101,110,111
//        - 실습 #1: 다음과 같이 4비트의 모든 가능한 비트열을 생성하도록 아래 코드를 수정하시오.
//        0000,0001,0010,0011,0100,0101,0110,0111,1000,1001,1010,1011,1100,1101,1110,1111
public class Test23A {
    public static void main(String[] args) {
        int v[]=new int[4];
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
    }
}