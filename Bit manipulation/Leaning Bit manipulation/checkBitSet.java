class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        int mask = 1 << k; // creating mask using left shift
        
        if((mask & n) != 0) // if bit is not set then it will always give 0
            return true;
        
        return false;
    }
    
}
