import java.util.*;

//Target
public class A {
    void D(String[] args) {
    }
}


public class B extends A {
     void E(String[] args) {
    }
}

//Target
public class E {
    void D(String[] args) {
    }
}

//Target
public class F extends E {
     void E(String[] args) {
    }
}


public class G extends F {
     void H(String[] args) {
    }
}

public class C {
     void F(String[] args) {
    }
}
