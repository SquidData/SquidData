import java.util.*;

public class Main {
    //Target
    public static void f(Boolean b, String[] args) {
        if (b) {
            System.out.println("Hello World!");
        }
    }

    //Target
    public static void g(Boolean c, String[] args) {
        if (c) {
            System.out.println("Bye!");
        }

        if (args[0] > args[1]) {
            System.out.println("Hello World!");
        }
    }

    public static void h(Boolean c, String[] args) {
        if (args[0] > args[1]) {
            System.out.println("Hello World!");
        }
    }

    public static void u(Boolean c, String[] args) {
        a = args[0]
        b = args[1]
        Boolean d = true;
        if (d) {
            System.out.println("Hello World!");
        }
    }
}
