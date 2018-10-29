package ch06;

//5. (Power 함수: 재귀) 다음은 m의 n승을 재귀적으로 계산하는 보다 효율적인 코드이다. 아래 코
//        드를 입력하고 실행하면서 재귀에 기반한 power 함수 구현을 익히시오. 점화식은 다음과 같
//        다. (참고: C언어로 쉽게 풀어 쓴 자료구조. 천인국 외 2인. 생능출판사. 2017.)
//        - 점화식
//        n=0: power(m,n)=1
//        n>0 AND n이 짝수: power(m,n)=power(m*m,n/2)
//        n>0 AND n이 홀수: power(m,n)=power(m*m,n/2)*m
public class Test05 {
    public static void main(String[] args) {
        System.out.println(power(2,60));
    }
    private static long power(long m, long n) {
        if(n==0) return 1;
        return power(m*m,n/2)*(n%2==0? 1:m);
    }
}