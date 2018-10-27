package ch01;

//2. (실습) 다음 도서 정보를 서로 다른 변수에 저장한 후 출력하는 코드를 작성하시오.
//‐ 영화제목: "자료구조"
//‐ 개봉년도: 2017
//‐ 상영시간(시간): 2.5
//‐ 더빙판존재유무: true
//‐ 언어: '한'
public class Test02 {
    public static void main(String[] args) {
        String title = "자료구조";
        int year = 2017;
        double length = 2.5;
        boolean dubbing = true;
        char language = '한';

        System.out.println("-영화제목:"+title);
        System.out.println("-개봉년도:"+year);
        System.out.println("-상영시간(시간):"+2.5);
        System.out.println("-더빙판존재유무:"+dubbing);
        System.out.println("-언어:"+language);
    }
}
