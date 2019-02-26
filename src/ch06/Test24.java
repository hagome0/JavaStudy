package ch06;

import java.util.Arrays;

//24. (실습: subset sum problem - 부분집합의 합 모든 해 탐색) 다음은 입력으로 주어진 n개 정수
//        집합의 부분집합에 속한 정수들의 합이 특정한 값이 될 수 있는 경우 그러한 모든 부분집합
//        들을 출력하는 코드이다. 이 코드를 완성하시오. (참조:
//        https://en.wikipedia.org/wiki/Subset_sum_problem)
//        - 입력(sum=21): 1,3,4,5,8,9
//        - 출력:
//        4,8,9
//        3,4,5,9
//        1,3,8,9
//        1,3,4,5,8
//        - 구현 방법: 입력 정수 배열과 같은 크기 N의 정수 배열 subset을 만든 후, 배열 subset이
//        모든 가능한 N-자리 이진비트열 표현을 순차 생성하는 코드를 작성한 다음, 배열 subset이
//        표현하는 이진비트열의 각 비트값 0,1을 입력 배열 n 내 대응하는 각 원소를 부분집합에
//        포함할 것인지 포함하지 않을 것인지로 해석하여 이후 부분집합의 합 검사를 진행한다. 예를
//        들어 subset 배열이 {0,0,1,0,1,1}인 경우 이를 입력 배열 n에서 n[2],n[4],n[5]에 해당하는 정수들의
//        부분집합 {4,8,9}을 표현하는 것으로 해석하여 4+8+9=21인지 여부를 검사한다.
public class Test24 {
    static int sum=21; // 부분집합 내 정수들의 합이 되어야 할 값
    static int n[]={1,3,4,5,8,9}; // 입력: n개 정수
    public static void main(String[] args) {
        int subset[]=new int[n.length];
        subsetSum(subset, 0);
    }

    private static void subsetSum(int[] subset, int i) {
        if (i==n.length){
            int sum2 = 0;
            for (int j = 0; j < subset.length; j++)if (subset[j]==1)sum2+=n[j];
            if (sum2==sum){
                for (int j = 0; j < subset.length; j++) {
                    if (subset[j]==1) System.out.print(n[j] + " ");
                }
                System.out.println();
            }
            return;
        }
        subset[i]=0;
        subsetSum(subset, i+1);
        subset[i]=1;
        subsetSum(subset, i+1);

    }
}