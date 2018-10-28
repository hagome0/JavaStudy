package ch02;

import java.util.LinkedList;

//8. (실습) 1부터 100까지의 숫자들이 순차 저장된 리스트를 생성한 후 3번째 자료를 삭제한 다음
//리스트 내용 전체를 출력하는 코드를 작성하시오.
public class Test08 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        list.remove(2);

        System.out.println(list);
    }
}
