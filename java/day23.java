import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{


static void levelOrder(Node root){
      //Write your code here
        LinkedList<Node> queue = new LinkedList<Node>();
        String output = Integer.toString(root.data);
        queue.add(root);
        
        while(!queue.isEmpty()) {
            root = queue.removeFirst();
            if (root.left != null) {
                queue.addLast(root.left);
                output += (" " + root.left.data);
            }
            if (root.right != null) {
                queue.addLast(root.right);
                output += (" " + root.right.data);
            }      
        }
        System.out.println(output);
    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}