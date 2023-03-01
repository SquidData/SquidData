import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean a = true

        //Target 1
        boolean b = true && a;

        //Target 2
        boolean z = false && a;

        //Target 3
        boolean u = a && true;

        boolean c = false;

        boolean d = a && c;
    }
}
