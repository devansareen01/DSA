import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            printSS(str,"");
            
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
            char ch = str.charAt(0);
            
            String roq = str.substring(1);  //roq stands for rest of the question 
            
            printSS(roq,ans+ch);        //  let assume numerator--> ques and denominator-->ans which is intially blank
                                        //there are 2 cases yes or no agar yes to ans will attached further agr no to answer hi akela jaye ga agle ka answer bhi wohi
                                        // 
            printSS(roq,ans +"");
    }

}
