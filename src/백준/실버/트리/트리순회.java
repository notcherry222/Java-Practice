package 백준.실버.트리;

import java.io.*;
import java.util.*;

/**
 * 1991
 */
public class 트리순회 {
    static int n;
    static Node head = new Node('A', null,null);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

       for(int i =0; i<n;i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());

           char root = st.nextToken().charAt(0);
           char left = st.nextToken().charAt(0);
           char right = st.nextToken().charAt(0);

           createNode(head, root, left, right);
       }
       preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);
        System.out.println();
    }
    static class Node{
        char value;
        Node left;
        Node right;
        Node(char value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    static void createNode(Node temp, char root, char left, char right) {
        if(temp.value == root) {
            temp.left = (left == '.' ? null : new Node(left, null, null));
            temp.right = (right == '.' ? null : new Node(right, null, null));
        }
        else {
            if(temp.left != null) createNode(temp.left, root, left, right);
            if(temp.right != null) createNode(temp.right, root, left, right);
        }
    }

    static void preOrder(Node node) {
        if(node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
    static void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }
    static void postOrder(Node node) {
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }
}
