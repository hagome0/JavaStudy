package ch02;

import java.util.LinkedList;

//12. (배열 및 연결리스트 삽입 시간 비교) 다음은 10000개 자료를 배열과 연결리스트의 0번째 위
//        치에 반복적으로 삽입하는 총 소요 시간을 비교하는 코드이다. 이 코드를 입력하고 실행해 보
//        시오.
public class Test12 {
    public static void main(String[] args) {
        long start;
        int N=10000; // 자료 개수
        int s[]=new int[N]; // 배열 생성
        LinkedList<Integer> list=new LinkedList<>(); // 리스트 생성
        start=System.currentTimeMillis();
        for (int i=0; i < N; i++){
            for (int j = i-1; j >=0; j--) s[j+1]=s[j]; // 배열 자료 전체 오른쪽 한칸 이동
            s[0]=i; // 배열 0번째 위치에 자료 삽입
        }
        System.out.println((System.currentTimeMillis()-start)+" ms");
        start=System.currentTimeMillis();
        for (int i=0; i < N; i++) list.addFirst(i); // 연결리스트 0번째 위치에 자료 삽입
        System.out.println((System.currentTimeMillis()-start)+" ms");
    }
}