package ch02;

import java.util.LinkedList;

//11. 다음은 리스트에 1,2,3을 순차 저장하고, 0번째 자료 위치에 7을 삽입하는 코드이다. 이 코드
//        를 입력하고 실행해 보시오.
public class Test11 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1); // list.addLast(1)와 동일
        list.add(2);
        list.add(3);
        list.addFirst(7);
        System.out.println(list);
    }
}