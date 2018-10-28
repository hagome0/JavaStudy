package ch02;

import java.util.LinkedList;

//3. (실습) 리스트에 "한국", "미국", "일본"을 순차 저장한 후 리스트 전체 자료를 출력하는 코드를
//작성하시오. (참고: LinkedList<String> 사용)
public class Test03 {
    public static void main(String[] args) {
        String[] data = {"한국", "미국", "일본"};
        LinkedList<String> list = new LinkedList<>();

        for (String s:data)list.add(s);

        System.out.println(list);
    }
}
