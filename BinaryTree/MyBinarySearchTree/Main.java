package JavaDSA.BinaryTree.MyBinarySearchTree;

public class Main {
    
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(6);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);
        tree.insert(7);
        tree.insert(10);

        tree.preOrderTraverse();
        System.out.println();
        tree.inOrderTraverse();
        System.out.println();
        tree.postOrderTraverse();
        System.out.println();
        System.out.println(tree.levelOrderTraverse());
        System.out.println(tree.depth(6));
        System.out.println(tree.getHeight());
        System.out.println(tree.nodeAtK(1));

        
    }
}
