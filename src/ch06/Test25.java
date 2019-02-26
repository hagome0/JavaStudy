package ch06;

//25. (subset sum problem - 부분집합의 합 모든 해 탐색: 누계 기반 총합 검사) 다음은 입력으로
//        주어진 n개 정수 집합의 부분집합에 속한 정수들의 합이 특정한 값이 될 수 있는 경우 그러
//        한 모든 부분집합들을 출력하는 코드이다. 이전의 구현에서는 하나의 부분집합이 결정된 시점
//        에 부분집합에 속하는 정수들의 합 조건 검사를 수행하였다. 아래 구현에서는 최초 0의 누계
//        값(partialSum=0)에서 출발하여 하나의 부분집합에 속하는 각 정수가 선택되는 시점에 해당
//        정수를 partialSum에 누계해 나가면서 그 부분집합이 결정된 시점에는 최종 누계 값
//        (partialSum)이 도달되어야 할 총합과 일치하는지 여부를 검사하는 방법이 사용되었다.
//        - 입력(sum=21): 1,3,4,5,8,9
//        - 출력:
//        4,8,9
//        3,4,5,9
//        1,3,8,9
//        1,3,4,5,8
public class Test25 {
    static int sum=21;
    static int n[]={1,3,4,5,8,9};
    public static void main(String[] args) {
        int subset[]=new int[n.length];
        subsetSum(subset, 0, 0); // 최초 누계 값 0에서 출발
    }
    private static void subsetSum(int[] subset, int i, int partialSum) {
        if(i==n.length){
            if(partialSum==sum){
                for (int j = 0; j < subset.length; j++) if(subset[j]==1) System.out.print(n[j]+" ");
                System.out.println();
            }
            return;
        }
        subset[i]=0;
        subsetSum(subset, i+1, partialSum);
        subset[i]=1;
        subsetSum(subset, i+1, partialSum+n[i]);
    }
}