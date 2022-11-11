import java.util.*;

public class A {
    public void F(String[] args) {
    }
}
public class B extends A {
    //Target 1
    public void F(String[] args) {
    }
}
public class C {
    public void G(String[] args) {
    }
}
public class D extends C {
    //Target 2
     public void G(String[] args) {
    }
}
public class E {
    public void S(String[] args) {
    }
}
public class F extends E {
     public void H(String[] args) {
    }
}
