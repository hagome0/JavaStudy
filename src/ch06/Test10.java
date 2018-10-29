package ch06;

//10. (실습: 대문자변환) 다음 코드는 문자 배열 내 영어 소문자를 대문자로 변환하기 위해 재귀함
//수 toUpper()를 호출하고 있다. 아래 코드를 완성하시오. (아스키 코드표 참고:
//https://en.wikipedia.org/wiki/ASCII).
public class Test10 {
    public static void main(String[] args) {
        String s="South, Korea 안녕";
        char v[]=s.toCharArray();
        toUpper(v, 0);
        System.out.println(v);
    }
    private static void toUpper(char[] v, int i) {
        if (i==v.length)return;

        v[i] = (v[i]>='a'&&v[i]<='z')?v[i]=(char)(v[i]-32):v[i];
        toUpper(v, i+1);
    }
}