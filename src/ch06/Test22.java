package ch06;

//22. (실습) 20개 도시가 있으며 각 도시 쌍은 서로 연결된 도로가 있을 때, 20개 도시를 방문하는
//        각 경로에 대해 어떤 처리를 한다고 가정하자. 20개 도시를 순차 방문하는 모든 가능한 경로
//        는 총 몇 개인가?
//        - n!의 크기를 계산하는 함수 long fact(int n)를 작성하고, fact 함수를 이용하여 20!을 계산하여
//        출력해 보시오.
//        - 20!개의 경로를 모두 처리하는 시간을 초,분,시간,일,년 단위로 출력하시오. (1초에 1G개의
//        경로를 처리한다고 가정하시오.)

class Test22{
    public static void main(String[] args){
        long F = fact(20);
        System.out.println(F);
        int GB = 1000000;
        long time = F/GB;

        System.out.println(time/1000 + "초");
        System.out.println(time/1000/60 + "분");
        System.out.println(time/1000/60/60 + "시간");
        System.out.println(time/1000/60/60/24 + "일");
        System.out.println(time/1000/60/60/24/365 + "년");

    }

    private static long fact(int i) {
        if (i==1)return 1;
        return i*fact(i-1);
    }
}