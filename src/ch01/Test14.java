package ch01;

import java.util.Random;

//14. (실습) 1개 주사위를 20회 던져 얻어진 각 눈의 값을 출력하는 작업을 시뮬레이션하는 코드를
//작성하시오. 다음은 출력 예시이다.
//- 출력 예시: 2 5 2 6 4 2 6 3 2 4 5 5 3 6 2 5 3 3 2 1
public class Test14 {
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            int value = rd.nextInt(6)+1;
            System.out.print(value + " ");
        }
    }
}
