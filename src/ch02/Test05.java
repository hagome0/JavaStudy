package ch02;

import java.util.LinkedList;
import java.util.Random;

//5. (실습) 0~100까지의 범위의 임의 정수를 1000000(백만)개 생성하면서 생성된 순서대로 정수를
//        LinkedList에 저장한 후 리스트 내 99999번째 자료를 출력하는 코드를 작성하시오.
public class Test05 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rd = new Random();

        for (int i = 0; i < 1000000; i++) {
            int random = rd.nextInt(101);
            list.add(random);
        }

        System.out.println(list.get(99999));
    }
}
