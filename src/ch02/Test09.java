package ch02;

import java.util.Arrays;

//9. 다음은 3,4,5,6,7이 순차 저장되어 있는 배열의 0번째 위치에 새로운 자료 2를 삽입하여 배열
//        의 내용을 2,3,4,5,6,7로 변경하는 코드이다. 이 코드를 입력하고 실행해 보시오.
public class Test09 {
    public static void main(String[] args) {
        int n[]={3,4,5,6,7,0,0,0,0,0};
        for (int i = 4; i >=0; i--) n[i+1]=n[i]; // n[0..4]를 n[1..5]로 이동
        n[0]=2; // n[0]에 2를 삽입
        System.out.println(Arrays.toString(n)); // [2,3,4,5,6,7,0,0,0,0]
    }
}