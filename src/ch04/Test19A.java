package ch04;

import java.util.Arrays;

//19. (실습: stock span problem) n개 일별 주가(stock price)에 대해 특정 day의 span은 현재 day의
//        주가보다 크지 않은 연속된 이전 day들(현재 day 포함)의 최대 개수이다. stack span problem
//        은 n개 일별 주가에 대해 각 day의 span을 계산하는 것이다(아래 예 참조). stock span
//        problem을 해결하는 아래 코드를 완성하시오. (참고:
//        https://en.wikibooks.org/wiki/Data_Structures/Stacks_and_Queues#The_Stock_Span_Problem)
//        A. 구현 방법 #1 (시간복잡도 O(n2): n개 일별 주가가 배열에 저장되어 있다고 가정할 때 배
//        열 인덱스를 day 식별자로 고려하여, 각 day에 대해 현재 day의 주가보다 크지 않은 주
//        가를 보인 연속된 이전 day들의 수(현재 day 포함)를 현재 day의 span에 저장한다.
//        - 일별 주가:
//        100,90,80,70,85,95,110,120
//        - stock span:
//        1, 1, 1, 1, 3, 5, 7, 8
public class Test19A {
    public static void main(String[] args) {
        int price[]= {100,90,80,70,85,95,110,120};
        int span[]=new int[price.length];

        for (int i = 0; i < price.length; i++) {
            int spanNum = 1;
            for (int j = i-1; j >= 0; j--) {
                if (price[i] > price[j])
                    spanNum++;
                else {
                    break;
                }
            }
            span[i] = spanNum;
        }
        System.out.println(Arrays.toString(span));
    }
}
