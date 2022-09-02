import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
     public static String removeDuplicates(String s) {
        String ans = "";
        HashMap<Character, Boolean> seen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (seen.containsKey(s.charAt(i)))
                continue;
            else {
                ans += s.charAt(i);
                seen.put(s.charAt(i), true);
            }
        }
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine(); 
         name = removeDuplicates(name);               // Reading input from STDIN
        System.out.println(name);    // Writing output to STDOUT
           
    }
}
