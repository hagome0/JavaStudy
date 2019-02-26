package ch14;
import java.util.LinkedList;
//// Reference: http://opendatastructures.org/versions/edition-0.1e/ods-java/5_1_ChainedHashTable_Hashin.html, CCBY-
//        2.5-CA
//// Reference: https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/SeparateChainingHashST.java.html, GPLv3
public class SimpleChainHashTable {
    private int HashTableSize;
    private int count;
    LinkedList<Object> hashTable[];
    public SimpleChainHashTable(int size) {
        HashTableSize=size;
        hashTable=new LinkedList[HashTableSize];
        for (int i = 0; i < hashTable.length; i++) hashTable[i]=new LinkedList<>();
    }
    public boolean put(Object key) {
        if (count==HashTableSize)resize();
        if(get(key)!=null) return false;
        hashTable[hash(key)].add(key);
        count++;
        return true;
    }
    private void resize() {
        HashTableSize*=2; //크기 2배
        // 2배 늘린 연결리스트
         LinkedList<Object> newTable[] = new LinkedList[HashTableSize];
        for (int i = 0; i < newTable.length; i++) {
            newTable[i] = new LinkedList<>();
        }
        for (int i = 0; i < hashTable.length; i++) {
            for (Object key: hashTable[i]) {
                newTable[hash(key)].add(key);
            }
        }
        //테이블 바꾸기
        hashTable = newTable;
    }
    private int hash(Object key) {
        return (key.hashCode()&0x7FFFFFFF)%HashTableSize;
    }
    public Object get(Object key) {
        for (Object v : hashTable[hash(key)]) if(v.equals(key)) return v;
        return null;
    }
      public void print() {
          for (int i = 0; i < hashTable.length; i++) {
              System.out.println(i + "=>" + hashTable[i]);
          }
      }
}