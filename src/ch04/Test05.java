package ch04;

import java.util.Stack;

//5. (실습: 스택 활용 괄호쌍매칭판단) 다음은 문자열 s 내 괄호쌍매칭여부를 스택을 이용하여 판
//        단한 후 그 결과를 true, false로 반환하는 코드이다. 이 코드를 완성하시오. 괄호 문자로는 '('
//        와 ')'만 다루시오.
public class Test05 {
    public static void main(String[] args) {
        String s="(1+3*(4+5))/(6*(7+8))";
        System.out.println(checkParen(s));
    }
    private static boolean checkParen(String s) {
        Stack<Character> stack=new Stack<>();
        for (Character c : s.toCharArray()){
            if (c=='(')stack.push(c);
            else if (c==')') {
                if (stack.empty()){
                    return false;
                }
                stack.pop();
            }
            else continue;;
        }

        return stack.empty();
    }
}