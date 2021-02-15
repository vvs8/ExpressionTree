class Main {
  public static void main(String[] args) {
        
    ExpressionTree tree = new ExpressionTree();
    String test = "12+34*5-*2/";
    ExpressionTree.Node root = tree.createTree(test.toCharArray());
    tree.inorder(root);
    
  }
}
