package ch04;

import java.util.Stack;

//6. (실습: 스택 활용 괄호쌍매칭판단) 다음은 문자열 s 내 괄호쌍매칭여부를 스택을 이용하여 판
//        단한 후 그 결과를 true, false로 반환하는 코드이다. 이 코드를 완성하시오. 괄호 문자로는
//        (,),{,},[,]를 모두 처리할 수 있도록 하시오.
public class Test06 {
    public static void main(String[] args) {
        String s="부산({Busan}[(Boo)(saan)])시청({City}{hall}[(See)(Cheong)])"; // true
        System.out.println(checkParen(s));
    }
    private static boolean checkParen(String s) {
        Stack<Character> stack=new Stack<>();

        for (Character c: s.toCharArray()) {
            if (c=='(' || c=='[' || c=='{')stack.push(c);
            else if(c==')' && stack.pop()!='(')return false;
            else if(c==']' && stack.pop()!='[')return false;
            else if(c=='}' && stack.pop()!='{')return false;
            else continue;
        }
        return stack.empty();
    }
}