package ch03;

//10. (Generic 클래스 기반 연결리스트 구현) 다음은 generic 클래스 기반의 연결리스트를 구현한
//        코드이다. 아래 코드를 입력하고 실행하면서 그 내용을 학습하시오.

public class Test10 {

    public static void main(String[] args) {
        SimpleListG<Integer> listA=new SimpleListG<>();
        listA.addFirst(1);
        listA.addFirst(2);
        listA.addFirst(3);
        System.out.println(listA);
        SimpleListG<String> listB=new SimpleListG<>();
        listB.addFirst("Korea");
        listB.addFirst("Japan");
        listB.addFirst("China");
        System.out.println(listB);
        SimpleListG<Boolean> listC=new SimpleListG<>();
        listC.addFirst(true);
        listC.addFirst(true);
        listC.addFirst(false);
        System.out.println(listC);
    }
}