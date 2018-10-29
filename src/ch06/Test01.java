package ch06;
//1. (Factorial 계산: 반복) 다음은 n!을 반복적으로 계산하는 코드이다. 아래 코드를 입력하고 실행
//하면서 반복에 기반한 팩토리얼 구현을 익히시오.

public class Test01 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(n));
    }
    private static long fact(int n) {
        long v=1L;
        for (int i = 2; i <= n; i++) v*=i;
        return v;
    }
}