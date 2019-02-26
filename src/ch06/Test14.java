package ch06;

//14. (실습: 최대공약수) 다음은 두 수의 최대공약수(GCD, Greatest Common Divisor)를 계산하는 유
//        클리드 호제법을 보인 것이다. 아래 코드의 함수 gcd를 재귀 및 비재귀 방식으로 각각 구현
//        하시오.
//        - 유클리드 호제법:
//        b=0: gcd(a,b)=a
//        b>0: gcd(a,b)=gcd(b,a%b)
public class Test14 {
    public static void main(String[] args) {
        System.out.println(gcd(64,48));
    }
    private static int gcd(int a, int b) {
        return  b>0?gcd(b,a%b):a;
    }
}