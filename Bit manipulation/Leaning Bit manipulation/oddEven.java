public class Solution {
    public static String oddEven(int N){
      if( (N & 1) != 0 )
            return "odd";
        else
            return "even";
    }
}
