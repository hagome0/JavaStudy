package ch02;

import java.util.LinkedList;

//6. (배열 및 연결리스트 임의 접근 총 소요 시간 비교) 다음은 배열과 연결리스트에 이미 전체
//        자료가 저장되어 있다고 가정하고, 저장된 전체 자료(예: 10000개)를 임의 접근하는 총 소요
//        시간을 비교하는 코드이다. 아래 코드를 입력하고 실행하면서 배열이 갖는 상수 시간 임의 위
//        치 접근의 장점과 리스트를 get(i)를 통해 접근하는 방식의 단점을 생각해 보시오.
public class Test06 {
    public static void main(String[] args) {
        int N=10000; // 자료 개수
        int s[]=new int[N]; // 배열 생성
        for (int i=0; i < N; i++) s[i]=i; // 배열 내 자료 저장
        LinkedList<Integer> list=new LinkedList<>(); // 리스트 생성
        for (int i=0; i < N; i++) list.add(i); // 리스트 내 자료 삽입
        long start;
        start=System.currentTimeMillis();
        for (int i = 0; i < N; i++){ int v=s[i]; }
        System.out.println((System.currentTimeMillis()-start)+" ms");
        start=System.currentTimeMillis();
        for (int i = 0; i < N; i++){ int v=list.get(i); }
        System.out.println((System.currentTimeMillis()-start)+" ms");
    }
}