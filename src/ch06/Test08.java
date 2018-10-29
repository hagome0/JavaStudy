package ch06;

//8. (실습: 재귀연습, 배열 최대값) 다음은 정수 배열의 최대값을 재귀적으로 계산하는 점화식과
//        코드의 일부분이다. 아래 코드를 완성하시오.
//        - 점화식
//        i=0: max(n,i)=n[i]
//        i>0: max(n,i)=n[i]와 max(n,i-1) 중 큰 값
public class Test08 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(max(n, n.length-1));
    }
    private static int max(int[] n, int i) {
        if (i==0)return n[0];
        return n[i]>max(n,i-1)?n[i]:max(n,i-1);
    }
}