import java.util.*;
public class A {
    public void F(String[] args) {
    }
}
public class B extends A {
    public void F(String[] args) {
        C c = new C();
        D d;
        //Target 1
        d = (D) c;
        D e = new D();
        c = (C) e;
    }
}
public class C {
    public void G(String[] args) {
        A a = new A();
        B b;
        //Target 2
        b = (B) a;
    }
}
public class D extends C {
     public void G(String[] args) {
    }
}
