package ch06;

//7. (실습: 재귀연습, 배열 총합) 다음은 정수 배열 n의 총합을 sum(n,0)의 호출로부터 시작하여
//재귀적으로 계산하는 코드이다. 점화식을 작성한 후 점화식에 기반하여 아래 코드의 재귀함수
//sum()을 완성하시오.
public class Test07 {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        System.out.println(sum(n, 0));
    }
    private static int sum(int[] n, int i) {
        if (i==n.length)return 0;
        return n[i]+sum(n,i+1);
    }
}