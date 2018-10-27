package ch01;

//1. 다음은 도서 한 권의 제목(문자열), 출판년도(정수), 중량(실수), 부록존재여부(불리언), 언어(문
//자) 값을 각각 문자열, 정수, 실수, 불리언, 문자 자료형 변수에 저장한 후 출력하는 코드이다.
//아래 코드를 입력하고 실행하시오.

public class Test01 {
    public static void main(String[] args){
        String title="문제해결기법"; // 도서 제목, 문자열
        int publicationYear=2018; // 출판년도, 정수
        double weight=857.4; // 중량, 실수
        boolean supplementYN=false; // 부록 존재 여부, 불리언(true or false)
        char language='K'; // 언어, 문자
        System.out.println(title+","+publicationYear+","+weight+","+supplementYN+","+language);
    }
}
