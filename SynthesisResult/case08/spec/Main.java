import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean a = args[0] < args[1];
        boolean b = args[0] < args[2];

        //Target
        if (a != true) {
            System.out.println("Hello World!");
        }

        //Target
        if (true == a) {
            System.out.println("Hello World!");
        }

        if (a == b) {
            System.out.println("Hello World!");
        }
    }
}
