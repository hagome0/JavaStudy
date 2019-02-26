package ch06;

//8. (실습: 조합) 다음은 크기 N의 집합에서 K개 원소를 선택하는 모든 조합을 생성하는 코드이다.
//        아래 코드를 입력하고 실행하면서 조합 생성 코드 구현법을 익히시오.
//        - 실습: 아래 코드는 중복을 허용하지 않는 조합을 다룬다. 다음과 같이 중복을 허용하는
//        조합을 생성하도록 아래 코드를 수정하시오. 20000은 첫 번째 원소를 중복하여 2번 선택한
//        것을 의미한다.
//        20000
//        11000
//        10100
//        10010
//        10001
//        02000
//        01100
//        01010
//        01001
//        00200
//        00110
//        00101
//        00020
//        00011
//        00002
public class Test28B {
    public static void main(String[] args) {
        int N=5, K=2;
        int v[]=new int[N];
        genCombinations(N, K, 0, v, 0);
    }
    private static void genCombinations(int N, int K, int startIndex, int v[], int len) {
        if(len==K) {
            String s="";
            for (int i = 0; i < v.length; i++) s+=v[i];
            System.out.println(s);
            return;
        }
        for (int i = startIndex; i < N; i++) {
            v[i]=2;
            genCombinations(N, K, i+2, v, len+2);
            v[i]=1;
            genCombinations(N, K, i+1, v, len+1);
            v[i]=0;
        }
    }
}