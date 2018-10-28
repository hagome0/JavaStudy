package ch04;

import java.util.StringTokenizer;

//8. (StringTokenizer 클래스) 다음는 StringTokenizer 클래스를 사용하여 문자열 e 내의 토큰들을 :,
//        -, ' ' 문자들을 기준으로 분리하여 출력하는 코드이다. 아래 코드를 입력하고 실행하여
//        StringTokenizer 클래스의 사용을 익히시오.
public class Test08 {
    public static void main(String[] args) {
        String e="2018-09-17 17:23:49";
        StringTokenizer stok=new StringTokenizer(e, "- :");
//StringTokenizer stok=new StringTokenizer(e, "- :", true);
        while (stok.hasMoreTokens()) {
            System.out.println(stok.nextToken());
        }
    }
}