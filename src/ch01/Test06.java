package ch01;

//6. (실습) 다음 코드는 정수 n의 k번째 자리수를 출력하는 코드이다. 이 코드를 완성하시오.
public class Test06 {
    public static void main(String[] args) {
        int n=987654321;
        int k=4;

        String s = String.valueOf(n);
        System.out.println(s.charAt(s.length()-k));
    }
}