package ch04;

//3. (실습: 스택 기반 문자열 역순 출력) 다음은 자바 클래스 Stack을 이용하여 문자열 s를 역순
//        출력하는 코드이다. 이 코드를 완성하시오.
//        - 실행결과: .다이울서 는도수 의국민한대

import java.util.Stack;

public class Test03 {
    public static void main(String[] args) {
        String s = "대한민국의 수도는 서울이다.";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.push(c);
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}