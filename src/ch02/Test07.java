package ch02;

import java.util.LinkedList;

//7. 다음은 리스트에 77,99,88을 순차 저장하고, 1번째 자료를 삭제한 후 리스트 내용을 출력하는
//        코드이다. 이 코드를 입력하고 실행해 보시오.
public class Test07 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(77);
        list.add(99);
        list.add(88);
        list.remove(1);
        System.out.println(list);
    }
}