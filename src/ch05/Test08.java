package ch05;

//8. (실습: 미로 최단 경로 탐색) 이전 문제의 미로 탐색 코드를 수정하여 아래와 같이 시작위치
//(0,0)로부터 종료위치 (5,7)까지의 최단 경로를 추가 출력하도록 하시오.
//01 02 03 04 05 06 07 00
//00 00 04 00 06 00 08 00
//07 06 05 06 07 08 09 00
//08 00 00 00 00 00 10 00
//09 10 11 12 13 00 00 00
//00 00 00 13 14 15 16 17
//(0,0)(0,1)(0,2)(1,2)(2,2)(2,1)(2,0)(3,0)(4,0)(4,1)(4,2)(4,3)(5,3)(5,4)(5,5)(5,6)(5,7)
import java.util.LinkedList;
import java.util.Stack;

public class Test08 {
    public static void main(String[] args) {
        class Point {
            int x, y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
            @Override
            public String toString(){
                return "("+x+","+y+")";
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

        Stack<Point> stack = new Stack<>();
        stack.push(new Point(5,7));

        while (true){
            Point p = stack.peek();
            if (p.x==0 && p.y==0)break;
            for (int i = 0; i < dx.length; i++) {
                int x = p.x + dx[i];
                int y = p.y + dy[i];

                if (x < 0 || x >= R || y < 0 || y >= C || maze[x][y] == '#') continue;
                if(cost[x][y] == cost[p.x][p.y]-1) {
                    stack.push(new Point(x,y));
                    break;
                }
            }
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop());
    }

    private static void printMaze(char[][] maze) {
        for (int i = 0; i < maze.length; i++) System.out.println(maze[i]);
        System.out.println();
    }
}