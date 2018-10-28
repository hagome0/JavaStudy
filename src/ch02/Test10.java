package ch02;

import java.util.Arrays;

//10. (실습) 아래 코드에서 배열 n에 저장된 0번째 자료를 삭제하여 배열의 내용이 다음과 같이 변
//        경되도록 아래 코드를 완성하시오.
//        - 실행결과: [4, 5, 6, 7, 0, 0, 0, 0, 0, 0]
public class Test10 {
    public static void main(String[] args) {
        int n[]={3,4,5,6,7,0,0,0,0,0};
        for (int i = 0; i < n.length-1; i++) {
            n[i] = n[i+1];
        }
        System.out.println(Arrays.toString(n));

    }
}