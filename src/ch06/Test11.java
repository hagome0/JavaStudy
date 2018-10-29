package ch06;

//11. (실습: 대문자출현횟수) 다음 코드는 문자 배열 내 영어 대문자 출현 횟수를 계산하기 위해
//countUpper()를 호출하고 있다. 아래 코드를 완성하시오. (아스키 코드표 참고:
//https://en.wikipedia.org/wiki/ASCII)
public class Test11 {
    public static void main(String[] args) {
        String s="South, Korea";
        char v[]=s.toCharArray();
        System.out.println(countUpper(v, 0));
    }
    private static int countUpper(char[] v, int i) {
        if (v.length==i)return 0;
        return v[i]>='A'&&v[i]<='Z'?countUpper(v,i+1)+1:countUpper(v,i+1);
    }
}