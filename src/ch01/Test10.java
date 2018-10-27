package ch01;

import java.math.BigInteger;

//10. (실습) 다음은 long 자료형으로도 표현할 수 없는 큰 정수들의 합을 구하기 위해 BigInteger
//        클래스를 사용하는 코드이다. BigInteger 클래스를 사용하지 않고 문자열 s1, s2에 저장된 숫자
//        문자열에 해당하는 정수들의 합을 출력하는 코드를 작성하시오.
public class Test10 {
    public static void main(String[] args) {
        String s1="999999999999999999999999999999999999999999999";
        String s2="888888888888888888888888888888888888";
        BigInteger n1=new BigInteger(s1);
        BigInteger n2=new BigInteger(s2);
        System.out.println(n1.add(n2));
    }
}