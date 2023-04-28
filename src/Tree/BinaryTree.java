package Tree;


import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int d){
        data = d;
        left=right = null;
    }
}
public class BinaryTree {
    //data
    Node root;





    //methods

    BinaryTree(){
        //hardcode
        Scanner sc = new Scanner(System.in);
        root = buildTree(sc);




        //read a tree
    }

    Node buildTree(Scanner sc){
        int data = sc.nextInt();

        if(data ==-1){
            return null;
        }
        Node temp = new Node(data);
        temp.left=buildTree(sc);
        temp.right=buildTree(sc);
        return temp;

    }

    void print(){
        this.inOrderPrint(root);

    }

    void preOrderPrint(Node root){
        if(root==null){
            return;
        }

        preOrderPrint(root.left);
        preOrderPrint(root.right);
        System.out.println(root.data);


    }

    void inOrderPrint(Node root){
        if(root==null){
            return;
        }

        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);


    }

    void postOrderPrint(Node root){
        if(root==null){
            return;
        }
        postOrderPrint(root.left);
        System.out.print(root.data + " ");
        postOrderPrint(root.right);

    }

    int getHeight(){
        return height(root);
    }

    //internal logic should not be exposed to outside world
    private int height(Node root){
        if(root ==null){
            return 0;
        }

        int h1 =height(root.left);
        int h2 = height(root.right);
        return Math.max(h1,h2)+1;
    }

    int sum(){
        return sumOfNodes(root);
    }
    private int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        return sumOfNodes(root.left) +sumOfNodes(root.right) +root.data;

    }



}
