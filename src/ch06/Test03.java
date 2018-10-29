package ch06;

//3. (Power 함수: 반복) 다음은 m의 n승을 계산하는 코드로 m을 n회 반복적으로 곱하여 m의 n
//        승을 계산한다. 아래 코드를 입력하고 실행하면서 반복 기반 power 함수 구현을 익히시오.
public class Test03 {
    public static void main(String[] args) {
        int m=2, n=10;
        System.out.println(power(m,n));
    }
    private static long power(int m, int n) {
        long v=1;
        for (int i = 0; i < n; i++) v*=m;
        return v;
    }
}