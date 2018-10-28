package ch04;

//13. (실습: 배열 스택 기반 문자열 역순 출력) 다음은 문자열 s를 역순 출력하는 코드이다. Stack,
//        LinkedList 클래스를 사용하지 말고 이전 문제에서 예시한 배열 기반 스택을 사용하여 아래
//        코드를 완성하시오.
//        - 실행결과: .다이울서 는도수 의국민한대
public class Test13 {
    public static void main(String[] args) {
        String s="대한민국의 수도는 서울이다.";
        char stack[] = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            stack[++top] = s.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack[top--]);
        }
    }
}