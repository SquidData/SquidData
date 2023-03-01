import java.util.*;

public class Main {

    public void main(String[] args) {
        this.h(1);
        System.out.println("Hello World!");
    }

    public void h(int i) {
        System.out.println("Hello World!");
    }

    //Target
    private int f(int i) {
        if (i > 0) {
            this.g(i-1);
        }
    }

    //Target
    public void g(int i) {
        if (i > 0) {
            this.f(i - 1);
        }
    }
}
