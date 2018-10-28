package ch04;

import java.util.LinkedList;

//4. (실습: 스택 기반 문자열 역순 출력) 다음은 자바 클래스 LinkedList를 스택으로 이용하여 문자
//        열 s를 역순 출력하는 코드이다. 이 코드를 완성하시오. (addFirst, removeFirst를 push, pop으
//        로 활용, 혹은 addLast, removeLast를 push, pop으로 활용)
//        - 실행결과: .다이울서 는도수 의국민한대
public class Test04 {
    public static void main(String[] args) {
        String s="대한민국의 수도는 서울이다.";
        LinkedList<Character> stack=new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.addFirst(c);
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.removeFirst());
        }
        System.out.println();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.addLast(c);
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.removeLast());
        }

    }
}