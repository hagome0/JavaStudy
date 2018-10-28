package ch05;

import java.util.LinkedList;

//6. (BFS 기반 미로 완전 탐색) 다음은 큐를 이용하여 미로 내 이동 가능한 모든 위치를 방문하는
//코드이다. 미로는 이차원배열 maze로 표현되며 이동 가능, 불가능 위치에 각각 '0', '#'의 값이
//저장되어 있다. 미로 탐색의 시작 위치는 maze[0][0]으로 가정한다. 큐를 이용한 미로 완전 탐
//색 과정은 다음과 같다. (아래 코드는 "프로그래밍 콘테스트 챌린징, Akiba 등 공저, 로드북,
//2011, p51~53"의 코드를 참조하여 작성되었음)
//- Step-1: 시작 위치 (0,0)를 방문 표시 후(maze[0][0]에 'v'를 저장), 시작 위치를 공백 큐에
//삽입한다.
//- Step-2: 큐가 비어 있지 않은 동안, "큐에서 가장 오래 전에 방문했던 위치를 추출하여 그
//위치의 상하좌우 위치들 중 이동가능한 미방문 위치들을 방문 표시 후 큐에 삽입"하는
//절차를 반복한다.
public class Test06 {
    public static void main(String[] args) {
        class Point {
            int x, y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
        int R = 6, C = 8;
        String input =
                "0000000#" +
                        "##0#0#0#" +
                        "0000000#" +
                        "0#####0#" +
                        "00000###" +
                        "###00000";
        char maze[][] = new char[R][C];
        for (int i = 0; i < input.length(); i++) maze[i / C][i % C] = input.charAt(i);
        LinkedList<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Point p = queue.removeFirst();
            for (int i = 0; i < dx.length; i++) {
                int x = p.x + dx[i];
                int y = p.y + dy[i];

                if (x < 0 || x >= R || y < 0 || y >= C || maze[x][y] == 'v' || maze[x][y] == '#') continue;
                maze[x][y] = 'v';
                queue.addFirst(new Point(x, y));
            }
        }
        printMaze(maze);

    }

    private static void printMaze(char[][] maze) {
        for (int i = 0; i < maze.length; i++) System.out.println(maze[i]);
        System.out.println();
    }
}