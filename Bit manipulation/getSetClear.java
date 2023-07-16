class Solution {
    static void bitManipulation(int num, int i) {
        
        int mask = 1 << i-1 ;// creating mask by left shift of i
        if( (mask & num) != 0)
             System.out.print( "1" +" ");
        else
            System.out.print( "0" +" ");
        
        System.out.print( (num | mask) +" "); // by using or operator ith bit will set
        
        mask = ~ mask;
        System.out.print( num & mask );// it will clear the ith bit
        
    }
}
