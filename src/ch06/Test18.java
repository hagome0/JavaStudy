package ch06;

//18. (실습: 피보나치수열) 피보나치수열의 n(n>=0)번째 수를 반환하는 함수 fibo를 반복적으로 구
//        현하는 아래 코드를 완성하시오.
public class Test18 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    private static long fibo(int n) {
        if (n<=1) return 1;
        long[] F = new long[n];
        F[0] = 1;
        F[1] = 1;

        for (int i = 2; i < n; i++) {
          F[i] = F[i-1] + F[i-2];
        }

        return F[n-1];
    }
}