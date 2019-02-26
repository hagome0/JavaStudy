package ch06;

import java.util.Random;

//15. (실습: DFS, Depth First Search) 아래 예시와 같이 표현된 2차원 평면 내 물웅덩이 개수를 구
//        하는 아래 코드를 완성하시오. 아래 예시에서 문자 ‘0’은 마른 위치이고 문자 ‘1’은 젖은 위치
//        를 표현한다. 하나의 물웅덩이는 상하, 좌우, 대각선 위치의 연속된 1로 이어진 공간으로 정의
//        한다. 아래 예시에서 물웅덩이는 3개이다. (Reference: "프로그래밍 콘테스트 챌린징", Akiba 등
//        저, 박건태, 김승엽 역, 로드북, 2011. pp.47-49)
//        01111
//        00101
//        00001
//        10000
//        10111
//         물웅덩이 개수: 3개
//        - 실습 #1: ‘0’, ‘1’로 표현된 R x C 크기 평면 내 물웅덩이 개수를 구하는 아래 코드를
//        완성하시오. 해결 방법은 다음과 같다. 평면 상의 각 위치를 검사하면서 젖은 위치인 경우
//        해당 위치가 포함된 하나의 물웅덩이를 탐색하는 함수 dfs를 호출한 후 물웅덩이 개수를 1
//        증가시킨다. dfs 함수는 젖은 위치 좌표를 파라미터로 전달받아 해당 위치를 마른 위치로
//        변경한 후 그 위치의 상하좌우대각선 방향 각 인접 위치를 검사하여 젖은 위치가 있으면 dfs
//        함수를 재귀호출한다.
//        - 실습 #2: 물웅덩이 각각의 크기를 출력하는 코드를 추가하시오. 특정 물웅덩이의 크기는
//        해당 물웅덩이를 구성하는 젖은 위치의 개수로 정의한다. 위 예의 경우 3개 물웅덩이 각각의
//        크기에 해당하는 7, 2, 3이 출력되어야 한다.
public class Test15A {
    public static void main(String[] args) {
        int R = 5, C = 5, count = 0;
        char ground[][] = new char[R][C];
        Random random = new Random();
        for (int i = 0; i < ground.length; i++) { // 임의 개수의 물웅덩이 포함 평면 생성
            for (int j = 0; j < ground[i].length; j++) ground[i][j] = (random.nextInt(3) == 0) ? '1' : '0';
        }
        for (int i = 0; i < ground.length; i++) { // 평면 출력
            for (int j = 0; j < ground[i].length; j++) System.out.print(ground[i][j]);
            System.out.println();
        }

        for (int i = 0; i < ground.length; i++) {
            for (int j = 0; j < ground[i].length; j++) {
                if (ground[i][j] == '1') {
                    dfs(ground, R, C, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);


    }

    private static void dfs(char[][] ground, int R, int C, int i, int j) {
        ground[i][j] = '0';
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};

        for (int k = 0; k < dx.length; k++) {
            int px = i + dx[k];
            int py = j + dy[k];

            if (px >= 0 && px < R && py >= 0 && py < C && ground[px][py] == '1') {
                dfs(ground,R,C,px,py);
            }
        }


    }
}