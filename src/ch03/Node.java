package ch03;

//1. 다음은 클래스 Node의 정의문과 Node 객체 생성 예를 보인 것이다. 아래에 보인 클래스
//Node는 이 자료의 이후 코드들에서 반복 사용된다.
public class Node {
    int data;
    Node next;
    Node prev;
    public Node(int data) {
        this.data=data;
    }
}