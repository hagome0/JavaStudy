package ch01;

import java.util.Arrays;
import java.util.Random;

//15. (실습) 1개 주사위를 6000회 던져 얻어진 각 눈의 출현 횟수를 출력하는 코드를 작성하시오.
//다음은 출력 예시이다.
//- 출력 예시: [984, 970, 1011, 1035, 1015, 985]
public class Test15 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] result = new int[6];
        for (int i = 0; i < 6000; i++) {
            int value = rd.nextInt(6)+1;
            result[value-1]++;
        }
        System.out.println(Arrays.toString(result));
    }
}
