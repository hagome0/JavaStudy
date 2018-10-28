package ch05;

import java.util.LinkedList;

//7. (실습: 미로 이동 거리 계산) 아래 사각행렬은 시작 위치 (0,0)으로부터 해당 위치로 이동한 총
//거리(시작 위치로의 이동 거리를 1로 가정)를 표시한 것이다. 미로 종료 위치를 (R-1,C-1)이라
//고 할 때, 아래 사각행렬은 미로의 시작위치로부터 종료위치까지의 최단거리가 17임을 보여준
//다. 이전 문제의 미로 탐색 코드를 수정하여 다음과 같은 사각행렬이 출력되도록 하시오.
//01 02 03 04 05 06 07 00
//00 00 04 00 06 00 08 00
//07 06 05 06 07 08 09 00
//08 00 00 00 00 00 10 00
//09 10 11 12 13 00 00 00
//00 00 00 13 14 15 16 17
public class Test07 {
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
        int[][] cost = new int[R][C];

        for (int i = 0; i < input.length(); i++) maze[i / C][i % C] = input.charAt(i);
        LinkedList<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        maze[0][0] = 'v';
        cost[0][0] = 1;
        int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Point p = queue.removeFirst();
            for (int i = 0; i < dx.length; i++) {
                int x = p.x + dx[i];
                int y = p.y + dy[i];

                if (x < 0 || x >= R || y < 0 || y >= C || maze[x][y] == 'v' || maze[x][y] == '#') continue;
                maze[x][y] = 'v';
                cost[x][y] = cost[p.x][p.y]+1;
                queue.addFirst(new Point(x, y));
            }
        }
        printMaze(maze);

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.printf("%02d ", cost[i][j]);
            }
            System.out.println();
        }

    }

    private static void printMaze(char[][] maze) {
        for (int i = 0; i < maze.length; i++) System.out.println(maze[i]);
        System.out.println();
    }
}