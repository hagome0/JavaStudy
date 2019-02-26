package ch06;

//16. (피보나치수열: 비효율적 재귀호출 구현) 다음은 피보나치수열의 n(n>=0)번째 수를 반환하는
//        함수 fibo를 재귀함수로 구현한 코드이다. 그러나 이 코드에서는 fibo(n)을 얻기 위해 fibo(n-1)
//        과 fibo(n-2)를 호출하게 되고, fibo(n-1)을 계산하기 위해 fibo(n-3)와 fibo(n-2)를 호출하는 방
//        식을 사용하므로, fibo(n) 계산을 위해 호출하는 fibo(n-2)를 fibo(n-1)의 계산을 위해 중복 호
//        출하는 비효율이 발생한다. 아래 코드의 30을 50으로 수정 실행하여 소요 시간 지연을 확인
//        하시오.
//        - 점화식:
//        n<=1: fibo(n)=n
//        n>=2: fibo(n)=fibo(n-2)+fibo(n-1)
public class Test16 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    private static long fibo(int n) {
        if(n<2) return n;
        return fibo(n-2)+fibo(n-1);
    }
}