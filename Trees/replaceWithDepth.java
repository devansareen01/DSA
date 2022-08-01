 public static void ReplaceNodeWithDepth(TreeNode<Integer> root,int depth) //we have to replace the node data with its depth 
    {
       root.data = depth;
       for(int i = 0;i<root.children.size();i++)
       {
           ReplaceNodeWithDepth(root.children.get(i), depth + 1);
       }
    }
