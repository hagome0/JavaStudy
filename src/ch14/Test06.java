package ch14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

//6. (실습: 배열 내 최빈값 탐색) 다음은 배열 n에 저장된 정수 중 재출현 빈도수가 최대인 정수
//        (최빈값,mode)를 출력하는 코드이다. 이 코드를 아래 각 실습 조건에 맞게 완성하시오. 예를
//        들어, {1,3,7,4,8,3,7,3,3,7}에서 최빈값은 3이다. (References: 프로그래밍대회에서 배우는 알고리
//        즘 문제해결전략, 2012, 구종만 저, (p.93-94))
//        - 실습 #1: 배열 n에 저장된 각 정수 n[i]에 대해, 배열 n에서의 n[i]의 빈도수를 계산하면서
//        그러한 빈도수가 최대인 값을 갱신하는 방식으로 구현하시오.
//        - 실습 #2: 배열 n을 정렬한 후, 정렬된 배열을 순차방문하면서 연속된 동일 값의 빈도수를
//        계산하여 그러한 빈도수가 최대인 값을 갱신하는 방식으로 구현하시오.
//        - 실습 #3: HashMap을 이용하여 구현하시오. HashMap의 key는 n[i]이며, value는 n[i]의 빈도수가
//        되도록 한다. 배열 n의 각 정수 n[i]에 대해 key값 n[i]가 HashMap에 존재하지 않는 경우 빈도수
//        1을 value로 설정하여 HashMap에 저장하고, n[i]가 HashMap에 존재하는 경우 기존 빈도수의 1
//        증가된 값을 value로 설정하여 HashMap에 재저장한다.
//        - 실습 #4: TreeMap을 이용하여 구현하시오. TreeMap의 key는 n[i]이며, value는 n[i]의 빈도수가
//        되도록 한다. 구현 방법은 HashMap의 경우와 동일하다.
//        - 실습 #5: 배열 n에 저장된 정수는 그 범위가 0~100이라고 가정하고, 계수정렬 기법을
//        활용하여 구현하시오. 이 실습의 경우 아래 코드에서 n[i]=random.nextInt(N/2) 문장을
//        n[i]=random.nextInt(101)로 변경하여 구현하시오.
//        - 실습 #6: N=1000000으로 설정하여 실습 #1~#5까지 구현 방법들의 소요 시간을 비교해 보시오.
public class Test06 {
    public static void main(String[] args) {
        Random random = new Random();
        int N = 10000;
        int n[] = new int[N];
        for (int i = 0; i < n.length; i++) n[i] = random.nextInt(N / 2);

        System.out.println(hfv(n));
    }

    private static int hfv(int[] n) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int i = 0; i < n.length; i++)
        {
            if (m.containsKey(n[i])) {
                // 값이 있는 경우
                int freq = m.get(n[i]);
                freq++;
                m.put(n[i], freq);
            } else {
                //  처음 등장
                m.put(n[i], 1);
            }
        }

        int maxFreq=0, maxValue=n[0];
        for (Integer key : m.keySet()) {
            int freq=m.get(key);
            if (freq>maxFreq) {
                maxFreq=freq;
                maxValue=key;
            }
        }
        return maxValue;
    }
}