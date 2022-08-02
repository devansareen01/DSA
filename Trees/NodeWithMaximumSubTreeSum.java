static int ms = Integer.MIN_VALUE;  //global variables 
    static int msn = 0;
    public static int ReturnSumCalcMaxsumSubtree(TreeNode<Integer> root)  //by travel and change strategy we are returning sum of every subtree and in the way we will get opportunity to find maximum subtree sum also for that we are maintaining the global variables to store the maximum values 
    {
       int sum = 0;
       for(int i = 0;i<root.children.size();i++)
       {
           int csum = ReturnSumCalcMaxsumSubtree(root.children.get(i));
           sum += csum; //adding in the postorder first left child will be added then right then outside the loop root will be added in the sum 
       }
       sum+=root.data;
       if(sum > ms)
       {
         ms = sum;
         msn = root.data;
       }
       return sum;
    } 
