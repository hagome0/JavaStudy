package ch06;

//6. (실습: 재귀연습, 배열 총합) 다음은 정수 배열 n의 총합을 재귀적으로 계산하는 점화식과 코
//        드를 보인 것이다. 아래 점화식을 참고하여 재귀함수 sum()을 완성하시오. 아래 코드에서 재
//        귀함수 호출은 sum(n, n.length-1)로부터 시작하고 있다.
//        - 점화식
//        i=0: sum(n,i)=n[0]
//        i>0: sum(n,i)=n[i]+sum(n,i-1)
public class Test06 {
    public static void main(String[] args) {
        int n[]={7,2,8,4,1};
        System.out.println(sum(n, n.length-1));
    }
    private static int sum(int[] n, int i) {
        if (i<0)return 0;

        return n[i]+sum(n, i-1);
    }
}