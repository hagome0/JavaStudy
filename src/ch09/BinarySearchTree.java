package ch09;

import java.util.LinkedList;

//. (실습: 이진탐색트리) 다음은 이진탐색트리를 생성하는 코드이다. 아래 코드를 입력하고 실행
//        하면서 이진탐색트리 노드 삽입법을 익히시오. (Reference:
//        https://algs4.cs.princeton.edu/32bst/BST.java.html, GPLv3)
//        - 실습 #1: 아래 search 함수는 비재귀적으로 이진탐색을 수행한다. 이진탐색을 재귀적으로
//        수행하도록 다음 형식의 재귀호출함수 searchRecur()를 구현하시오.
//public BinaryTree search(int key) { return searchRecur(root, key); }
//private BinaryTree searchRecur(BinaryTree node, int key) { … }


//        - 실습 #2: 아래 add(int key) 함수는 재귀호출함수 add(BinaryTree tree, int key)를 통해 재귀적으로
//        구현되었다. add(int key) 함수를 비재귀적 방식으로 구현하시오.


//        - 실습 #3: 아래 main 함수의 마지막 문장이 정상 동작하도록 BinarySearchTree 클래스 내 inorder
//        함수를 구현하시오. inorder 함수는 이진탐색트리의 노드들을 inorder 순으로 방문하여 모든 key
//        값들을 문자열로 반환하는 함수이다. 아래 main 함수 마지막 문장의 실행 결과는 다음과 같다.
//        5 10 15 20 25 30 35 50 60 62 64 65 70 90
class BinarySearchTree {
    public static String inorder(BinaryTree tree) {
        if(tree == null) return "";
        return inorder(tree.left) + ' ' + tree.key + ' ' + inorder(tree.right);
    }

    public static String preorder(BinaryTree tree) {
        if(tree == null) return "";
        return  " " + tree.key + " "  + preorder(tree.left) + preorder(tree.right);
    }

    public static String postorder(BinaryTree tree) {
        if(tree == null) return "";
        return  postorder(tree.left) + postorder(tree.right) + " " + tree.key + " ";
    }

    class BinaryTree {
        int key;
        BinaryTree left, right;

        public BinaryTree(int key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return Integer.toString(key);
        }
    }

    BinaryTree root;

    public void add(int key) {
        root = add(root, key);
    }

    private BinaryTree add(BinaryTree tree, int key) {
//        if (tree == null) return new BinaryTree(key);
//        if (tree.key < key) tree.right = add(tree.right, key);
//        else if (tree.key > key) tree.left = add(tree.left, key);
//        else ; // value 삽입 시 else tree.value=value;
//        return tree;

        if (tree == null) return new BinaryTree(key);
        BinaryTree current = tree;
        BinaryTree parent = null;

        while (current != null) {
            parent = current;

            if (current.key > key) current = current.left;
            else current = current.right;
        }

        if (parent.key < key) parent.right = new BinaryTree(key);
        else parent.left = new BinaryTree(key);
        return tree;
    }

    public BinaryTree searchRecur(BinaryTree node, int key) {
        if (node == null) return node;
        if (node.key == key) return node;
        if (node.key < key) node = node.right;
        else node = node.left;

        return searchRecur(node, key);
    }

    public BinaryTree search(int key) {
//        BinaryTree node = root;
//        while (node != null) {
//            if (node.key == key) return node;
//            if (node.key < key) node = node.right;
//            else node = node.left;
//        }
//        return node;
        return searchRecur(root, key);
    }

    @Override
    public String toString() {
        return levelOrder().toString();
    }

    private LinkedList<BinaryTree> levelOrder() {
        LinkedList<BinaryTree> list = new LinkedList<>();
        LinkedList<BinaryTree> queue = new LinkedList<>();
        if (root != null) queue.addLast(root);
        while (!queue.isEmpty()) {
            BinaryTree node = queue.removeFirst();
            list.add(node);
            if (node.left != null) queue.addLast(node.left);
            if (node.right != null) queue.addLast(node.right);
        }
        return list;
    }
}