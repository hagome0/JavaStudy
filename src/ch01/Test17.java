package ch01;

import java.util.Arrays;

//17. (실습) 다음은 배열의 내용을 오름차순 정렬한 후 for-문에서 내림차순으로 출력(배열의 마지
//        막 원소부터 첫 원소까지 출력)하는 코드이다. 이 코드를 완성하시오.
//        - 실행 결과 예시: 9 9 8 7 5 5 4 3 2 1
public class Test17 {
    public static void main(String[] args) {
        int n[]={5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);
        for (int i=n.length-1; i>=0; i--) {
            System.out.print(n[i] + " ");
        }
    }
}