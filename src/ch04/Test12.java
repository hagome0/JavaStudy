package ch04;

import java.util.Arrays;

//12. (스택 개념: 배열 구현) 아래 코드는 스택을 배열로 간단 구현한 코드이다.
//        - top은 스택에 마지막으로 삽입된 자료의 위치 값을 보관한다. (초기값 -1)
//        - 스택에 새로운 자료 삽입(push) 시, top을 1 증가시킨 후 top 위치에 자료를 저장한다.
//        - 스택에서 자료 추출(pop) 시, top 위치의 자료를 추출하고, top을 1 감소시킨다.
//        아래 코드로는 스택 사용 상의 제약이 있다. (공백 스택 및 포화 스택 판단 필요)
//        - 공백 스택: top의 값이 -1이면 공백 스택이다.
//        - 포화 스택: top의 값이 스택 최대 크기보다 1 적은 값이면 포화 스택이다.
public class Test12 {
    public static void main(String[] args) {
        int stack[] = new int[5]; // 크기 5의 스택 생성
        int top = -1;
// 스택에 5, 9, 1을 차례로 삽입(push)
        stack[++top] = 5;
        stack[++top] = 9;
        stack[++top] = 1;
        System.out.println(Arrays.toString(stack)+", top="+top+", 스택 크기="+(top+1));
        System.out.println("스택이 비어 있는가? "+(top==-1));
        System.out.println("스택 peek: "+stack[top]); // 스택 top 확인 peek
        System.out.println("스택 pop: "+stack[top--]); // 스택에서 자료 추출(pop)
        System.out.println(Arrays.toString(stack)+", top="+top+", 스택 크기="+(top+1));
        System.out.println("스택 pop: "+stack[top--]); // 스택에서 자료 추출(pop)
        System.out.println(Arrays.toString(stack)+", top="+top+", 스택 크기="+(top+1));
        System.out.println("스택 pop: "+stack[top--]); // 스택에서 자료 추출(pop)
        System.out.println(Arrays.toString(stack)+", top="+top+", 스택 크기="+(top+1));
        System.out.println("스택이 비어 있는가? "+(top==-1));
    }
}