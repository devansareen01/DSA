class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    public int isPairPresent(Node root, int target)
    {
        Set<Integer> set = new HashSet<>();
        boolean ans = util (root , target , set);
        
       return  ans ?1:0;
        
    }
    
    public boolean util(Node root, int target,Set<Integer> set){
        if(root == null) return false;
        
        if(util(root.left , target ,set)== true){
            return true;
        }
        if(set.contains(target - root.data)){
            return true;
        }
        set.add(root.data);
        return (util(root.right, target , set));
    }
}
