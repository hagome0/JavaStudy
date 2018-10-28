package ch05;

//5. (실습) 다음 코드는 길이 30의 문자열 s에 저장된 문자들을 5행 6열의 이차원배열 maze에 저
//        장한 후 출력하는 코드이다. 이 코드를 완성하시오.
//        - 실행결과:
//        012345
//        678901
//        234567
//        890123
//        456789
public class Test05 {
    public static void main(String[] args) {
        int R=5, C=6;
        String s="012345678901234567890123456789";
        char maze[][]=new char[R][C];

        for (int i = 0; i < s.length(); i++) {
            maze[i/C][i%C] = s.charAt(i);
        }

        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j < maze[i].length; j++) System.out.print(maze[i][j]);
            System.out.println();
        }
    }
}