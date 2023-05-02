import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m, int k) {
        // first we will check for the smallest array 

        if(n > m){
            return kthElement(arr2 , m , arr1 , n , k);
        }

        // low will be the maximum of 0 and k-m means if k is greater than m then i have to pick minimum k- m elements from arr1
        int low = Math.max(0, k-m);
        
        // high will be the minimum of k and n means if k is greater than n then i can only pick n elemtns from arr1 not k 

        int high = Math.min(k, n);

        while(low <= high){
            
            int cut1 = (low + high)/2; 
            int cut2 = k- cut1;

            int l1 = cut1 ==0 ?Integer.MIN_VALUE : arr1.get(cut1-1);
            int l2 = cut2 ==0 ?Integer.MIN_VALUE : arr2.get(cut2-1);
            int r1 = cut1 ==n ?Integer.MAX_VALUE : arr1.get(cut1);
            int r2 = cut2 ==m ?Integer.MAX_VALUE : arr2.get(cut2);

            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1, l2);
            }else if(l1 > l2){ // means we have to decrease l1
                high = cut1-1;

            }else{
                low = cut1 +1;
            }

        }
        return -1;
    }
}
