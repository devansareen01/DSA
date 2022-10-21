import java.util.Scanner;

public class paintFence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int f = scn.nextInt();// no. of fences
        int c = scn.nextInt();// no. of colours
        long same = c * 1;
        long diff = c * (c - 1);
        long total = same + diff;
        for (int i = 3; i <= f; i++) {
            same = diff * 1;// current same is same as previous diff
            diff = total * (c - 1);// we always have(c-1) choices for next fence
            total = same + diff;

        }
        System.out.println(total);
    }
}
