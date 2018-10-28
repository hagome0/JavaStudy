package ch04;

//14. (스택 개념: 배열 구현) 아래 코드는 스택 클래스를 배열로 간단 구현한 코드이다. 이대로는
//        사용 상의 제약이 있다.
//        - 스택에 자료 삽입 시 스택의 가용 공간 유무에 대한 검사 부재
//        - 스택에서 자료 추출 시 스택이 비어 있는 상태인지에 대한 검사 부재

public class Test14 {
    public static void main(String[] args) {
        SimpleStack stack=new SimpleStack(10); // 크기 10의 Stack 생성
// 스택에 5 9 1 순차 삽입
        stack.push(5);
        stack.push(9);
        stack.push(1);
        System.out.println(stack); // 스택 출력
        int data=stack.pop(); // 스택에서 자료 추출
        System.out.println("Data deleted from stack:"+data);
        System.out.println(stack); // 스택 출력
    }
}