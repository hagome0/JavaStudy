package ch07;

public class Test {
    public static void main(String[] args){
        char ch = 'Y';
        char upperCase = (char)(ch&~32);// ch를 32의 반전 비트와 and 연산
        char lowerCase = (char)(ch|32); // ch를 32와 or 연산

        System.out.println("upperCase : " + upperCase);
        System.out.println("lowerCase : " + lowerCase);
    }
}
