import java.util.*;

public class rotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int nod = 0;
        int temp = n; // a variable for temporary storing the number n

        while (temp != 0) { // for counting number of digits
            temp /= 10;
            nod++;
        }
        k = k % nod;
        if (k < 0) { // if k is negative than we have to increase value of k
            k = k + nod;
        }
        int div = 1;
        int multi = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div *= 10; // if i is less than k we will increase divisor
            } else {
                multi *= 10; // if i is more than k we will increase mutliplier
            }
        }
        int first = n / div; // it will exctratct rotating numbers
        int last = n % div; // it will give rotating numberss
        int r = last * multi + first; // forming rotated number
        System.out.println(r);

    }

}
