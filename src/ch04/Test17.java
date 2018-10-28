package ch04;

//17. (실습: 동적 배열 기반 스택 클래스 구현) 아래 코드는 스택 클래스를 동적 배열로 구현한 코
//        드이다. 스택 full인 경우 배열의 크기를 2배로 증가시킨다. 스택 포화를 검사하는 full() 메소
//        드와 스택이 비어 있는지 검사하는 empty() 메소드가 구현되어 있다.
//        - 실습: SimpleStack 클래스에 peek()을 구현하시오. peek()은 pop()과 같으나 top의 위치를 변경하지
//        않는다.

public class Test17 {
    public static void main(String[] args) {
        SimpleStack stack=new SimpleStack();
        for (int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println(stack); // 스택 출력
        }

        System.out.println("stack top value : " + stack.peek());

        for (int i = 0; i < 10; i++){
            int data=stack.pop(); // 스택에서 자료 추출
            System.out.println("Data deleted from stack:"+data);
            System.out.println(stack); // 스택 출력
        }


    }
}