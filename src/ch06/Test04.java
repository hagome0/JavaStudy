package ch06;

//4. (Power 함수: 재귀) 다음은 m의 n승을 재귀적으로 계산하는 코드이다. 아래 코드를 입력하고
//        실행하면서 재귀에 기반한 power 함수 구현을 익히시오. 점화식은 다음과 같다.
//        - 점화식
//        n=0: power(m,n)=1
//        n>0: power(m,n)=m*power(m,n-1)
public class Test04 {
    public static void main(String[] args) {
        int m=2, n=60;
        System.out.println(power(2,60));
    }
    private static long power(long m, long n) {
        if(n==0) return 1;
        return m*power(m,n-1);
    }
}