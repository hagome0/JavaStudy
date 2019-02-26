package ch06;

//27. (실습: subset sum problem - 부분집합의 합 해 존재 여부 결정: 누계 기반) 다음은 입력으로
//        주어진 n개 정수 집합의 모든 부분집합 중 (부분집합에 속한) 정수의 합이 특정한 값이 되는
//        부분집합이 존재하는 경우 true를 그렇지 않은 경우 false를 출력하는 코드이다. 아래 코드는
//        최초 누계 값 0에서 출발하여 부분집합에 속하는 정수가 결정될 때마다 해당 정수를 누계 값
//        에 합산하는 식으로 진행하여 하나의 부분집합이 결정되는 시점에 누계 값이 도달되어야 할
//        총합과 일치하는지 여부를 검사하는 방법을 사용하였다. 아래 코드 중 두 번째 미완성코드를
//        이전 문제에서 설명한 차감 기반 방법으로 구현해 보시오.
//        - 입력(sum=21): 1,3,4,5,8,9
//        - 출력: true

//public class Test27 {
//    static int sum=31;
//    public static void main(String[] args) {
//        int n[]={1,3,4,5,8,9};
//        System.out.println(subsetSum(n, 0, 0));
//    }
//    private static boolean subsetSum(int[] n, int i, int partialSum) {
//        if(i==n.length) return partialSum==sum;
//        return subsetSum(n, i+1, partialSum) || subsetSum(n, i+1, partialSum+n[i]);
//    }
//}

public class Test27 { // 미완성 코드
    static int sum=21;
    public static void main(String[] args) {
        int n[]={1,3,4,5,8,9};
        System.out.println(subsetSum(n, 0, sum));
    }
    private static boolean subsetSum(int[] n, int i, int partialSum) {
        if (i==n.length) return partialSum==0;
        return subsetSum(n,i+1, partialSum)||subsetSum(n, i+1, partialSum-n[i]);
    }
}