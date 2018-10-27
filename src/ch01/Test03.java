package ch01;

//3. 다음 코드를 입력하고 실행해 보면서, + 연산자의 의미 차이를 이해하시오.
public class Test03 {
    public static void main(String[] args) {
        String s1 = "123" + "456";
        System.out.println(s1);
        String s2 = "123" + 456;
        System.out.println(s2);
        String s3 = 123 + "456";
        System.out.println(s3);
        String s4 = "" + 123 + 456;
        System.out.println(s4);
        String s5 = 123 + 456 + "";
        System.out.println(s5);
    }
}