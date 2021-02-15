import java.util.*;

public class ExpressionTree { 
  
  class Node {
    char data;
    Node right;
    Node left;
    Node(char ch) {
      data = ch;
      left = right = null;
    }
    private boolean isExternal() {
      return (left == null && right == null);
    }
  }
 
  public void inorder(Node root) {
    if (root != null) {
      inorder2(root);
    }
  }
    
  private void inorder2(Node root) {
    if (root.isExternal())
      System.out.print(root.data);
    else {
      System.out.print("(");
      inorder2(root.left);
      System.out.print(" " + root.data + " ");
      inorder2(root.right);
      System.out.print(")");
    }
  }
 
 boolean isSign(char ch) {
    if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
      return true;
    }
    return false;
  }
    
  Node createTree(char A[]) {
    Node n, nR, nL;
    Stack<Node> stack = new Stack<Node>();
    for (int i = 0; i < A.length; i++) {
      if (!isSign(A[i])) {
        n = new Node(A[i]);
        stack.push(n);
      } 
      else {
        n = new Node(A[i]);
        nR = stack.pop();
        nL = stack.pop();
        n.right = nR;
        n.left = nL;
        stack.push(n);
      }
    }
    n = stack.peek();
    stack.pop();
    return n;
  }
      
}
