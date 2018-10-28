package ch02;

import java.util.LinkedList;

//4. 다음은 리스트에 77,99,88을 순차 저장 후 0번째, 1번째, 2번째 각 자료를 읽은 후 출력하는
//        코드이다. 이 코드를 입력하고 실행해 보시오.
public class Test04 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(77);
        list.add(99);
        list.add(88);
        int v1=list.get(0);
        int v2=list.get(1);
        int v3=list.get(2);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}