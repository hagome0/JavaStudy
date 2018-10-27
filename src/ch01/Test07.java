package ch01;

//7. 다음 코드는 정수 자료형 int와 long의 최대값과 최소값을 출력한다. 이 코드를 입력하고 실
//행하시오.
public class Test07 {
    public static void main(String[] args) {
        int n=Integer.MAX_VALUE;
        int m=Integer.MIN_VALUE;
        System.out.println(n);
        System.out.println(m);
        long v=Long.MAX_VALUE;
        long w=Long.MIN_VALUE;
        System.out.println(v);
        System.out.println(w);
    }
}

//실행결과
// 2147483647
//-2147483648
//9223372036854775807
//-9223372036854775808
