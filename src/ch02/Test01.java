package ch02;

import java.util.LinkedList;

//1. 다음은 리스트에 77,99,88을 순차 저장 후 리스트 전체 자료를 출력하는 코드이다. 리스트에
//        int 형의 정수를 저장하기 위해 int 자료형의 wrapper class인 Integer를 사용하여 LinkedList
//        객체를 생성하였다. LinkedList<int>로 작성할 경우 오류 발생하므로 주의하시오.
public class Test01 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(77); // list.addLast(77)와 동일
        list.add(99);
        list.add(88);
        System.out.println(list); // 리스트 내 전체 자료 출력
    }
}