package ch09;

import java.util.TreeSet;

//2. (자바클래스 이진탐색트리) 다음은 자바클래스 TreeSet를 활용한 예시 코드이다. TreeSet은
//        red-black tree에 기반한 균형이진탐색트리를 구현한 자바클래스이다. 아래 코드를 입력하고
//        실행하면서 자바클래스 TreeSet의 사용법을 학습하시오.
public class Test02 {
    public static void main(String[] args) {
        int n[]={50,20,70,10,30,5,15,25,60,90,62,65,64,35};
        TreeSet<Integer> tree=new TreeSet<>();
        for (int i = 0; i < n.length; i++) tree.add(n[i]);
        System.out.println(tree.contains(30));
        System.out.println(tree.contains(33));
        System.out.println(tree);
    }
}