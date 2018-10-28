package ch04;

import java.util.Stack;

//2. (스택 동작 예시) 다음은 Stack 클래스를 사용하여 스택의 동작을 예시한 코드이다. 아래 코드
//        를 입력하고 실행해 보면서 스택 및 Stack 클래스의 동작을 이해하도록 하시오.
public class Test02 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("월");
        stack.push("화");
        stack.push("수");
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택 크기="+stack.size());
        System.out.println("스택이 비어 있는가? "+stack.isEmpty());
        String v;
        v=stack.peek(); // 스택의 top에 있는 자료를 제거하지 않고 그 값을 반환
        System.out.println("스택 top 위치 자료 확인="+v);
        v=stack.pop(); // 스택의 top에 있는 자료를 제거한 후 그 값을 반환
        System.out.println("스택 top 위치 자료 제거="+v);
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택 top 위치 자료 제거="+stack.pop());
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택 top 위치 자료 제거="+stack.pop());
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택이 비어 있는가? "+stack.isEmpty());
    }
}