package JavaDSA.BinaryTree.MyBinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    //constructor
    public TreeNode(int data){
        this.data = data;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    private TreeNode insert(TreeNode root, int value){ //Recursive
        //base condition
        if(root == null){
            // System.out.println("Root is empty, Inserted " + value);
            root = new TreeNode(value);
            return root;
        }

        if(value < root.data){
            // System.out.println(value + " less than "+ root.data);
            // System.out.println("Going left");
            root.leftChild = insert(root.leftChild, value);
            
        
        } else {
            // System.out.println(value + " Greater than " + root.data);
            // System.out.println("Going right");
            root.rightChild = insert(root.rightChild, value);
            
        }

        return root;
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private TreeNode find(TreeNode root, int value){

        //base condition
        if(root == null){
            return null;
        }
        if(root.data == value){
            return root;
        }

        if(value <= root.data){
            //go left
            return find(root.leftChild, value);
        } else {
            //go right
            return find(root.rightChild, value);
        }

    }

    public TreeNode find(int value){
        return find(root, value);
    }

    private void preOrderTraverse(TreeNode root){// ROOT -> LEFT -> RIGHT
        //base condition
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");

        //go left
        preOrderTraverse(root.leftChild);

        //go right
        preOrderTraverse(root.rightChild);
    }

    public void preOrderTraverse(){
        preOrderTraverse(root);
    }

    private void inOrderTraverse(TreeNode root){//LEFT -> ROOT -> RIGHT
        //base condition
        if(root == null){
            return;
        }

        //go left
        inOrderTraverse(root.leftChild);

        System.out.print(root.data + " ");//root
        
        //go right
        inOrderTraverse(root.rightChild);
    }

    public void inOrderTraverse(){
        inOrderTraverse(root);
    }

    private void postOrderTraverse(TreeNode root){//LEFT -> RIGHT -> ROOT
        //base condition
        if(root == null){
            return;
        }

        //go left
        postOrderTraverse(root.leftChild);

        //go right
        postOrderTraverse(root.rightChild);

        System.out.print(root.data + " ");//root
    }

    public void postOrderTraverse(){
        postOrderTraverse(root);
    }
    
    public List<Integer> levelOrderTraverse(){
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> nodes = new ArrayList<>();
        q.offer(root);

        while(!q.isEmpty()){ //while q not empty
            TreeNode node = q.poll();
            nodes.add(node.data);
            // to handle null nodes
            if(node.leftChild != null ) q.offer(node.leftChild);

            if(node.rightChild != null ) q.offer(node.rightChild);
        }

        return nodes;
    }

    private int depth(TreeNode root, int value, int dept){
        if(root == null) return -1;// value not found

        if(root.data == value){
            return dept;// when value found return dept value 
        }

        //binary search logic
        if(value < root.data){
            return depth(root.leftChild, value, dept+1);// whenever we call the function, we go 1 node deep hence dept+1
            //return because we want the dept value to come to top while backtracking
        }
        return depth(root.rightChild, value, dept+1);
    }

    public int depth(int value){
        return depth(root, value, 0); // first node has depth of 0
    }

    private int heightOfTree(TreeNode root){
        if(root == null) return -1; //this will help in MAX function

        if(root.leftChild == null && root.rightChild == null){
            return 0;// leaf has 0 height
        }

        int treeHeight = 1 + Math.max(heightOfTree(root.leftChild), heightOfTree(root.leftChild));

        return treeHeight;
    }

    public int getHeight(){
        return heightOfTree(root);
    }

    public int heightOfNode(int value){
        //find the node
        TreeNode node = find(root, value);

        if(node != null){
            return heightOfTree(node);
        }
        return -1;
    }

    private void nodeAtK(TreeNode root, int k, List<Integer> result){
        if(root == null) return;

        if(k == 0){
            result.add(root.data);
        }
        //go left
        nodeAtK(root.leftChild, k-1, result);
        //go right
        nodeAtK(root.rightChild, k-1, result);
    }

    public List<Integer> nodeAtK(int k){
        List<Integer> result = new ArrayList<>();
        nodeAtK(root, k, result);
        return result;
    }

}
