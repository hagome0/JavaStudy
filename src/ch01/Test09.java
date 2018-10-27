package ch01;

//9. (실습) 다음 코드는 20억+20억을 출력하는 코드이다. 이 코드의 오류를 바로 잡으시오.
public class Test09 {
    public static void main(String[] args) {
        int n=2000000000;
//        System.out.println(n+n);
        System.out.println((long)n+n);
    }
}