package ch10;

import java.util.Arrays;

//10장은 리무브랑 에드만 보는 부분이다.
public class Test {
    public static void main(String[] args) {
        int v[]={4, 2, 9, 5, 7, 5, 8, 10, 15};
        SimpleHeap heap=new SimpleHeap();
        for (int i = 0; i < v.length; i++) {
            heap.add(v[i]);
            System.out.println(heap);
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(heap.remove()+"=>"+heap);
        }
    }
}
