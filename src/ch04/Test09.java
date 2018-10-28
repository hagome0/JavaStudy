package ch04;

import java.util.Arrays;

//9. (String 클래스의 split 메소드) 다음는 String 클래스의 split 메소드를 사용하여 문자열 e 내의
//        토큰들을 whitespace 문자열을 기준으로 분리하여 출력하는 코드이다. 아래 코드를 입력하고
//        실행하여 split 메소드의 사용을 익히시오. whitespace 문자에는 일반적으로 ' ', '\t', '\r', '\n'
//        이 포함된다.
public class Test09 {
    public static void main(String[] args) {
        String e="3 1 2 / *";
        String v[]=e.split("\\s+");
        System.out.println(Arrays.toString(v));
    }
}