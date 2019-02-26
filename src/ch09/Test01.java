package ch09;

public class Test01 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
//        int n[] = {50, 20, 70, 10, 30, 5, 15, 25, 60, 90, 62, 65, 64, 35};
        int n[] = {7,4,2,5,9};
        for (int i = 0; i < n.length; i++) tree.add(n[i]);
        System.out.println(tree.search(30));
        System.out.println(tree.search(33));
        System.out.println(tree);
        System.out.println(BinarySearchTree.inorder(tree.root));
        System.out.println(BinarySearchTree.preorder(tree.root));
        System.out.println(BinarySearchTree.postorder(tree.root));
    }
}

