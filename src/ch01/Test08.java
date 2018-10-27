package ch01;

//8. (실습) 다음은 200억에 해당하는 정수를 변수 n에 저장한 후 출력하는 코드이다. 이 코드의
//        오류를 바로 잡으시오.
public class Test08 {
    public static void main(String[] args) {
        //int n=20000000000; // 200억
        long n=20000000000L; // 200억

        System.out.println(n);
    }
}