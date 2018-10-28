package ch04;

import java.util.Arrays;
import java.util.Stack;

//19. (실습: stock span problem) n개 일별 주가(stock price)에 대해 특정 day의 span은 현재 day의
//        주가보다 크지 않은 연속된 이전 day들(현재 day 포함)의 최대 개수이다. stack span problem
//        은 n개 일별 주가에 대해 각 day의 span을 계산하는 것이다(아래 예 참조). stock span
//        problem을 해결하는 아래 코드를 완성하시오. (참고:
//        https://en.wikibooks.org/wiki/Data_Structures/Stacks_and_Queues#The_Stock_Span_Problem)
//        B. 구현 방법 #2 (시간복잡도 O(n)): n개 일별 주가가 배열에 저장되어 있다고 가정할 때 배
//        열 인덱스를 day 식별자로 고려하여, 시작 day부터 "각 day에 대해 현재 day의 주가보다
//        큰 주가를 보이는 day가 스택의 top에서 발견될 때까지 스택을 pop한 후, 현재 day와
//        스택의 top에 있는 day와의 일수 차이를 현재 day의 span에 저장한 다음, 현재 day를
//        스택에 push하는 작업"을 반복한다.
//        - 일별 주가:
//        100,90,80,70,85,95,110,120
//        - stock span:
//        1, 1, 1, 1, 3, 5, 7, 8
public class Test19B {
    public static void main(String[] args) {
        int price[]= {100,90,80,70,85,95,110,120};
        int span[]=new int[price.length];

        Stack<Integer> day = new Stack<>();
        for (int i = 0; i < price.length; i++) {
            while (!day.empty() && price[i] >= price[day.peek()]){
                day.pop();
            }
            span[i] = (day.empty())?i+1:i-day.peek();
            day.push(i);
        }

        System.out.println(Arrays.toString(span));
    }
}
