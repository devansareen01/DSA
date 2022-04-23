import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scan =new Scanner(System.in);
  int num=scan.nextInt();
  int i=2;
  while(num>1){
      if(num%i==0){
          System.out.print(i+" ");
          num=num/i;
      }
      else{
          i++;
      }
      
      
      
  }
  
 }
}
