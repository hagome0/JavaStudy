package ch06;

//9. (실습: 재귀연습, 배열 최대값) 다음 재귀적 접근에 따라 배열의 최대값을 재귀적으로 계산하
//        는 아래 코드를 완성하시오..
//        - 재귀적 접근: 배열의 최대값은 왼쪽 반의 최대값과 오른쪽 반의 최대값 중 큰 값
public class Test09 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(sum(n, 0, n.length-1));
    }
    private static long sum(int[] n, int low, int high) {
        if (low==high)return n[low];

        int mid = (low+high)/2;

        long v1 = sum(n,low,mid);
        long v2 = sum(n,mid+1, high);

        return v1>v2?v1:v2;
    }
}