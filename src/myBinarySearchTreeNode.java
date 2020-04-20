class myBinarySearchTreeNode {
  
  int myValue;

  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;

  myBinarySearchTreeNode(int inValue) {
    // created a new node with empty child pointers
    myValue = inValue;
    left = null;
    right = null;
  }

  myBinarySearchTreeNode(int[] A) {
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
    myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A[0]);
    myValue = A[0];
    for (int i = 1; i < A.length; i++) {
      this.insert(A[i]);
    }
  }

  // This method takes a new integer as input and decides
  // if it should be place:
  //    * as the left child,
  //    * as the right child,
  //    * in the left subtree,
  //    * or in the right subtree.
  // If the value already exists in the tree, no action is taken.

  public void insert(int inValue) {
    if (inValue > myValue) {
      if (right == null) {
        right = new myBinarySearchTreeNode(inValue);
      } else {
        //recursive
        right.insert(inValue);
      }
    } else if (inValue < myValue) {
      if (left == null) {
        left = new myBinarySearchTreeNode(inValue);
      } else {
        left.insert(inValue);
      }
    } else {
      System.out.println("Error");
      return;
    }
  }




  // This method recursively calculates the height of the entire (sub)tree.
  // This method will take O(n) time
  public int height(){

    int rightHeight = 0;
    int leftHeight = 0;
    if(left != null) {
      leftHeight += left.height();
    }
    if(right != null) {
      rightHeight += right.height();
    }
    if(right == null && left == null){
      return 0;
    }else {
      if (rightHeight > leftHeight) {
        return rightHeight + 1;
      } else {
        return leftHeight + 1;
      }
    }
  }
  // This method recursively calculates the depth of a given search value.
  // If the given value is not in the tree, this method returns -1.
  // Note that if the tree is a proper BST, this method should complete in O(log n) time.
  // Additionally, remember that the depth is the number of nodes on the path from a node to the root
  // (i.e. the number of the recursive calls).
  public int depth(int search) {

    if(search < myValue){
      if(left == null){
        return -1;
      }
      //goes left
      return left.depth(search) + 1;
    }
    if(search > myValue){
      if(right == null){
        return -1;
      }
      //goes right
      return right.depth(search) + 1;
    }
    if(search == myValue){
      return 0;
    }
    return -1;
  }
  // recursive method to calculate binary tree node
  public int size(){
    int sum = 0;
    if (left != null){
      sum += left.size();
    }
    if (right != null){
      sum += right.size();

    }
    return sum + 1  ;
  }
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }

}