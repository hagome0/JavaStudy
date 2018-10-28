package ch04;

import java.util.Stack;

//7. (후위표현식 계산 과정 예시) 다음은 스택을 이용한 후위표현식 3 4 5 + *의 계산 과정을 예
//        시한 코드이다. 아래 코드를 입력하고 실행해 보시오.
public class Test07 {
    public static void main(String[] args) {
        int n1, n2;
        Stack<Integer> stack=new Stack<>();
        stack.push(3); // 피연산자 3 => push
        stack.push(4); // 피연산자 4 => push
        stack.push(5); // 피연산자 5 => push
// 연산자 +
        n2=stack.pop();
        n1=stack.pop();
        stack.push(n1+n2);
// 연산자 *
        n2=stack.pop();
        n1=stack.pop();
        stack.push(n1*n2);
        System.out.println("계산결과="+stack.pop());
    }
}