package ch04;

//18. (Generic 스택 클래스 구현: 동적 배열 기반) 아래 코드는 Generic 스택 클래스를 동적 배열로
//        구현한 코드이다.

public class Test18 {
    public static void main(String[] args) {
        SimpleStackG<Integer> stack1=new SimpleStackG<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1);
        SimpleStackG<String> stack2=new SimpleStackG<>();
        stack2.push("K");
        stack2.push("J");
        stack2.push("C");
        System.out.println(stack2);
    }
}