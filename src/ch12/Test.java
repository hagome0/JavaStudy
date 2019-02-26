package ch12;

//2. (실습: find by path compression & union by rank) 다음은 경로압축을 병행하는 find 연산과
//        rank에 기반한 union 연산을 활용하여 서로소집합을 효율적으로 구현한 코드이다. 아래 코드
//        를 입력하고 실행하면서 서로소집합을 위한 union-find 연산 구현법을 학습하시오. (Reference:
//        https://algs4.cs.princeton.edu/15uf/UF.java.html, GPLv3, Reference:
//        https://en.wikipedia.org/wiki/Disjoint-set_data_structure, CC-BY-SA)
//        - 실습 #1: 아래 find 함수는 재귀적으로 구현되었다. 이를 비재귀적으로 동작하도록 다시
//        작성하시오.
//        - 실습 #2: 아래 main 함수의 마지막 문장은 그래프 내 연결요소의 총 개수 uf.count를 출력한다.
//        이 문장이 정상 동작하도록 UF 클래스를 수정하시오. 힌트: 최초 연결요소의 수는 그래프 내
//        전체 노드의 수와 같으며, 이후 합집합 연산이 1회 발생할 때마다 연결요소의 수는 1씩
//        감소한다.
public class Test {
    public static void main(String[] args) {
        int N=10;
        UF uf=new UF(N);
        System.out.println(uf);
        uf.union(0,1);
        uf.union(2,3);
        uf.union(4,5);
        uf.union(6,7);
        uf.union(8,9);
        uf.union(0,2);
        uf.union(4,6);
        uf.union(0,4);
        System.out.println(uf);
        System.out.println(uf.find(1)==uf.find(6));
//System.out.println("연결요소 개수 = "+uf.count);
    }
}
