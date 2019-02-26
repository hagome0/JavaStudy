package ch14;

//2. (해싱, 체인법) 다음은 체인법으로 해싱을 구현한 코드이다. 아래 코드를 입력하고 실행하면서
//        해싱 구현법을 학습하시오. (Reference: http://opendatastructures.org/versions/edition-
//        0.1e/ods-java/5_1_ChainedHashTable_Hashin.html, CC-BY-2.5-CA, Reference:
//        https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/SeparateChainingHashST.java.html,
//        GPLv3)
public class Test {
    public static void main(String[] args) {
//        String keys[]={"a", "a", "a", "a"};
        String keys[] = {"a", "b", "c", "d", "a", "a", "e", "c", "d", "a"};
        SimpleChainHashTable ht = new SimpleChainHashTable(1);
        for (int i = 0; i < keys.length; i++) ht.put(keys[i]);
        ht.print();
    }
}
