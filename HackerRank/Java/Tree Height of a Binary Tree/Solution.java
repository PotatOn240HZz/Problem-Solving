

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
        if(root==null)
            return -1;
        else if(root.left==null && root.right==null)
            return 0;
        else
            return(1+Math.max(height(root.left),height(root.right)));
    }



//https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem