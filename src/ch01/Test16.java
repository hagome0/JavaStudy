package ch01;

import java.util.Arrays;

//16. 다음은 배열의 내용을 오름차순 정렬하여 출력하는 코드이다. 아래 코드를 입력하고 실행해
//        보시오.
public class Test16 {
    public static void main(String[] args) {
        int n[]={5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
    }
}