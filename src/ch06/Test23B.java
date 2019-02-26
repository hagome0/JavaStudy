package ch06;

import java.util.Arrays;

//23. (실습) 다음은 3비트 이진수의 모든 가능한 숫자열을 생성하는 코드이다. 아래 코드를 입력
//        하고 실행하면서 비트열 생성 코드 구현법을 익히시오. (참고: 다양한 예제로 학습하는 데이터
//        구조와 알고리즘 문제 해결법부터 개선법까지. 나라심하 카루만치 저. 전계도 역. 인사이트
//        (insight). 2014.)
//        - 실습 #2: 다음과 같은 비트열 순으로 결과가 출력되도록 아래 코드를 수정하시오. (비트열이
//        생성되는 순서가 다름)
//        111,110,101,100,011,010,001,000
public class Test23B {
    public static void main(String[] args) {
        int v[]=new int[3];
        bitString(v, 0);
    }
    private static void bitString(int[] v, int i) {
        if(i==v.length){
            System.out.println(Arrays.toString(v));
            return;
        }
        v[i]=1;
        bitString(v, i+1);
        v[i]=0;
        bitString(v, i+1);
    }
}