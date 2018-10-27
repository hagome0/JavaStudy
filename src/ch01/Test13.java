package ch01;

import java.util.Random;

//13. 다음은 임의의 0~2 범위의 임의의 정수를 출력하는 코드이다. 아래 코드를 입력하고 실행해
//보시오.
public class Test13 {
    public static void main(String[] args) {
        Random random=new Random();
        int v=random.nextInt(3);
        System.out.println(v);
    }
}