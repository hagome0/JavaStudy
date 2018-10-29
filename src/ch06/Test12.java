package ch06;

//12. (실습: 재귀 기반 palindrome 검사) 다음은 문자열의 내용이 회문(palindrome)인지 여부를 검
//        사하기 위해 재귀함수 palindrome(s, 0)을 호출하고 있다. 아래 재귀함수 palindrome을 완성하
//        시오.
public class Test12 {
    public static void main(String[] args) {
        String s="ABCDEDCBA";
        System.out.println(palindrome(s, 0));
    }
    private static boolean palindrome(String s, int i) {
        if (i==s.length())return true;
        return s.charAt(i)==s.charAt(s.length()-1-i)&&palindrome(s,i+1);
    }
}