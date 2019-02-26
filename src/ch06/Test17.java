package ch06;

//17. (피보나치수열: 메모이제이션 기반 재귀호출) 다음은 피보나치수열의 n(n>=0)번째 수를 반환
//        하는 함수 fibo를 재귀함수로 구현한 코드이다. 그러나 이전의 비효율적 재귀 호출 구현과 달
//        리 계산 시간을 줄이기 위해 이전에 계산되지 않은 피보나치 수는 계산 후 반환 전에 저장해
//        두고, 이전에 계산된 피보나치 수의 경우 저장된 값을 단순히 반환함으로써 동일 피보나치 수
//        에 대한 중복 계산을 피하고 있다.
//        - 실행결과: 12586269025
public class Test17 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    private static long fibo(int n) {
        long memo[]=new long[n+1];
        return fiboMemo(n, memo);
    }
    private static long fiboMemo(int n, long[] memo) {
        if(memo[n]>0) return memo[n];
        if(n<2) memo[n]=n;
        else memo[n]=fiboMemo(n-2, memo)+fiboMemo(n-1, memo);
        return memo[n];
    }
}