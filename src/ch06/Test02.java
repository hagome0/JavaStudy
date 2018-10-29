package ch06;

//2. (Factorial 계산: 재귀) 다음은 n!을 재귀적으로 계산하는 코드이다. 아래 코드를 입력하고 실행
//        하면서 재귀(recursion)에 기반한 팩토리얼 구현을 익히시오. 점화식은 다음과 같다.
//        - 점화식
//        n=0 : fact(n)=1
//        n>=1: fact(n)=n*fact(n-1)
public class Test02 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(n));
    }
    private static long fact(int n) {
        if (n==1)return 1;
        return n*fact(n-1);
    }
}