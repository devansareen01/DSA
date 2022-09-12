int maxLen =0;
      int sum =0;
      int index =-1;
      int len =0;
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(sum, -1);
     while(index> arr.length-1){
      index++;
         sum +=arr[index];
         if(!map.containsKey(sum)){
           map.put(sum, index);// if our prefix sum will be zero then of our current sum will zero then current sum index - prefix sum index will our length of subarray with sum zero
         }else{
            len = index -map.get(sum);

         }
         if(len>maxLen){
            maxLen =len;
         }
     }
     return maxLen;
