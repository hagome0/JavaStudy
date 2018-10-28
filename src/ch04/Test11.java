package ch04;

import java.util.Stack;

//11. (실습: 스택 활용 후위표현식 계산기) 다음은 문자열 e에 저장된 후위표현식의 계산 결과를
//        출력하는 코드이다. 후위표현식에서 연산자는 +,-,*,/만 다루고, 각 피연산자들은 하나 이상의
//        공백 문자로 분리되어 있으며(피연산자와 연산자 사이 및 연산자들 사이에는 공백이 없을 수
//        있음에 주의할 것), 주어진 후위표현식에는 오류가 없으며 가정하시오. 이 코드를 완성하시오.
public class Test11 {
    public static void main(String[] args) {
        String e="34 12 25/*";
        System.out.println(postfixEval(e));
    }
    private static double postfixEval(String e) {
        Stack<Double> stack=new Stack<>();
        e = e.replaceAll("\\+", " +");
        e = e.replaceAll("-", " -");
        e = e.replaceAll("\\*", " *");
        e = e.replaceAll("/", " /");

        System.out.println(e);

        for (String token : e.split("\\s+")) {
            if (token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                if (token.equals("+")){
                    double n2 = stack.pop();
                    double n1 = stack.pop();
                    stack.push(n2+n1);
                }
                else if (token.equals("-")){
                    double n2 = stack.pop();
                    double n1 = stack.pop();
                    stack.push(n2-n1);
                }
                else if (token.equals("*")){
                    double n2 = stack.pop();
                    double n1 = stack.pop();
                    stack.push(n2*n1);
                }
                else if (token.equals("/")){
                    double n2 = stack.pop();
                    double n1 = stack.pop();
                    stack.push(n2/n1);
                }
            }
            else {
                stack.push(Double.valueOf(token));
            }

        }
        return stack.pop();
    }
}