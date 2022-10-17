import java.util.*;

public class countOfBinaryStrings {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int oldzeros = 1;//
        int oldones = 1;

        for (int i = 2; i <= n; i++) {
            int nzeros = oldones;
            int nones = oldones + oldzeros;

            oldones = nones;
            oldzeros = nzeros;
        }
        System.out.println(oldones + oldzeros);

    }
}
