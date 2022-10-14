import java.util.*;

public class ArrangeBuildings {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int build = 1;
        int space = 1;
        for (int i = 2; i <= n; i++) {
            int newBuild = space;
            int newSpace = build + space;

            build = newBuild;
            space = newSpace;
        }

        System.out.println((build + space) * (build + space));
    }
}
