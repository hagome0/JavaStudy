package ch01;

import java.util.Arrays;

//11. 다음은 크기 3의 배열에 77, 88, 99를 저장한 후 그 내용을 출력하는 서로 다른 방법들을 제
//        시한 코드이다. 아래 세 코드를 별도로 입력하고 실행하시오.

public class Test11 {
    public static void main(String[] args) {
        int n[];
        n=new int[3];
        n[0]=77;
        n[1]=88;
        n[2]=99;
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
//public class Test11 {
//    public static void main(String[] args) {
//        int n[]=new int[3];
//        n[0]=77;
//        n[1]=88;
//        n[2]=99;
//        for (int v : n) {
//            System.out.println(v);
//        }
//    }
//}
//public class Test11 {
//    public static void main(String[] args) {
//        int n[]={77,88,99};
//        System.out.println(Arrays.toString(n));
//    }
//}