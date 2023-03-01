import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Target
        err: for (int i = 0; i < 10; i++) {

            l2: for (int j = 10; j > 0; j--) {
                if (i != j) {
                  System.out.println(i);
                  break l1;
                } else{
                  System.out.println("-->>" + i);
                  continue l2;
                }
            }
        }
    }
}