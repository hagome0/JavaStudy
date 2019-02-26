package ch06;

//26. (실습: subset sum problem - 부분집합의 합 모든 해 탐색: 차감 기반 총합 검사) 이전 문제에
//        서는 부분집합의 총합을 계산하기 위해 누계 기반 방법을 사용하였다. 누계 기반 방법 대신,
//        도달되어야 할 총합(partialSum=K)에서 출발하여 하나의 부분집합에 속하는 정수들이 선택될
//        때마다 해당 정수를 partialSum에서 차감하는 방식으로 진행하여 하나의 부분집합이 결정되
//        는 시점에는 partialSum이 0이 되는지를 검사함으로써 부분집합의 총합 문제를 해결할 수 있
//        다. 이 방식으로 아래 코드를 완성하시오.
public class Test26 {
    static int sum=21;
    static int n[]={1,3,4,5,8,9};
    public static void main(String[] args) {
        int subset[]=new int[n.length];
        subsetSum(subset, 0, sum); // 최초 도달되어야 할 총합 sum에서 출발
    }
    private static void subsetSum(int[] subset, int i, int partialSum) {
        if (i==n.length){

            if (partialSum==0){
                for (int j = 0; j < subset.length; j++) {
                    if (subset[j]==1) System.out.print(n[j] + " ");
                }
                System.out.println();
            }
            return;
        }
        subset[i]=0;
        subsetSum(subset, i+1, partialSum);
        subset[i]=1;
        subsetSum(subset, i+1, partialSum-n[i]);
    }
}