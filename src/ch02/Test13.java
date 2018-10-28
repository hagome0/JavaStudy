package ch02;

import java.util.Arrays;

//13. (실습) 다음은 기존 자료가 저장되어 있는 배열의 0번째 위치에 새로운 자료를 삽입하여 기존
//        배열을 크기 1 증가된 배열로 변경하는 코드이다. System.arraycopy(s, 0, t, 1, s.length)를 반복
//        문으로 대체하여 작성하시오.
//        - System.arraycopy(s, 0, t, 1, s.length)는 s[i]를 t[j]에 대입하는 작업을 i=0,j=1부터 시작하여 s.length번
//        반복하는 함수이다.
//        - 삽입 전: [화, 수, 목, 금, 토, 일]
//        - 삽입 후: [월, 화, 수, 목, 금, 토, 일]
public class Test13 {
    public static void main(String[] args) {
        char s[]= {'화','수','목','금','토','일'};
        System.out.println(Arrays.toString(s)); // 삽입 전
        char t[]=new char[s.length+1];
        //System.arraycopy(s, 0, t, 1, s.length);
        for (int i = 1; i < t.length; i++) {
            t[i] = s[i-1];
        }
        t[0]='월';
        s=t;
        System.out.println(Arrays.toString(s)); // 삽입 후
    }
}