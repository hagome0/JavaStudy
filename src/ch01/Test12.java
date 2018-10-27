package ch01;

//12. (실습) 다음은 배열 n의 내용을 출력하는 코드이며, 그 출력이 [77, 88, 99]라고 한다. 이 코드
//를 완성하시오.
public class Test12 {
    public static void main(String[] args) {
        int n[]={77,88,99};
        String v="";
        for (int i = 0; i < n.length; i++) {
            v+=n[i];
            if(i<n.length-1)
                v+=", ";
        }
        System.out.println("["+v+"]");
    }
}