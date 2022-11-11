import java.util.*;

public class Main {
    public static int foo(int i) {
        int u = 1;
        int v = 2;

        u = u + i;

        // Target 1
        v = 1 + 1;

        v = v + 1;

        v = 1 + v;

        return (u + v);
    }

    public static int gkk(double j) {
        double u  = 1;
        double v = 2;

        u = u + j;

        // Target 2
        u = 2 * 1;

        return (u + v);
    }
}
