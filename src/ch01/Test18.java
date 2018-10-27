package ch01;

import java.util.Arrays;

//18. (실습) 다음은 배열의 내용을 오름차순 정렬한 후 for-문에서 내림차순으로 재정렬(배열의 내
//        용을 reverse)한 후 출력하는 코드이다. 이 코드를 완성하시오.
//        - 실행 결과 예시: 9 9 8 7 5 5 4 3 2 1
public class Test18 {
    public static void main(String[] args) {
        int n[]={5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);
        for (int i=0; i<n.length/2; i++) {
            int temp = n[i];
            n[i] = n[n.length-1-i];
            n[n.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(n));
    }
}